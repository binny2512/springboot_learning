package com.demo.springmavencrud.tableperhierarchy.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
@DiscriminatorValue("FTC")
public class Employee1FTC extends Employee1 {
    @NotBlank
    private String parentCompany;
    private String workingHours;

    public Employee1FTC(int empID, String empName, String email, String ph, String address, String parentCompany, String workingHours , String empType) {
        super(empID, empName, email, ph, address);
        this.parentCompany = parentCompany;
        this.workingHours = workingHours;
    }

    public Employee1FTC() {
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "EmployeeFTC{" +
                super.toString()+
                "parentCompany='" + parentCompany + '\'' +
                ", workingHours='" + workingHours + '\'' +
                '}';
    }
}
