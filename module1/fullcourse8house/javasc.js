// let age;

// age = prompt('What is your age ???');
// document.getElementById('demo').innerHTML = age;
//------------------------

//Number in JS

// var num1 = 10;
// num1 = num1 + 1;
// console.log(num1);

//------------------------

/*Functions
1. Create a function
2. Call the function
*/

// //Create a Function
// funtion fun() {
//     alert('This is a function ');
// }

// //Call the function
// fun();

//------------------------

/*
Create a Function that take in a name and says hello
followed by your name

For example 
Name : "Thanh Nam"
Return : " Hello Thanh Nam"
*/

// function greeting() {
//     let name = prompt('What is your name ??');
//     let result = ' Hello ' + ' Thanh ' + name;
//     console.log(result);
// }

// greeting();

//------------------------

// How do argument work in functions ? 
// How do we add 2 numbers together in a function ?

// function sumNumbers(num1, num2) {
//     let result = num1 + num2;
//     console.log(num1 + num2);
// }

// sumNumbers(20,20);

//------------------------


// IV. While loops 

// var num = 0;

// while (num < 100) { //Run when () True , doesn't run when () false
//     num+=1;
//     console.log(num);
// }


//----------------------------------------

// V . FOR LOOP

// for (let num = 0; num < 100 ; num++ ){
//     console.log(num);
// }

//----------------------------------------

// VI. DATA TYPES

//----------------------------------------

// VII . STRING
// let fruit = 'banana.apple.dinner';
// let moreFruits = 'banana\napple';

// console.log(fruit.length); //length of string
// console.log(fruit.indexOf('nan')); //result of found of string 
// console.log(fruit.slice(2,5)); //find from ... to ...
// console.log(fruit.replace('ban', '123'));
// console.log(fruit.toUpperCase(fruit));
// console.log(fruit.toLowerCase(fruit));
// console.log(fruit.charAt(2)); //select a value in string
// console.log(fruit.split(',')); //split by a comma ( dấu phẩy)
// console.log(fruit.split('')); //split by character

//----------------------------------------

// VIII. Array

// let fruits = ['banana', 'apple', 'orange', 'pineaples'];
//  fruits = new Array('banana', 'apple', 'orange', 'pineaples');

// console.log(fruits[2]); //acess value at index 2nd

// fruits[0] = ' pear ';
// console.log(fruits); // Change value in string

// for (let i = 0; i < fruits.length; i++){ // Print value of Stirng
//     console.log(fruits[i]);
// }

// Array common method

// console.log('to string', fruits.toString());
// console.log(fruits.join(' - ')); // add  a character in string
// console.log(fruits.pop(), fruits); //Remove last element from the array
// console.log(fruits.push('mango'), fruits); // add more
// fruits[fruits.length] = 'new fruit'; //same as push
// console.log(fruits);

// fruits.shift(); //remove first element from array
// console.log(fruits);
// fruits.unshift('kiwi'); // add first element to an array
// console.log(fruits);

// let someNumbers = [5, 10 , 2, 25, 3 , 255, 1, 2, 5, 334, 321, 2];
// console.log(someNumbers.sort(function(a, b){return a-b})); // sorted by accending order
// console.log(someNumbers.sort(function(a, b){return b-a})); // sorted by decending order

// let emptArray = new Array(); // add number to a string
// for (let num = 0; num < 10; num++){
//     emptArray.push(num);
// }

// console.log(emptArray);

//----------------------------------------

// IX. OBJECT

// let student = {
//     first: 'Rafeh', 
//     last:'Qazi',
//     age: 25,
//     height: 170,
//     studentInfo: function(){
//         return this.first + '\n' + this.last;
//     }
// };

// console.log(student);
// console.log(student.studentInfo());

// // console.log(student.first);
// // student.first = 'notRafeh'; //change value
// // console.log(student.first);

// // console.log(student.age);

// console.log(student.studentInfo());

//----------------------------------------

// X. IF - ELSE

// var age = prompt('What is your age ?')

// if ( (age >= 18 && age <= 35) ) {
//     status = ' target demo ';
//     console.log(status);
// }else {
//     status = ' not my audience ';
//     console.log(status)
// }

//Switch statement
// differentiate between weekday vs .week




















