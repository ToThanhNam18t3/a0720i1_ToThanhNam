package model.contract;

import java.util.Date;

public class Contract {
    private int contractId;
    private int eId;
    private int customerId;
    private int idService;
    private Date contractStartDay;
    private Date contractEndDay;
    private int deposits;
    private int totalOfMoney;

    public Contract(){

    }

    public Contract(int contractId, int eId, int customerId, int idService, Date contractStartDay, Date contractEndDay, int deposits, int totalOfMoney) {
        this.contractId = contractId;
        this.eId = eId;
        this.customerId = customerId;
        this.idService = idService;
        this.contractStartDay = contractStartDay;
        this.contractEndDay = contractEndDay;
        this.deposits = deposits;
        this.totalOfMoney = totalOfMoney;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public Date getContractStartDay() {
        return contractStartDay;
    }

    public void setContractStartDay(Date contractStartDay) {
        this.contractStartDay = contractStartDay;
    }

    public Date getContractEndDay() {
        return contractEndDay;
    }

    public void setContractEndDay(Date contractEndDay) {
        this.contractEndDay = contractEndDay;
    }

    public int getDeposits() {
        return deposits;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public int getTotalOfMoney() {
        return totalOfMoney;
    }

    public void setTotalOfMoney(int totalOfMoney) {
        this.totalOfMoney = totalOfMoney;
    }
}
