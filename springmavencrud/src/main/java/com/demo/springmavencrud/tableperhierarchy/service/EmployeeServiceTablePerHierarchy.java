package com.demo.springmavencrud.tableperhierarchy.service;

import com.demo.springmavencrud.tableperhierarchy.model.Employee1;
import com.demo.springmavencrud.tableperhierarchy.model.Employee1FTC;
import com.demo.springmavencrud.tableperhierarchy.model.Employee1FTE;
import com.demo.springmavencrud.tableperhierarchy.repository.EmployeeRepositoryTablePerHierarchy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmployeeServiceTablePerHierarchy {

    @Autowired
    private EmployeeRepositoryTablePerHierarchy employeeRepository;
    public EmployeeServiceTablePerHierarchy() {

    }


    public Employee1FTC createEmployeeFTC(Employee1FTC employee) {

        return employeeRepository.save(employee);
    }

    public Employee1FTE createEmployeeFTE(Employee1FTE employee) {

        return employeeRepository.save(employee);
    }

    public List<Employee1> viewAllEmployeeTablePerHierarchy(String type) {
        if (type == null) {
            return employeeRepository.findAll();
        }
        return employeeRepository.getEmployeesBasedOnType(type);
    }



    public Employee1 viewEmployeeById(int empId) {
        return employeeRepository.findById(empId).get();
    }

    public void updateEmployeeById(int empId, String email, String ph) {

        //  employeeRepository.save()


    }

    public String deleteEmployeeById(int empId) {
        employeeRepository.deleteById(empId);
        return "Employee with id " + empId + " deleted.";
    }
}
