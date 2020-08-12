const btn = document.getElementById("btn")
const option = document.getElementById("selection-number")
const mark = document.getElementById("mark")

let a; // EX1
let b;
//
let age; //EX2

let num; //EX3

let num1; //EX4
let num2;
let num3;
let result;
let max;




btn.addEventListener("click", function() {
    mark.innerHTML=""
    if(option.value == 1){
        missionOne();
    } else if (option.value == 2) {
        missionTwo();
    } else if(option.value == 3){
        missionThree();
    } else if(option.value == 4) {
        missionFour();
    }
}  )


const missionOne = function(){
    
    a = parseInt(prompt("Input A: "));
    b = parseInt(prompt("Input B: "));
    if(a % b == 0){
        mark.innerHTML = "Number" + " " + a + " " + " divisble" + " " + "number" + " " + b;
    }
    else{
        mark.innerHTML = "Number" + " " + a + " " + " isn't divisble" + " " + "number" + " " + b;
    }

}

const missionTwo = function() {
     age = parseInt(prompt("Input age of this student you want to check : "));
    if( age == 15) {
        mark.innerHTML = "Congrats! You can join the class 10 !";
    }
    else{
        mark.innerHTML = "You do not enough age to join !!!";
    }   
}

const missionThree = function() {
    num  = parseInt(prompt("Input the number you want to check : "));
     if (isNaN(num) == true){
         mark.innerHTML = "Bảo nhập số cơ mà ??? Nhập lại đi phèn";
     } else if(num > 0) {
         mark.innerHTML = "The number you inputed was larger than 0 !";
     } else {
         mark.innerHTML = "The number you inputed was smaller than 0 !";
     }
}

const missionFour = function() {
    num1 = parseInt(prompt("Input Number 1 : "));
    num2 = parseInt(prompt("Input Number 2: "));
    num3 = parseInt(prompt("Input Number 3 : "));

    result = (num1 > num2) ? num1:num2;
    max = (result > num3) ? result:num3;

    mark.innerHTML = "The largest Number is " + " " + max;
}

const missFive 









