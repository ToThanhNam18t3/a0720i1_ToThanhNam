printed = document.getElementById('printed');

class Circle{
    constructor(radius){
        this.radius = radius;
    }
    displayRadius() {
        return Math.PI * this.radius * this.radius;
    }
}

let myRadius = new Circle(10);
alert(myRadius.displayRadius());    