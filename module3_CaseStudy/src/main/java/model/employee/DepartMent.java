package model.employee;

public class DepartMent {
    private int idDepartment;
    private String departmentName;

    public DepartMent(int idDepartment, String departmentName) {
        this.idDepartment = idDepartment;
        this.departmentName = departmentName;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
