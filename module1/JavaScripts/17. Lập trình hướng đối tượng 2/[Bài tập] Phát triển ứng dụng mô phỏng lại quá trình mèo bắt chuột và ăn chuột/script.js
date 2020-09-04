class Rat {
    constructor(name, weight, speed, isDead) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.isDead = isDead;
    }
    isDead() {
        if (this.isDead) {
            return true;
        } else {
            return false;
        }
    }
    getWeight() {
        return this.getWeight;
    }
    setWeight() {
        this.weight = weight;
    }
    getSpeed() {
        return this.speed;
    }
    setSpeed() {
        this.speed = speed;
    }
    ratSay() {
        alert('Chít chít !');
    }
}

class Cat {
    constructor(name, weight, speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }
    getWeight() {
        return this.getWeight;
    }
    setWeight() {
        this.weight = weight;
    }
    getSpeed() {
        return this.speed;
    }
    setSpeed() {
        this.speed = speed;
    }
    catSay() {
        alert('Meo meo!');
    }
    killRat(Rat) {
        if (this.speed > Rat.speed) {
            return true;
        } else {
            alert("Chuột chạy nhanh hơn mèo");
            return false;
        }
    }
    eatRat(Rat) {
        if (Rat.isDead == false) {
            if (this.killRat(Rat)) {
                alert("Mèo ăn được chuột!");
                let temp = this.weight += Rat.weight;
                alert("Khối lượng của mèo tăng : " + temp);
            } else {
                alert("Mèo không ăn được chuột!");
            }
        }else{
            alert('ChuỘt đã chết !');
        }
    }
}


let myMouse = new Rat("Tom",25,20,false);
let myCat = new Cat("Jerry",15,15);

myCat.catSay();
myMouse.ratSay();

alert('Khối lượng của mèo là : ' + myCat.weight);
alert('Tốc độ của mèo là : ' + myCat.speed);
alert('Khối lượng của chuột là : ' + myMouse.weight);
alert('Tốc độ của chuột là : ' + myMouse.speed);

myCat.eatRat(myMouse);



