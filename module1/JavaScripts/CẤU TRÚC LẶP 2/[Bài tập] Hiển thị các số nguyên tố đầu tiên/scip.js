
num = parseInt(prompt('Input N nummber which you want to check : '));
console.log(num);

if(num < 2) {
    document.write("Number " + num + " isn't prime number");
} else {
    let mark = 1;
    for ( let i = 2; i <= Math.sqrt(num); i++) {
        if(num % i == 0) {
            mark = 0;
            break;
        }
    }
    if (mark == 1) {
        document.write('This is prime number!!!' + num);
    } else {
        document.write('This is not prime number !!! ' + num);
    }
}