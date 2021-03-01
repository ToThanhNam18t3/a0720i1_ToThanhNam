// let btn = document.getElementById('btn');
// let printed = document.getElementById('print');
// let input = document.getElementById('input');


//  let Viet = ['Xe hơi', 'Ngôi nhà', 'Cái ghế', 'Con chó'];
//  let Eng = ['Car', 'House', 'Chair', 'Dog'];

//  btn.addEventListener('click', function(event){
//      printed.innerHTML = "";
//      keywork = input.value;
//      index = Viet.indexOf(keywork);
//      if(index >=0) {
//          printed.innerHTML = Eng[index];
//      } else{
//          printed.innerHTML = 'not Found';
//      }
//  })



 


let btn = document.getElementById('btn');
let input = document.getElementById('input');
let printed = document.getElementById('print');

let Viet = ['a', 'b', 'c', 'd'];
let Eng = ['ay', 'bi', 'si', 'di'];

btn.addEventListener('click', function(event){
    printed.innerHTML ='';
     keywork = input.value;
     index = Viet.indexOf(keywork);
    if(index >= 0) {
        printed.innerHTML = Eng[index];
    } else {
        printed.innerHTML ='not found';
    }
})