package Bai99_CASE_STUDY_AGAIN.models;

public class Villa extends Services {
    private String standartRoom;
    private String otherDescription;
    private double areaPool;
    private int numberOfFloor;

    public Villa(){

    }

    public Villa(String id, String serviceName, double areaUse, double rentCost, int numberOfPeople, String rentType, String standartRoom, String otherDescription, double areaPool, int numberOfFloor) {
        super(id, serviceName, areaUse, rentCost, numberOfPeople, rentType);
        this.standartRoom = standartRoom;
        this.otherDescription = otherDescription;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandartRoom() {
        return standartRoom;
    }

    public void setStandartRoom(String standartRoom) {
        this.standartRoom = standartRoom;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standartRoom='" + standartRoom + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloor='" + numberOfFloor + '\'' +
                '}' + super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
    /*
    Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
    */


}
