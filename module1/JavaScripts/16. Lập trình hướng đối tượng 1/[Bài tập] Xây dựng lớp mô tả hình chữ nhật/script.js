class Rectangle {
    constructor(cd, cr) {
        this.cd = cd;
        this.cr = cr;
    }
    setCd(cd){
        this.cd = cd;
    }
    setCr(cr){
        this.cr = cr;
    }
    dt(){
        let result1 = this.cd * this.cr;
        return result1;
    }
    cv(){
        let result2 = (this.cd + this.cr) / 2;
        return result2;
    }
    displayHCN() {
        var c = document.getElementById('myCanvas');
        var ctx = c.getContext("2d");
        ctx.fillStyle = "#FF0000";
        ctx.fillRect(25, 0, 150, 150);
    }
}

let myRectangle = new Rectangle(20,10);

myRectangle.displayHCN();
alert(myRectangle.dt());
alert(myRectangle.cv());
myRectangle.setCd(30);
myRectangle.setCr(20);
alert(myRectangle.dt());
alert(myRectangle.cv());





