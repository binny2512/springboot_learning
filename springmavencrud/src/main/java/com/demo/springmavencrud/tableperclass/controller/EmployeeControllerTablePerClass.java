package com.demo.springmavencrud.tableperclass.controller;

import com.demo.springmavencrud.tableperclass.model.Employee;
import com.demo.springmavencrud.tableperclass.model.EmployeeFTC;
import com.demo.springmavencrud.tableperclass.model.EmployeeFTE;
import com.demo.springmavencrud.tableperclass.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeControllerTablePerClass
{
    @Autowired
    private EmployeeService empService;

    @PostMapping("/employees/ftc")
    public EmployeeFTC createEmployeeFTC(@RequestBody EmployeeFTC employee){
        return empService.createEmployeeFTC(employee);
       // return "Created contractor employee";
    }

    @PostMapping("/employees/fte")
    public EmployeeFTE createEmployeeFTE(@RequestBody EmployeeFTE employee){
        return empService.createEmployeeFTE(employee);
       // return "Created Full time employee";
    }

    @GetMapping("/employees/")
    public List<Employee> viewAllEmployee(@RequestParam(required = false) String empType){

        List<Employee> empList = empService.viewAllEmployee(empType);
        return empList;
    }

    @GetMapping("/employees/{empId}")
    public Employee viewEmployeeByID(@PathVariable int empId){

        Employee emp = empService.viewEmployeeById(empId);
        return emp;
    }

    @PatchMapping("/employees/{empId}")
    public String saveOrUpdateEmployeeByID(@PathVariable int empId, @RequestParam String email, @RequestParam String ph){

        empService.updateEmployeeById(empId, email, ph);
        return "Employee updated";
    }

    @DeleteMapping("/employees/{empId}")
    public String deleteEmployeeByID(@PathVariable int empId){

        return empService.deleteEmployeeById(empId);
    }

}
