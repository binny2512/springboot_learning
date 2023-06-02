package com.demo.springmavencrud.repository;

import com.demo.springmavencrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select e from EmployeeFTE e ")
    public List<Employee> getFTEEmployees();

    @Query("select e from EmployeeFTC e")
    public List<Employee> getFTCEmployees();
}
