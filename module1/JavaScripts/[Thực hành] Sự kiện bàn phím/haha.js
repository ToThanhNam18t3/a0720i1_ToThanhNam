
function goUpPress() {
    var element = document.getElementById("shizuka");
    element.style.top = parseInt(element.style.top) - 50 + 'px';
}

function goDownPress() { 
    var element = document.getElementById("shizuka");
    element.style.top = parseInt(element.style.top) + 50 + 'px';
}

function goLeftPress() {
    var element = document.getElementById("shizuka");
    element.style.left = parseInt(element.style.left) - 50 + 'px';
}

function goRightPress() {
    var element = document.getElementById("shizuka");
    element.style.left = parseInt(element.style.left) + 50 + 'px';
}

// Hàm nhận các phím trên

// function moveSelection(evt) {

//     switch (evt.keyCode) {  //sai ten property
//         case 37 : 
//             goLeftPress();
//             break;
//         case 38:
//             goUpPress();
//             break;
//         case 39:
//             goRightPress();
//             break;
//         case 40:
//             goDownPress();
//             break;
//     }
// }
/**
 * controller = {
 *  a : () => a function here
 * }
 * 
 * suy ra a laf method cua controller
 * a tra ve 1 function
 * 
 * suy ra controller["a"] se tra ve 1 function
 * 
 * vi the ta co the call cai function do gian tiep bang cach controller["a"]()
 * 
 * app dungj vao bai toan: biet truoc duoc khi nao can goi ham nao (giong switch case ) minh co the ap dungj cach nay
 * 
 * //
 * controller la 1 cai function co san de dieu khien hay la ten minh tu dat ?
 *-> controller la 1 object vaf ten la minh tu dat 


 * cai e la gi v :v 
 * -> cai nay ong hoc roi ma, arrow function co 1 tham so oc the bo (), e la event ak
 * de ti nua gg  , chua gap cai nay bao h @@
 *vc :))
 * cam on lan nua nha kaka sieu qua
 * de tui chi tai lieu cho doc ne
 * doc cai nay https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Property_Accessors
 * de hieu dc dong 82
 */

const controller = {
    37 : () => goLeftPress(),
    38 : () => goUpPress(),
    39 : () => goRightPress(),
    40 : () => goDownPress() 
}

// Hàm di chuyển

function docReady() {
    // window.addEventListener('keydown', moveSelection);
    window.addEventListener('keydown', e => {
        controller[e.keyCode]()  //mark
    });
}

