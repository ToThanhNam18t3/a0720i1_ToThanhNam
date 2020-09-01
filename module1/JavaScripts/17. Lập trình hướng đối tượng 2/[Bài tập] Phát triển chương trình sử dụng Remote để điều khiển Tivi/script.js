class Tivi {
    constructor(chanel, volume, status) {
        this.chanel = chanel;
        this.volume = volume;
        this.status = status;
    }
    isStatus() {
        if (this.status) {
            return true;
        } else {
            alert('Tivi đang tắt!');
            return false;
        }
    }
    getChanel() {
        return this.chanel;
    }
    setChanel() {
        this.chanel = chanel;
    }
    getVolume() {
        return this.volume;
    }
    setVolume() {
        this.volume = volume;
    }
}

class Remote {
    constructor(ID) {
        this.ID = ID;
    }
    turnOnTivi(Tivi) {
        if (Tivi.status) {
            alert('Đã bật Tivi');
        } else {
            alert('Đã tắt Tivi');
        }
    }
    changeChannel(Tivi) {
        if (Tivi.status) {
            let temp = prompt(parseInt('Nhập kênh bạn muốn thay đổi : '));
            Tivi.getChanel = temp;
            alert("Kênh đã được thay đổi thành kênh " + temp);
        } else {
            alert('Tivi đang tắt !');
        }
    }
    changeVolume(Tivi) {
        if (Tivi.status) {
            let temp1 = prompt(parseInt("Nhập âm lượng muốn thay đổi : "));
            Tivi.getVolume = temp1;
            alert("Volume đã được thay đổi thành : " + temp1);
        } else {
            alert('Tivi đang tắt!');
        }
    }
}

let myTv = new Tivi(3,2,true);
let myRemote = new Remote(10);

alert("Channel hiện tại của Tivi là : " + myTv.getChanel());
myRemote.changeChannel(myTv);
myRemote.changeVolume(myTv);




