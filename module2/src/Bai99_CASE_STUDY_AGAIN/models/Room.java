package Bai99_CASE_STUDY_AGAIN.models;

public class Room extends Services {
    // dv mien phi di kem
    private Extraservice extraservice;

    public Room(String id, String serviceName, double areaUse, double rentCost, int numberOfPeople, String rentType, Extraservice extraservice) {
        super(id, serviceName, areaUse, rentCost, numberOfPeople, rentType);
        this.extraservice = extraservice;
    }

    public Extraservice getExtraservice() {
        return extraservice;
    }

    public void setExtraservice(Extraservice extraservice) {
        this.extraservice = extraservice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "extraservice=" + extraservice +
                '}' + super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
