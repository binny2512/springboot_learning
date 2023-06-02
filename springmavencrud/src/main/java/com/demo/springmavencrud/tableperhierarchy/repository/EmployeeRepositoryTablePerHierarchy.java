package com.demo.springmavencrud.tableperhierarchy.repository;

import com.demo.springmavencrud.tableperclass.model.Employee;
import com.demo.springmavencrud.tableperhierarchy.model.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepositoryTablePerHierarchy extends JpaRepository<Employee1, Integer> {
    @Query("select e from Employee1 e where type=?1")
    public List<Employee1> getEmployeesBasedOnType(String type);

}
