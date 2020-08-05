let imgSave = null;

imgsave = document.getElementById("ball__image");

function set() {
    imgSave = document.getElementById("ball__image");
    imgSave.style.position = 'relative';
    imgSave.style.left = '0px';
}

function moveRight() {
    imgSave.style.left = parseInt(imgSave.style.left) + 10 + 'px';
}

// Gọi hàm khi được tài lần đầu 
window.onload = set;