
package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeH2Service;

import java.util.*;

// Write your code here
@RestController
public class EmployeeController {
  @Autowired
  public EmployeeH2Service es;

  @GetMapping("/employees")
  public ArrayList<Employee> getAllEmployees() {
    return es.getAllEmployees();
  }

  @PostMapping("/employees")
  public Employee addEmployee(@RequestBody Employee employee) {
    return es.addEmployee(employee);
  }

  @GetMapping("/employees/{employeeId}")
  public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {

    return es.getEmployeeById(employeeId);
  }

  @PutMapping("/employees/{employeeId}")
  public Employee updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee) {
    return es.updateEmployee(employeeId, employee);
  }

  @DeleteMapping("/employees/{employeeId}")
  public void deleteEmployee(@PathVariable("employeeId") int employeeId) {
    es.deleteEmployee(employeeId);
  }
}