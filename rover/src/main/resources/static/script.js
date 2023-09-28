createMap();

async function createMap() {
    refreshRover();

    // Obtener la informacion de los obstaculos
    let obstacleResponse = await fetch('/api/obstacle/', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    });
    let obstaclesJson = await obstacleResponse.json();

    obstaclesJson.forEach(obstacleJson => {
        createRock(obstacleJson.x, obstacleJson.y);
    });
}

async function refreshRover() {
    let roverResponse = await fetch('/api/rover/', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    });
    let roverJson = await roverResponse.json();
    moveRover(roverJson.x, roverJson.y);
}

function moveRover(x, y) {
    document.getElementById("rover").style.left = (x * 100) + 'px'
    document.getElementById("rover").style.top = (y * 100) + 'px';
    playMoveSound();
}

function createRock(x, y) {
    var rock = document.createElement("img");
    rock.setAttribute("src", "images/rock.png");
    rock.setAttribute("class", "rock");
    var container = document.getElementById("container");
    container.appendChild(rock);
    rock.style.left = (x * 100) + 'px'
    rock.style.top = (y * 100) + 'px';
}

var posX = 0;
var posY = 0;

function clickBtnRotateLeft() {
    sendCommand("L");
}

function clickBtnRotateRight() {
    sendCommand("R");
}

async function moveForward() {
    sendCommand("F");
}

function moveBack() {
    sendCommand("B");
}

async function sendCommand(command) {
    let requestBody = {
        "commands": [command]
    };

    await fetch('/api/rover/command/', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(requestBody)
    });
    await refreshRover();
}

function playMoveSound() {
    var audioElement = document.createElement("audio");
    audioElement.src = "sounds/move.wav";
    audioElement.controls = true;
    audioElement.autoplay = true;
    document.getElementById("container").appendChild(audioElement);
}