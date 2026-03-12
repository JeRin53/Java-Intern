package com.opentrends.sampleProject.Controller;

import com.opentrends.sampleProject.Model.Employee;
import com.opentrends.sampleProject.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.fetchEmployees();
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Long id){
        return employeeService.updateEmployee(employee,id);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
}
