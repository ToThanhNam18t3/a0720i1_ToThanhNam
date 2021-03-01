package model.customer;

import java.util.Date;

public class Customer {
    private int customerId;
    private int customerTypeId;
    private String customerName;
    private String customerDob;
    private String customerIdentity;
    private String customerNumberPhone;
    private String customerEmail;
    private String customerAddress;

    public Customer(){

    }

    public Customer(int customerId, int customerTypeId, String customerName, String customerDob, String customerIdentity, String customerNumberPhone, String customerEmail, String customerAddress) {
        this.customerId = customerId;
        this.customerTypeId = customerTypeId;
        this.customerName = customerName;
        this.customerDob = customerDob;
        this.customerIdentity = customerIdentity;
        this.customerNumberPhone = customerNumberPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerDob() {
        return customerDob;
    }

    public void setCustomerDob(String customerDob) {
        this.customerDob = customerDob;
    }

    public String getCustomerIdentity() {
        return customerIdentity;
    }

    public void setCustomerIdentity(String customerIdentity) {
        this.customerIdentity = customerIdentity;
    }

    public String getCustomerNumberPhone() {
        return customerNumberPhone;
    }

    public void setCustomerNumberPhone(String customerNumberPhone) {
        this.customerNumberPhone = customerNumberPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
