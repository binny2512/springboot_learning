package com.demo.springmavencrud.tableperclass.repository;

import com.demo.springmavencrud.tableperclass.model.Employee;
import com.demo.springmavencrud.tableperhierarchy.model.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select e from EmployeeFTE e ")
    public List<Employee> getFTEEmployees();

    @Query("select e from EmployeeFTC e")
    public List<Employee> getFTCEmployees();
}
