package com.opentrends.sampleProject.Service;

import com.opentrends.sampleProject.Model.Employee;
import com.opentrends.sampleProject.Repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> fetchEmployees(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee, Long id){

        Employee db = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        db.setEmpName(employee.getEmpName());

        return employeeRepository.save(db);
    }

    public String deleteEmployee(Long id){

        Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        employeeRepository.delete(emp);

        return "Employee deleted successfully";
    }
}