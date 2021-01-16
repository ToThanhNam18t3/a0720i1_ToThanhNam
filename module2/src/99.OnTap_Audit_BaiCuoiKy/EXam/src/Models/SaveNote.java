package Models;

public abstract class SaveNote {
    public String name;
    public String id;
    public String dateOfOpen;
    public String timeStartOpen;
    public Double money;
    public String rentPay;

    public SaveNote(){
    }

    public SaveNote(String name, String id, String dateOfOpen, String timeStartOpen, Double money, String rentPay) {
        this.name = name;
        this.id = id;
        this.dateOfOpen = dateOfOpen;
        this.timeStartOpen = timeStartOpen;
        this.money = money;
        this.rentPay = rentPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfOpen() {
        return dateOfOpen;
    }

    public void setDateOfOpen(String dateOfOpen) {
        this.dateOfOpen = dateOfOpen;
    }

    public String getTimeStartOpen() {
        return timeStartOpen;
    }

    public void setTimeStartOpen(String timeStartOpen) {
        this.timeStartOpen = timeStartOpen;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getRentPay() {
        return rentPay;
    }

    public void setRentPay(String rentPay) {
        this.rentPay = rentPay;
    }

    public abstract void showInfo();

}
