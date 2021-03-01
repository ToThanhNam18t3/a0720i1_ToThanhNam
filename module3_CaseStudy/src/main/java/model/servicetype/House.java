package model.servicetype;

public class House {
    private String houseName;
    private int houseArea;
    private double houseCost;
    private int houseMaxPeople;
    private String houseRentTypeId;

    private String houseStandardRoom;
    private String houseOtherConvenient;
    private int houseNumberOfFloor;

    public House(){

    }

    public House(String houseName, int houseArea, double houseCost, int houseMaxPeople, String houseRentTypeId, String houseStandardRoom, String houseOtherConvenient, int houseNumberOfFloor) {
        this.houseName = houseName;
        this.houseArea = houseArea;
        this.houseCost = houseCost;
        this.houseMaxPeople = houseMaxPeople;
        this.houseRentTypeId = houseRentTypeId;
        this.houseStandardRoom = houseStandardRoom;
        this.houseOtherConvenient = houseOtherConvenient;
        this.houseNumberOfFloor = houseNumberOfFloor;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public int getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(int houseArea) {
        this.houseArea = houseArea;
    }

    public double getHouseCost() {
        return houseCost;
    }

    public void setHouseCost(double houseCost) {
        this.houseCost = houseCost;
    }

    public int getHouseMaxPeople() {
        return houseMaxPeople;
    }

    public void setHouseMaxPeople(int houseMaxPeople) {
        this.houseMaxPeople = houseMaxPeople;
    }

    public String getHouseRentTypeId() {
        return houseRentTypeId;
    }

    public void setHouseRentTypeId(String houseRentTypeId) {
        this.houseRentTypeId = houseRentTypeId;
    }

    public String getHouseStandardRoom() {
        return houseStandardRoom;
    }

    public void setHouseStandardRoom(String houseStandardRoom) {
        this.houseStandardRoom = houseStandardRoom;
    }

    public String getHouseOtherConvenient() {
        return houseOtherConvenient;
    }

    public void setHouseOtherConvenient(String houseOtherConvenient) {
        this.houseOtherConvenient = houseOtherConvenient;
    }

    public int getHouseNumberOfFloor() {
        return houseNumberOfFloor;
    }

    public void setHouseNumberOfFloor(int houseNumberOfFloor) {
        this.houseNumberOfFloor = houseNumberOfFloor;
    }
}
