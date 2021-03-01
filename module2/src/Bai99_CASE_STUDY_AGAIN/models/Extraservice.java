package Bai99_CASE_STUDY_AGAIN.models;

public class Extraservice {
    //  Tên dịch vụ đi kèm, Đơn vị, Giá tiền

    private String extraServiceName;
    private String unit;
    private double money;

    public Extraservice(String extraServiceName, String unit, double money) {
        this.extraServiceName = extraServiceName;
        this.unit = unit;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Extraservice{" +
                "extraServiceName='" + extraServiceName + '\'' +
                ", unit='" + unit + '\'' +
                ", money=" + money +
                '}';
    }
}
