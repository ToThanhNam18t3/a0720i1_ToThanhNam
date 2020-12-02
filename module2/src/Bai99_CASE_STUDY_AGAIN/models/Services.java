package Bai99_CASE_STUDY_AGAIN.models;

public abstract class Services {
    /*
    1.	Khu nghỉ dưỡng Furama sẽ cung cấp các dịch vụ cho thuê bao gồm Villa, House, Room.
    Tất cả các dịch vụ này sẽ bao có các thông tin: Tên dịch vụ,
    Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
     */
    protected String id;
    protected String serviceName;
    protected double areaUse;
    protected double rentCost;
    protected int numberOfPeople;
    protected String rentType;

    public Services(){

    }

    public Services(String id, String serviceName, double areaUse, double rentCost, int numberOfPeople, String rentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.rentCost = rentCost;
        this.numberOfPeople = numberOfPeople;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", rentCost=" + rentCost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }

    public abstract void showInfo();
}
