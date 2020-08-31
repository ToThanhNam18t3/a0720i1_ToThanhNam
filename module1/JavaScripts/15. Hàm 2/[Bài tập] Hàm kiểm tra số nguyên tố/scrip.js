let number = parseInt(prompt('Input the number you want to check : '));
let printed = document.getElementById('printed');

function isPrime(number){
    printed.innerHTML = "";
    console.log(number);
    if (number < 2 ) {
        printed.innerHTML = "The number you input isn't a Prime Number!"
        return 0;
    }
    let count = 0;
    for (let i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0){
            count++;
        }
    }
    if(count == 0) {
        printed.innerHTML = "Number " + number + " is PrimeNumber"; 
    } else {
        printed.innerHTML = "Number " + number + " isn't PrimeNumber";
    }   
}

isPrime(number);


