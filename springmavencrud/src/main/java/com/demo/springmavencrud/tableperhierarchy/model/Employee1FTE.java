package com.demo.springmavencrud.tableperhierarchy.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FTE")
public class Employee1FTE extends Employee1
{
    private boolean hasHealthBenefits;
    private boolean needCabFacility;
    private boolean mealFacilityRequired;

    public Employee1FTE() {
    }

    public Employee1FTE(int empID, String empName, String email, String ph, String address, boolean hasHealthBenefits, boolean needCabFacility, boolean mealFacilityRequired, String empType) {
        super(empID, empName, email, ph, address);
        this.hasHealthBenefits = hasHealthBenefits;
        this.needCabFacility = needCabFacility;
        this.mealFacilityRequired = mealFacilityRequired;
    }

    public boolean isHasHealthBenefits() {
        return hasHealthBenefits;
    }

    public void setHasHealthBenefits(boolean hasHealthBenefits) {
        this.hasHealthBenefits = hasHealthBenefits;
    }

    public boolean isNeedCabFacility() {
        return needCabFacility;
    }

    public void setNeedCabFacility(boolean needCabFacility) {
        this.needCabFacility = needCabFacility;
    }

    public boolean isMealFacilityRequired() {
        return mealFacilityRequired;
    }

    public void setMealFacilityRequired(boolean mealFacilityRequired) {
        this.mealFacilityRequired = mealFacilityRequired;
    }

    @Override
    public String toString() {
        return "EmployeeFTE{" +
                super.toString()+
                "hasHealthBenefits=" + hasHealthBenefits +
                ", needCabFacility=" + needCabFacility +
                ", mealFacilityRequired=" + mealFacilityRequired +
                '}';
    }
}
