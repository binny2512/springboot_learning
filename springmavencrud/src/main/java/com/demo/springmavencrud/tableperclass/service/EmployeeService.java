package com.demo.springmavencrud.tableperclass.service;

import com.demo.springmavencrud.tableperclass.model.Employee;
import com.demo.springmavencrud.tableperclass.model.EmployeeFTC;
import com.demo.springmavencrud.tableperclass.model.EmployeeFTE;
import com.demo.springmavencrud.tableperclass.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    private List<Employee> empList = new ArrayList<>();

    public EmployeeService() {

    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public EmployeeFTC createEmployeeFTC(EmployeeFTC employee) {

        return employeeRepository.save(employee);
        //      empList.add(employee);
    }

    public EmployeeFTE createEmployeeFTE(EmployeeFTE employee) {

        return employeeRepository.save(employee);
        //empList.add(employee);
    }

    public List<Employee> viewAllEmployee(String type) {
        if (type == null) {
            return employeeRepository.findAll();
        } else if (type.equalsIgnoreCase("FTE")) {
            return employeeRepository.getFTEEmployees();
        } else if (type.equalsIgnoreCase("FTC")) {
            return employeeRepository.getFTCEmployees();
        }
        return new ArrayList<>();

    }


    public Employee viewEmployeeById(int empId) {
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
