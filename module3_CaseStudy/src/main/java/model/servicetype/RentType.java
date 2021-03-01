package model.servicetype;

public class RentType {
    private int idRenType;
    private String rentTypeName;
    private int renTypeCost;

    public RentType(){

    }

    public RentType(int idRenType, String rentTypeName, int renTypeCost) {
        this.idRenType = idRenType;
        this.rentTypeName = rentTypeName;
        this.renTypeCost = renTypeCost;
    }

    public int getIdRenType() {
        return idRenType;
    }

    public void setIdRenType(int idRenType) {
        this.idRenType = idRenType;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public int getRenTypeCost() {
        return renTypeCost;
    }

    public void setRenTypeCost(int renTypeCost) {
        this.renTypeCost = renTypeCost;
    }
}
