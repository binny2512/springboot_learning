package com.demo.springmavencrud.controller;

import com.demo.springmavencrud.model.Employee;
import com.demo.springmavencrud.model.EmployeeFTC;
import com.demo.springmavencrud.model.EmployeeFTE;
import com.demo.springmavencrud.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController
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

    @GetMapping("/employees")
    public List<Employee> viewAllEmployee(@RequestParam(required = false) String empType){

        List<Employee> empList = empService.viewAllEmployee();
        return empList;
    }

    @GetMapping("/employees/{empId}")
    public Employee viewEmployeeByID(@PathVariable int empId){

        Employee emp = empService.viewEmployeeById(empId);
        return emp;
    }

    @PutMapping("/employees/{empId}")
    public String saveOrUpdateEmployeeByID(@PathVariable int empId, @RequestParam String email, @RequestParam String ph){

        empService.updateEmployeeById(empId, email, ph);
        return "Employee updated";
    }

    @DeleteMapping("/employees/{empId}")
    public String deleteEmployeeByID(@PathVariable int empId){

        return empService.deleteEmployeeById(empId);
        //return "Employee Deleted";
    }

    /*public static void main(String[] args) throws JsonProcessingException {
        EmployeeFTE emp = new EmployeeFTE(1,"A","test@gmail.com","1234", "test address", true, true, true, "FTE");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(emp));

    }*/
}
