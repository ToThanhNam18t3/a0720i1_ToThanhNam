package Bai99_CASE_STUDY_AGAIN.models;

public class House extends Services {
    // Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.

    private String standartRoom;
    private String otherConvenient;
    private String numberOfFloor;


    public House(String id, String serviceName, double areaUse, double rentCost, int numberOfPeople, String rentType, String standartRoom, String otherConvenient, String numberOfFloor) {
        super(id, serviceName, areaUse, rentCost, numberOfPeople, rentType);
        this.standartRoom = standartRoom;
        this.otherConvenient = otherConvenient;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandartRoom() {
        return standartRoom;
    }

    public void setStandartRoom(String standartRoom) {
        this.standartRoom = standartRoom;
    }

    public String getOtherConvenient() {
        return otherConvenient;
    }

    public void setOtherConvenient(String otherConvenient) {
        this.otherConvenient = otherConvenient;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standartRoom='" + standartRoom + '\'' +
                ", otherConvenient='" + otherConvenient + '\'' +
                ", numberOfFloor='" + numberOfFloor + '\'' +
                '}' + super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
