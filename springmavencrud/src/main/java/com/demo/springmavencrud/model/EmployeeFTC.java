package com.demo.springmavencrud.model;


import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
//@DiscriminatorValue("FTC")
@PrimaryKeyJoinColumn(name = "empID")
public class EmployeeFTC extends Employee{
    @NotBlank
    private String parentCompany;
    private String workingHours;

    public EmployeeFTC(int empID, String empName, String email, String ph, String address, String parentCompany, String workingHours , String empType) {
        super(empID, empName, email, ph, address);
        this.parentCompany = parentCompany;
        this.workingHours = workingHours;
    }

    public EmployeeFTC() {
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
