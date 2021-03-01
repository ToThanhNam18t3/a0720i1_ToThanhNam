let btn = document.getElementById('btn');
let option = document.getElementById('selection-number');
let printed = document.getElementById('ex1');
let printed2 = document.getElementById('mark2');
let printedArr = document.getElementById('ex2');


//POINT
btn.addEventListener('click',function(){
    printed.innerHTML = '';
    if(option.value == 1){
        missonOne();
    } else if (option.value == 2) {
        missonTwo();
    } else if (option.value == 3) {
        missonThree();
    } else if(option.value == 4){
        missonFour();
    } else if(option.value == 5){
        missonFive();
    } else if(option.value == 6) {
        missonSix();
    } else if(option.value == 7) {
        missonSeven();
    } else if(option.value == 8) {
        missonEight();
    }
})

function missonOne() {
    let a =['1', '2','11','16','3','4','20','15','5','6']; "<br/>"
    console.log(a);
    printed.innerHTML = "Mảng có sẵn :" + a;
    "<br/>"
    for(let i = 0; i < a.length; i++) {
        if(a[i] > 10) {
            printed.innerHTML = printed.textContent + a[i];
        }
    }   
}


function missonTwo() {
    let b = ['1', '2','11','16','3','4','20','15','5','6','7','8','10','9'];
    printedArr.innerHTML = b;
    let maxInNumber = Math.max.apply(Math, b);
    printed.innerHTML = "The bigest number is : " + maxInNumber;
    var position = b.indexOf('20');
    printed2.innerHTML= 'Position of max in array is : ' + position; 
}

function missonThree() {
    let c = ['1', '2', '4', '3'];
    printedArr = c;
    let maxOfArrC = Math.max.apply(Math,c);
    printed.innerHTML = "The bighest number is : " + maxOfArrC;
    let total = 0;
    for (var i = 0; i < c.length; i++) {
        total += parseInt(c[i]);
    }
    let avr = total / c.length;
    console.log(avr);
    printed2.innerHTML = "The average of array is : " + avr;
}

function missonFour() {
    let d = ['T', 'H', 'A', 'N','H'];
    printed.innerHTML = d;
    let changeStr = "";
    for (var i = d.length - 1; i >=0 ; i-- ) {
        changeStr += d[i];
    }
    printed2.innerHTML = "new array was changed : " + changeStr;
}

function missonFive() {
    let a = [1,2,3,-5,-4];
    printedArr.innerHTML = a;
    total = 0;
    for(let i = 0; i < a.length; i++){
        if(a[i] < 0){
            printed.innerHTML += " " +  a[i];
            total = total + 1;
            printed.innerHTML = "Total negative number of array is : " + total;
        }
    }
}

function missonSix() {
    let a =['1','2','3','4','5','6','7','8','9', '10'];
    printedArr.innerHTML = a;
    let checkNumber = prompt('Input the number you want to check : ');
    let checked = false;
    for(let i = 0; i <= a.length; i++ ) {
        if(checkNumber == a[i]){
            checked = true;
            break;
        }
    }
    if(checked) {
        printed.innerHTML = checkNumber + " is in the array";
    }else{
        printed.innerHTML = checkNumber + " isn't in the array";
    }
}

// --------------------- CÁCH 1 ----------------

// function missonSeven(){
//     let a =['1','2','3','4','5'];
//     printedArr.innerHTML = a;
//     let checkNumber = prompt('Input the number you want to check : ');
//     let checked = false;
//     for (let i = 0; i <= a.length; i++) {
//         if(checkNumber == a[i]){
//             checked = true;
//             break;
//         }
//     }
//     if(checked == true) {
//         position = a.indexOf(checkNumber);
//         delete a[position];
//         a.push('0');
//         printed.innerHTML = "array was changed : " + a;
//     }else{
//         printed.innerHTML = checkNumber + " isn't in the array";
//     }
// }

//------------------- CÁCH 2 -----------------

function missonSeven(){
    let a =['1','2','3','4','5'];
    printedArr.innerHTML = a;
    let checkNumber = prompt('Input the number you want to check : ');
    let checked = false;
    for (let i = 0; i <= a.length; i++) {
        if(checkNumber == a[i]){
            checked = true;
            a.splice(i,1);
            break;
            
        }
    }
    a.push('0');
    printed.innerHTML = a;
}

 // ---------------- CÁCH 3 -------------
 // Dùng indexOf(checknumber);

 function missonEight() {
    // let array =['5','1','4','3','2'];
    let array =['B','C','A'];
    printedArr.innerHTML = array;
    sortArr = array.sort(function(a,b) {return b -a });
    printed.innerHTML = sortArr;
 }









