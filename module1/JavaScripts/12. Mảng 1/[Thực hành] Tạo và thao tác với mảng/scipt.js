let x = 0;
let array = Array(); // tạo 1 mảng trống
let addElm = document.getElementById('btnAdd');
let displayElm = document.getElementById('btnDisplay');

// function addElement() {
//     array[x] = document.getElementById("info").value;
//     alert("Element: " + array[x] + " Added at index " + x);
//     x++;
// }

// function displayElement() {
//     let e = "<hr/>";
//     for (let i = 0; i < array.length; i++) {
//         e += "Element " + i + " = " + array[i] + "<br/>";
//     }
//     document.getElementById("result").innerHTML = e;
// }

addElm.addEventListener('click',function(add){
    array[x] = document.getElementById('info').value;
    alert("Element" + array[x] + "was added at index " + x);
    x++;
})

displayElm.addEventListener('click', function(display){
    let e = "<hr/>";
    for (let i = 0; i <= array.length; i++) {
        e += "Element " + i + " = " + array[i] + "<br/>"; 
    }
    document.getElementById('result').innerHTML = e;
})