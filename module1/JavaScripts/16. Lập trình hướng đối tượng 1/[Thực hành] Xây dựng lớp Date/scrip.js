class myDate{
    constructor(day,month,year){    
    this.day = day;
    this.month = month;
    this.year = year;
}
    displayDate(){
        let result = this.day + " " + this.month + " " + this.year;
        return result;
    }
}

let yourDate = new myDate(10,10,2019);
alert(yourDate.displayDate());



 


// let myDate1 = new myDate(10,10,2019);
// console.log(myDate1);

