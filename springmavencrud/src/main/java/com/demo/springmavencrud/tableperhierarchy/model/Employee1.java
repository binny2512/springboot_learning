package com.demo.springmavencrud.tableperhierarchy.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="test_employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.STRING)
public class Employee1
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empID1;
   @NotBlank
   private String empName;
   @NotBlank
   private String email;
    private String ph;
    private String address;
    @Transient
    private String type;
    public Employee1() {
    }

    public Employee1(int empID1, String empName, String email, String ph, String address) {
        this.empID1 = empID1;
        this.empName = empName;
        this.email = email;
        this.ph = ph;
        this.address = address;
    }

    public int getEmpID1() {
        return empID1;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empID1=" + empID1 +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", ph='" + ph + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
