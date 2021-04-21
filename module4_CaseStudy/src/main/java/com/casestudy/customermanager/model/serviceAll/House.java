package com.casestudy.customermanager.model.serviceAll;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class House {

    @Id
    private String houseId;

    private String houseServiceName;
    private long houseAreaUsed;
    private long houseRentCost;
    private int houseMaxPeople;
    private String houseRentType;

    private String houseStandardRoom;
    private String houseOtherConvinient;
    private int houseNumberOfFloor;


    public House(String houseId, String houseServiceName, long houseAreaUsed, long houseRentCost,
                 int houseMaxPeople, String houseRentType, String houseStandardRoom, String houseOtherConvinient, int houseNumberOfFloor) {
        this.houseId = houseId;
        this.houseServiceName = houseServiceName;
        this.houseAreaUsed = houseAreaUsed;
        this.houseRentCost = houseRentCost;
        this.houseMaxPeople = houseMaxPeople;
        this.houseRentType = houseRentType;
        this.houseStandardRoom = houseStandardRoom;
        this.houseOtherConvinient = houseOtherConvinient;
        this.houseNumberOfFloor = houseNumberOfFloor;
    }
}
