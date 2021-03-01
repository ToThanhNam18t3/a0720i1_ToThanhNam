let printed = document.getElementById('printed');
let myArr = [];
let getVl = parseInt(prompt('Nhập N: '));
let result = document.getElementById('result');

console.log(getVl);

for (let i = 0; i < getVl; i++) {
    if (getVl <= 50) {
        printed.innerHTML += "Phần tử " + i + " có giá trị là : " + myArr.push(i) + "</br>";
    } else{
        printed.innerHTML = " Gía trị lớn hơn 50 , vui lòng nhập lại !";
    }
}

 for(let j = 1; j < myArr.length; j++){
     if(myArr[j].index % 2 == 0 ){
         result.innerHTML = myArr[j];
     }
 }

    console.log(myArr);