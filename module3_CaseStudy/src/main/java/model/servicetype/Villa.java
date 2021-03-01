package model.servicetype;

public class Villa {
    private String villaName;
    private int villaArea;
    private double villaCost;
    private int villaMaxPeople;
    private String villaRentTypeId;

    private String villaStandardRoom;
    private String villaOtherConvenient;
    private int villaNumberOfFloor;
    private String villaPoolArea;

    public Villa(){

    }

    public Villa(String villaName, int villaArea, double villaCost, int villaMaxPeople, String villaRentTypeId, String villaStandardRoom, String villaOtherConvenient, int villaNumberOfFloor, String villaPoolArea) {
        this.villaName = villaName;
        this.villaArea = villaArea;
        this.villaCost = villaCost;
        this.villaMaxPeople = villaMaxPeople;
        this.villaRentTypeId = villaRentTypeId;
        this.villaStandardRoom = villaStandardRoom;
        this.villaOtherConvenient = villaOtherConvenient;
        this.villaNumberOfFloor = villaNumberOfFloor;
        this.villaPoolArea = villaPoolArea;
    }

    public String getVillaName() {
        return villaName;
    }

    public void setVillaName(String villaName) {
        this.villaName = villaName;
    }

    public int getVillaArea() {
        return villaArea;
    }

    public void setVillaArea(int villaArea) {
        this.villaArea = villaArea;
    }

    public double getVillaCost() {
        return villaCost;
    }

    public void setVillaCost(double villaCost) {
        this.villaCost = villaCost;
    }

    public int getVillaMaxPeople() {
        return villaMaxPeople;
    }

    public void setVillaMaxPeople(int villaMaxPeople) {
        this.villaMaxPeople = villaMaxPeople;
    }

    public String getVillaRentTypeId() {
        return villaRentTypeId;
    }

    public void setVillaRentTypeId(String villaRentTypeId) {
        this.villaRentTypeId = villaRentTypeId;
    }

    public String getVillaStandardRoom() {
        return villaStandardRoom;
    }

    public void setVillaStandardRoom(String villaStandardRoom) {
        this.villaStandardRoom = villaStandardRoom;
    }

    public String getVillaOtherConvenient() {
        return villaOtherConvenient;
    }

    public void setVillaOtherConvenient(String villaOtherConvenient) {
        this.villaOtherConvenient = villaOtherConvenient;
    }

    public int getVillaNumberOfFloor() {
        return villaNumberOfFloor;
    }

    public void setVillaNumberOfFloor(int villaNumberOfFloor) {
        this.villaNumberOfFloor = villaNumberOfFloor;
    }

    public String getVillaPoolArea() {
        return villaPoolArea;
    }

    public void setVillaPoolArea(String villaPoolArea) {
        this.villaPoolArea = villaPoolArea;
    }


}
