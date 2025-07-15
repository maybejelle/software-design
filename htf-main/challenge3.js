const BASE_URL = "https://exs-htf-2024.azurewebsites.net/api/";
const TEAM_ID = "Team ED9B141F-824F-4BED-BDC9-AE021E97F778";

fetch(BASE_URL + "challenges/navigator", {
  method: "GET",
  headers: {
    "Content-Type": "application/json",
    Authorization: TEAM_ID,
  },
})
  .then((response) => response.json())
  .then((data) => handleData(data));

function handleData(data) {
  const navigationType = data.navigationType;
  const pointData = data.pointData;

  let paths = explorePaths(pointData, "You", []);

  const distances = findDistances(paths);

  if(navigationType === "ShortestPath"){
    const shortestPath = paths[distances.indexOf(Math.min(...distances))].map((point) => point.label);
    sendResponse(["You", ...shortestPath]);

  }else{
    const longestPath = paths[distances.indexOf(Math.max(...distances))].map(
      (point) => point.label
    );
    sendResponse(["You",...longestPath]);

  }


}

function explorePaths(pointData, currentPoint, currentPath) {
  const node = pointData.find((point) => point.label === currentPoint);
  let paths = [];

  if (node.label === "S42") {
    paths.push([...currentPath]);
    return paths;
  }

  for (const [label, distance] of Object.entries(node.connections)) {
    const newPaths = explorePaths(pointData, label, [
      ...currentPath,
      { label, distance },
    ]);
    paths = paths.concat(newPaths);
  }

  return paths;
}

function sendResponse(data) {
  fetch(BASE_URL + "challenges/navigator", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      Authorization: "Team ED9B141F-824F-4BED-BDC9-AE021E97F778",
    },
    body: JSON.stringify({ answer: data }),
  })
    .then((response) => response.json())
    .then((data) => console.log(data));
}

function findDistances(paths) {
  let distances = [];
  paths.forEach((path) => {
    let distance = 0;
    path.forEach((point) => {
      distance += point.distance;
    });
    distances.push(distance);
  });
    return distances;
}
