class Apple{
    constructor(weight){
        this.weight = weight;
    }
    decrease(){
       if(this.isEmpty()){
           alert('Đéo ăn được !');
       } else {
           this.weight = this.weight - 1;
       }
    }
    isEmpty(){
        if(this.weight == 0){
            return true;
        }
    }
    getWeight(){
        return this.weight;
    }
    setWeight(weight){
        this.weight = weight;
    }
}

class Human{
    constructor(name,gender,weight){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }
    isMale(){
        return this.gender;
    }
    setGender(){
        this.gender = !this.gender;
    }
    checkApple(){

    }
    eat(Apple){
        if(Apple.isEmpty() == true) {
            alert("Bố mày không ăn !");
        }
        else {
            Apple.decrease();
            this.weight = this.weight + 1;
        }
    }
    say(String){
        console.log('CÁI QUẦN ĐÙI');
    }
    getName(){
        return this.name;
    }
    setName(name){
        this.name = name;
    }
    getWeight(){
        return this.weight;
    }
    setWeight(){
        this.weight = this.weight;
    }
}

let AppleWeight = new Apple(0);
let Humann = new Human('Nam',true,20);

Humann.say();
Humann.eat(AppleWeight);

alert(AppleWeight.weight);
alert(Humann.weight);

