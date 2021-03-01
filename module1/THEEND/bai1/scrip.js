let printed = document.getElementById('printed');
let myArr = [];
let getVl = parseInt(prompt('Nhập N: '));
let result = document.getElementById('result');

let count = 0;
let total = 0;

console.log(getVl);

for (let i = 1; i <= getVl; i++) {
    if (getVl <= 50) {
        printed.innerHTML += "Phần tử " + i + " có giá trị là : " + myArr.push(i) + "</br>";
    } else{
        printed.innerHTML = " Gía trị lớn hơn 50 , vui lòng nhập lại !";
    }
}


for(let j = 0; j < getVl; j = j+2){
    if(myArr[j] % 2 !== 0){
        total += myArr[j];
        count++;
    }
    result.innerHTML = (total)/count;
}







