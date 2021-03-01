package model.servicetype;

public class Room {
    private String roomName;
    private int roomArea;
    private double roomCost;
    private int roomMaxPeople;
    private String roomRentTypeId;

    private String freeService;

    public Room(){

    }

    public Room(String roomName, int roomArea, double roomCost, int roomMaxPeople, String roomRentTypeId, String freeService) {
        this.roomName = roomName;
        this.roomArea = roomArea;
        this.roomCost = roomCost;
        this.roomMaxPeople = roomMaxPeople;
        this.roomRentTypeId = roomRentTypeId;
        this.freeService = freeService;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(int roomArea) {
        this.roomArea = roomArea;
    }

    public double getRoomCost() {
        return roomCost;
    }

    public void setRoomCost(double roomCost) {
        this.roomCost = roomCost;
    }

    public int getRoomMaxPeople() {
        return roomMaxPeople;
    }

    public void setRoomMaxPeople(int roomMaxPeople) {
        this.roomMaxPeople = roomMaxPeople;
    }

    public String getRoomRentTypeId() {
        return roomRentTypeId;
    }

    public void setRoomRentTypeId(String roomRentTypeId) {
        this.roomRentTypeId = roomRentTypeId;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
