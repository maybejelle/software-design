const BASE_URL = "https://exs-htf-2024.azurewebsites.net/api/";
const TEAM_ID = "Team ED9B141F-824F-4BED-BDC9-AE021E97F778";

const MessageTypes = {
  EMERGENCY: "EMG",
  MAINTENANCE: "MNT",
  INFORMATION: "INF",
  REQUEST: "REQ",
  ACKNOWLEDGE: "ACK",
};

const EmergencyTypes = {
  SOS: "SOS",
  PAN: "PAN",
  FIR: "FIR",
  INT: "INT",
  MED: "MED",
};

const MaintenanceTypes = {
  CHK: "CHK",
  REP: "REP",
  REF: "REF",
  CLN: "CLN",
};

const InformationTypes = {
  MSG: "MSG",
};

const Messages = {
  EMG_SOS: "DISPATCHING RESCUE CREWS",
  EMG_PAN: "DISPATCHING RAPID-RESPONSE TEAM",
  EMG_FIR: "DISPATCHING FIREFIGHTING VESSEL",
  EMG_INT: "TRACKING UNIDENTIFIED CRAFT",
  EMG_MED: "DISPATCHING MEDICAL TEAM",
  MNT_CHK: "DISPATCHING INSPECTION CREW",
  MNT_REP: "DISPATCHING REPAIR CREW",
  MNT_REF: "DISPATCHING TANKER VESSEL",
  MNT_CLN: "DISPATCHING SPECIALIZED CLEANING CREW",
  INF_MSG: "ASTEROID TRAJECTORY NOTED",
  REQ: "DISPATCHING EMERGENCY-SUPPLY VESSEL",
};

function fetchProtocolData() {
  return fetch(`${BASE_URL}challenges/protocol`, {
    method: "GET",
    headers: {
      "Content-Type": "application/json",
      Authorization: TEAM_ID,
    },
  })
    .then((response) => response.json())
    .then((data) => handleData(data));
}

function handleData(data) {
  const message = convertToText(data.protocolMessage);
  const responseMessage = buildResponseMessage(message);
  const response = convertToBinary(responseMessage);
  sendResponse(response);
}

function convertToText(binaryMessage) {
  return binaryMessage
    .match(/.{1,8}/g)
    .map((byte) => String.fromCharCode(parseInt(byte, 2)))
    .join("");
}

function convertToBinary(text) {
  return text
    .split("")
    .map((char) => char.charCodeAt(0).toString(2).padStart(8, "0"))
    .join("");
}

function buildResponseMessage(message) {
  const [messageType, type, lat, lon] = message.split("#");
  let responseMessage = "";

  switch (messageType) {
    case MessageTypes.EMERGENCY:
      responseMessage = Messages[`EMG_${type}`];
      break;
    case MessageTypes.MAINTENANCE:
      responseMessage = Messages[`MNT_${type}`];
      break;
    case MessageTypes.INFORMATION:
      responseMessage = Messages[`INF_${type}`];
      break;
    case MessageTypes.REQUEST:
      responseMessage = Messages["REQ"];
      break;
    default:
      responseMessage = "UNKNOWN MESSAGE TYPE";
  }

  return `ACK#MSG#${getCorrectCoordinate(lat)}#${getCorrectCoordinate(
    lon
  )}#${responseMessage}#END`;
}

function getCorrectCoordinate(coordinate) {
  const [integer, decimals] = coordinate.split(".");
  return `${integer.padStart(3, "0")}.${(decimals || "").padEnd(4, "0")}`;
}

function sendResponse(message) {
  fetch(`${BASE_URL}challenges/protocol`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      Authorization: TEAM_ID,
    },
    body: JSON.stringify({ answer: message }),
  })
    .then((response) => response.json())
    .then((data) => console.log(data));
}


fetchProtocolData();
