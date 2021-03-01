package model.employee;

import java.util.Date;

public class Employee {
   private int eId;
   private String eFullName;
   private int eIdPosition;
   private int eIdLevel;
   private int eIdPart;
   private int eIdDepartment;
   private Date eDob;
   private String eIndentityCard;
   private String eNumberPhone;
   private String eEmail;
   private String eAddress;

   public Employee(){

   }

    public Employee(int eId, String eFullName, int eIdPosition, int eIdLevel, int eIdPart, int eIdDepartment, Date eDob, String eIndentityCard, String eNumberPhone, String eEmail, String eAddress) {
        this.eId = eId;
        this.eFullName = eFullName;
        this.eIdPosition = eIdPosition;
        this.eIdLevel = eIdLevel;
        this.eIdPart = eIdPart;
        this.eIdDepartment = eIdDepartment;
        this.eDob = eDob;
        this.eIndentityCard = eIndentityCard;
        this.eNumberPhone = eNumberPhone;
        this.eEmail = eEmail;
        this.eAddress = eAddress;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteFullName() {
        return eFullName;
    }

    public void seteFullName(String eFullName) {
        this.eFullName = eFullName;
    }

    public int geteIdPosition() {
        return eIdPosition;
    }

    public void seteIdPosition(int eIdPosition) {
        this.eIdPosition = eIdPosition;
    }

    public int geteIdLevel() {
        return eIdLevel;
    }

    public void seteIdLevel(int eIdLevel) {
        this.eIdLevel = eIdLevel;
    }

    public int geteIdPart() {
        return eIdPart;
    }

    public void seteIdPart(int eIdPart) {
        this.eIdPart = eIdPart;
    }

    public int geteIdDepartment() {
        return eIdDepartment;
    }

    public void seteIdDepartment(int eIdDepartment) {
        this.eIdDepartment = eIdDepartment;
    }

    public Date geteDob() {
        return eDob;
    }

    public void seteDob(Date eDob) {
        this.eDob = eDob;
    }

    public String geteIndentityCard() {
        return eIndentityCard;
    }

    public void seteIndentityCard(String eIndentityCard) {
        this.eIndentityCard = eIndentityCard;
    }

    public String geteNumberPhone() {
        return eNumberPhone;
    }

    public void seteNumberPhone(String eNumberPhone) {
        this.eNumberPhone = eNumberPhone;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }
}
