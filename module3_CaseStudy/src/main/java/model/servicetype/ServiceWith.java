package model.servicetype;

public class ServiceWith {
    private int idServiceWith;
    private int nameServiceWith;
    private int priceServiceWith;
    private int unitServiceWith;
    private String statusServiceWith;

    public ServiceWith(){

    }

    public ServiceWith(int idServiceWith, int nameServiceWith, int priceServiceWith, int unitServiceWith, String statusServiceWith) {
        this.idServiceWith = idServiceWith;
        this.nameServiceWith = nameServiceWith;
        this.priceServiceWith = priceServiceWith;
        this.unitServiceWith = unitServiceWith;
        this.statusServiceWith = statusServiceWith;
    }

    public int getIdServiceWith() {
        return idServiceWith;
    }

    public void setIdServiceWith(int idServiceWith) {
        this.idServiceWith = idServiceWith;
    }

    public int getNameServiceWith() {
        return nameServiceWith;
    }

    public void setNameServiceWith(int nameServiceWith) {
        this.nameServiceWith = nameServiceWith;
    }

    public int getPriceServiceWith() {
        return priceServiceWith;
    }

    public void setPriceServiceWith(int priceServiceWith) {
        this.priceServiceWith = priceServiceWith;
    }

    public int getUnitServiceWith() {
        return unitServiceWith;
    }

    public void setUnitServiceWith(int unitServiceWith) {
        this.unitServiceWith = unitServiceWith;
    }

    public String getStatusServiceWith() {
        return statusServiceWith;
    }

    public void setStatusServiceWith(String statusServiceWith) {
        this.statusServiceWith = statusServiceWith;
    }
}
