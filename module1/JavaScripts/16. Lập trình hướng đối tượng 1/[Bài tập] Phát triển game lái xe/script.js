// let myGamePiece;

// var myGameArea = {
//     canvas: document.createElement("canvas"),
//     start: function () {
//         this.canvas.width = 480;
//         this.canvas.height = 270;
//         this.context = this.canvas.getContext("2d");
//         document.body.insertBefore(this.canvas, document.body.childNodes[0]);
//         this.frameNo = 0;
//         this.interval = setInterval(updateGameArea, 20);
//     },
//     clear: function () {
//         this.context.clearRect(0, 0, this.canvas.width, this.canvas.height);
//     },
//     stop: function () {
//         clearInterval(this.interval);
//     }
// }


// function startGame() {
//     myGamePiece = new component(30, 30, "down1.png", 125, 225, "image");
//     myGameArea.start();
// }

// class component {
//     constructor(width, height, color, x, y, type) {
//         this.width = width;
//         this.height = height;
//         this.color = color;
//         this.speedX = x;
//         this.speedY = y;
//         this.type = type;
//         this.updade = function () {
//             ctx = myGameArea.context;
//             if (type == "image") {
//                 ctx.drawImage(this.image,
//                     this.x,
//                     this.y,
//                     this.width, this.height);
//             } else {
//                 ctx.fillStyle = color;
//                 ctx.fillRect(this.x, this.y, this.width, this.height);
//             }
//         }
//         this.newPos = function () {
//             this.x += this.speedX;
//             this.y += this.speedY;
//         }
//     }
// }

// function updateGameArea() {
//     myGameArea.clear();
//     myGamePiece.newPos();
//     myGamePiece.update();
// }

// function moveup() {
//     myGamePiece.speedY = -1; 
// }

// function movedown() {
//     myGamePiece.speedY = 1; 
// }

// function moveleft() {
//     myGamePiece.speedX = -1; 
// }

// function moveright() {
//     myGamePiece.speedX = 1; 
// }

// function clearmove() {
//     myGamePiece.speedX = 0; 
//     myGamePiece.speedY = 0; 
// }