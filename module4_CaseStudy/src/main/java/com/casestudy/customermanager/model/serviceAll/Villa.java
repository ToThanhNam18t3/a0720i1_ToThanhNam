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
public class Villa {

    @Id
    private String Villaid;

    private String villaServiceName;
    private long villaAreaUsed;
    private long villaRentCost;
    private int villaMaxPeople;
    private String villaRentType;

    private String villaStandardRoom;
    private String villaOtherConvenient;
    private int villaPoolArea;
    private int villaNumberOfFloor;

    public Villa(String villaid, String villaServiceName, long villaAreaUsed, long villaRentCost, int villaMaxPeople,
                 String villaRentType, String villaStandardRoom, String villaOtherConvenient, int villaPoolArea, int villaNumberOfFloor) {
        Villaid = villaid;
        this.villaServiceName = villaServiceName;
        this.villaAreaUsed = villaAreaUsed;
        this.villaRentCost = villaRentCost;
        this.villaMaxPeople = villaMaxPeople;
        this.villaRentType = villaRentType;
        this.villaStandardRoom = villaStandardRoom;
        this.villaOtherConvenient = villaOtherConvenient;
        this.villaPoolArea = villaPoolArea;
        this.villaNumberOfFloor = villaNumberOfFloor;
    }
}
