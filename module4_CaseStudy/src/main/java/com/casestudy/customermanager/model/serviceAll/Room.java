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
public class Room {

    @Id
    private String roomid;

    private String roomServiceName;
    private long roomAreaUsed;
    private long roomRentCost;
    private int roomMaxPeople;
    private String roomRentType;

    private String freeService;

    public Room(String roomid, String roomServiceName, long roomAreaUsed, long roomRentCost,
                int roomMaxPeople, String roomRentType, String freeService) {
        this.roomid = roomid;
        this.roomServiceName = roomServiceName;
        this.roomAreaUsed = roomAreaUsed;
        this.roomRentCost = roomRentCost;
        this.roomMaxPeople = roomMaxPeople;
        this.roomRentType = roomRentType;
        this.freeService = freeService;
    }
}
