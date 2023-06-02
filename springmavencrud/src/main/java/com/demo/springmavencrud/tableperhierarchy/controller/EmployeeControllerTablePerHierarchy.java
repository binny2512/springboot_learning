package com.demo.springmavencrud.tableperhierarchy.controller;

import com.demo.springmavencrud.tableperhierarchy.model.Employee1;
import com.demo.springmavencrud.tableperhierarchy.model.Employee1FTC;
import com.demo.springmavencrud.tableperhierarchy.model.Employee1FTE;
import com.demo.springmavencrud.tableperhierarchy.service.EmployeeServiceTablePerHierarchy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeControllerTablePerHierarchy
{
    @Autowired
    private EmployeeServiceTablePerHierarchy empService;

    @PostMapping("/employees1/ftc")
    public Employee1FTC createEmployeeFTCTablePerHierarchy(@RequestBody Employee1FTC employee){
        return empService.createEmployeeFTC(employee);
        // return "Created contractor employee";
    }

    @PostMapping("/employees1/fte")
    public Employee1FTE createEmployeeFTETablePerHierarchy(@RequestBody Employee1FTE employee){
        return empService.createEmployeeFTE(employee);
        // return "Created Full time employee";
    }

    @GetMapping("/employees1")
    public List<Employee1> viewAllEmployeeTablePerHierarchy(@RequestParam(required = false) String empType){

        List<Employee1> empList = empService.viewAllEmployeeTablePerHierarchy(empType);
        return empList;
    }

    @GetMapping("/employees1/{empId}")
    public Employee1 viewEmployeeByID(@PathVariable int empId){

        Employee1 emp = empService.viewEmployeeById(empId);
        return emp;
    }

    @PatchMapping("/employees1/{empId}")
    public String saveOrUpdateEmployeeByID(@PathVariable int empId, @RequestParam String email, @RequestParam String ph){

        empService.updateEmployeeById(empId, email, ph);
        return "Employee updated";
    }

    @DeleteMapping("/employees1/{empId}")
    public String deleteEmployeeByID(@PathVariable int empId){

        return empService.deleteEmployeeById(empId);

    }

}
