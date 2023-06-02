package com.demo.springmavencrud.tableperclass.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "test_employee_joined")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empID;
   @NotBlank
   private String empName;
   @NotBlank
   private String email;
    private String ph;
    private String address;

    public Employee() {
    }

    public Employee(int empID, String empName, String email, String ph, String address) {
        this.empID = empID;
        this.empName = empName;
        this.email = email;
        this.ph = ph;
        this.address = address;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", ph='" + ph + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
