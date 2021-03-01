package Models;

public class LongSaveNote extends SaveNote {
    private String timeRentL;
    private String gift;

    public LongSaveNote(){
    }

    public LongSaveNote(String timeRentL, String gift) {
        this.timeRentL = timeRentL;
        this.gift = gift;
    }

    public LongSaveNote(String name, String id, String dateOfOpen, String timeStartOpen, Double money, String rentPay, String timeRentL, String gift) {
        super(name, id, dateOfOpen, timeStartOpen, money, rentPay);
        this.timeRentL = timeRentL;
        this.gift = gift;
    }

    public String getTimeRentL() {
        return timeRentL;
    }

    public void setTimeRentL(String timeRentL) {
        this.timeRentL = timeRentL;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    @Override
    public void showInfo(){
        System.out.println(" name='" + getName() + '\'' +
                ", id='" + getId() + '\'' +
                ", dateOfOpen='" + getDateOfOpen() + '\'' +
                ", timeStartOpen='" + getTimeStartOpen() + '\'' +
                ", money=" + money + getMoney() + '\'' +
                ", rentPay='" + getRentPay() + '\'' +
                "timeRentL='" + getTimeRentL() + '\'' +
                ", gift='" + getGift() + '\'');
    }

    @Override
    public String toString() {
        return getName() + "," +  getId() + "," + getDateOfOpen() + "," + getTimeStartOpen()
                + "," + getMoney() + "," + getRentPay() + "," + getTimeRentL() + "," + getGift();
    }
}
