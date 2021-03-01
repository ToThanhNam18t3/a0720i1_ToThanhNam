const btn = document.getElementById("btn");
const option = document.getElementById("selection_number");
const mark = document.getElementById("mark");

btn.addEventListener("click", function(){
    mark.innerHTML="";
    if(option.value == 1){
        missionOne();
    } else if (option.value == 2){
        missionTwo();
    } else if(option.value == 3) {
        missionThree();
    } else if(option.value == 4) {
        missionFour();
    }
})


const missionOne = function(){
    for (let i = 0; i <= 99; i++){
    mark.innerHTML += "<br>" +  i;
    }  

}

const missionTwo = function() {
    let a = parseInt(prompt("Input degree cencius : "));
    if (a > 100)
    {
        mark.innerHTML="Reduce degree";
    } else if (a < 20) {
        mark.innerHTML="Increase Degree";
    }
}

const missionThree = function() {
     n = parseInt(prompt("Input N: "));
     let a1 = 1;
     let a2 = 1;
     if ( n == 1 || n == 2)
         return 1;
     let i = 3;
     let temp;
     while( i <= n)
     {
         temp = a1 + a2;
         a1 = a2;
         a2 = temp;
         i++;
     }
     mark.innerHTML = temp;
}


const missionFour = function() {
    
}
