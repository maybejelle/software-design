const BASE_URL = "https://exs-htf-2024.azurewebsites.net/api/";
const TEAM_ID = "Team ED9B141F-824F-4BED-BDC9-AE021E97F778";

// Fetch QR code data from API
async function fetchQRCodeData() {
  const response = await fetch(`${BASE_URL}challenges/qr-code`, {
    method: "GET",
    headers: {
      "Content-Type": "application/json",
      Authorization: TEAM_ID,
    },
  });
  const data = await response.json();
  handleData(data);
}

// Handle the data received and generate a response
async function handleData(data) {
  const keyCode = data.keyCode;
  const response = generateMatrix(keyCode);
  sendResponse(response);
}

// Generate a binary matrix from the given keyCode
function generateMatrix(keyCode) {
  const matrix = [];
  for (let i = 0; i < keyCode.length; i += 2) {
    const charCode = `${keyCode.charCodeAt(i).toString(2)}${keyCode
      .charCodeAt(i + 1)
      .toString(2)}`;
    matrix.push(charCode);
  }
  return matrix;
}

// Send the generated response back to the API
async function sendResponse(responseData) {
  try {
    const response = await fetch(`${BASE_URL}challenges/qr-code`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Authorization: TEAM_ID,
      },
      body: JSON.stringify({ answer: responseData }),
    });

    if (!response.ok) {
      throw new Error("Failed to send response.");
    }

    const data = await response.json();
    console.log("Response data:", data);
  } catch (error) {
    console.error("Error:", error);
  }
}

fetchQRCodeData();
