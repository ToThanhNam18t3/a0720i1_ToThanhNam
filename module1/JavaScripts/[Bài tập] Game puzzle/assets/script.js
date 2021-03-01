let carA = document.getElementById("carA");
let carB = document.getElementById("carB");
let carC = document.getElementById("carC");
let carD = document.getElementById("carD");
let carE = document.getElementById("carE");

function changeimage(num) {
    switch(num) {
        case 1:
            if (carA.getAttribute('src') === "./assets/image/Hinh 1a.png") {
                carA.src = "./assets/image/Hinh 2a.png";
            } else if (carA.getAttribute('src') === "./assets/image/Hinh 2a.png") {
                carA.src = "./assets/image/Hinh 3a.png";
            } else if (carA.getAttribute('src') === "./assets/image/Hinh 3a.png") {
                carA.src = "./assets/image/Hinh 1a.png";
            }
            break;
        case 2:
            if (carB.getAttribute('src') === "./assets/image/Hinh 1b.png") {
                carB.src = "./assets/image/Hinh 2b.png";
            } else if (carB.getAttribute('src') === "./assets/image/Hinh 2b.png") {
                carB.src = "./assets/image/Hinh 3b.png";
            } else if (carB.getAttribute('src') === "./assets/image/Hinh 3b.png") {
                carB.src = "./assets/image/Hinh 1b.png";
            }
            break;
        case 3:
            if (carC.getAttribute('src') === "./assets/image/Hinh 1c.png") {
                carC.src = "./assets/image/Hinh 2c.png";
            } else if (carC.getAttribute('src') === "./assets/image/Hinh 2c.png") {
                carC.src = "./assets/image/Hinh 3c.png";
            } else if (carC.getAttribute('src') === "./assets/image/Hinh 3c.png") {
                carC.src = "./assets/image/Hinh 1c.png";
            }
            break;
        case 4:
            if (carD.getAttribute('src') === "./assets/image/Hinh 1d.png") {
                carD.src = "./assets/image/Hinh 2d.png";
            } else if (carD.getAttribute('src') === "./assets/image/Hinh 2d.png") {
                carD.src = "./assets/image/Hinh 3d.png";
            } else if (carD.getAttribute('src') === "./assets/image/Hinh 3d.png") {
                carD.src = "./assets/image/Hinh 1d.png";
            }
            break;
        case 5: {
            if (carE.getAttribute('src') === "./assets/image/Hinh 1e.png") {
                carE.src = "./assets/image/Hinh 2e.png";
            } else if (carE.getAttribute('src') === "./assets/image/Hinh 2e.png") {
                carE.src = "./assets/image/Hinh 3e.png";
            } else if (carE.getAttribute('src') === "./assets/image/Hinh 3e.png") {
                carE.src = "./assets/image/Hinh 1e.png";
            }
            break;
        }
    }
        checkImage();
}       
    
function checkImage(){
    if(carA.getAttribute('src') === "./assets/image/Hinh 1a.png"
    && carB.getAttribute('src') === "./assets/image/Hinh 1b.png"
    && carC.getAttribute('src') === "./assets/image/Hinh 1c.png"
    && carD.getAttribute('src') === "./assets/image/Hinh 1d.png"
    && carE.getAttribute('src') === "./assets/image/Hinh 1e.png" ) {
        alert("hello");
        return;
    }
}



