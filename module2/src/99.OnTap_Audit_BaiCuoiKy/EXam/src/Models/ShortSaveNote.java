package Models;

public class ShortSaveNote extends SaveNote {
    private String timeRent;

    public ShortSaveNote(){
    }

    public ShortSaveNote(String timeRent) {
        this.timeRent = timeRent;
    }

    public ShortSaveNote(String nameL, String idL, String dateOfOpenL, String timeStartOpenL, Double moneyL, String rentPayL, String timeRent) {
        super(nameL, idL, dateOfOpenL, timeStartOpenL, moneyL, rentPayL);
        this.timeRent = timeRent;
    }

    public String getTimeRent() {
        return timeRent;
    }

    public void setTimeRent(String timeRent) {
        this.timeRent = timeRent;
    }

    @Override
    public void showInfo() {
        System.out.println(" name='" + getName() + '\'' +
                ", id='" + getId() + '\'' +
                ", dateOfOpen='" + getDateOfOpen() + '\'' +
                ", timeStartOpen='" + getTimeStartOpen() + '\'' +
                ", money=" + money + getMoney() + '\'' +
                ", rentPay='" + getRentPay() + '\'' +
                "timeRentL='" + getTimeRent() + '\'');
    }

    @Override
    public String toString() {
        return getName() + "," +  getId() + "," + getDateOfOpen() + "," + getTimeStartOpen()
                + "," + getMoney() + "," + getRentPay() + "," + getTimeRent();
    }
}
