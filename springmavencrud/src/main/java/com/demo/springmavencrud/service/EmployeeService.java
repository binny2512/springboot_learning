package com.demo.springmavencrud.service;

import com.demo.springmavencrud.model.Employee;
import com.demo.springmavencrud.model.EmployeeFTC;
import com.demo.springmavencrud.model.EmployeeFTE;
import com.demo.springmavencrud.repository.EmployeeDAO;
import com.demo.springmavencrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    private List<Employee> empList = new ArrayList<>();

    public EmployeeService() {

    }

    public List<Employee> getEmpList(){
        return empList;
    }
    public EmployeeFTC createEmployeeFTC(EmployeeFTC employee) {

        return employeeRepository.save(employee)  ;
        //      empList.add(employee);
    }

    public EmployeeFTE createEmployeeFTE(EmployeeFTE employee) {

        return employeeRepository.save(employee)  ;
        //empList.add(employee);
    }

    public List<Employee> viewAllEmployee()
    {
        return employeeRepository.findAll();
    }

    public Employee viewEmployeeById(int empId) {
        return employeeRepository.findById(empId).get();
    }

    public void updateEmployeeById(int empId, String email, String ph) {

        for(Employee emp : empList){
            if(emp.getEmpID()==empId){
                emp.setEmail(email);
                emp.setPh(ph);
            }

        }

    }

    public String deleteEmployeeById(int empId) {
        employeeRepository.deleteById(empId);
        return "Employee with id "+empId+" deleted.";
    }
}
