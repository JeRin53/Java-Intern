package com.opentrends.sampleProject.Service;

import com.opentrends.sampleProject.Model.Employee;
import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> fetchEmployees();

    Employee updateEmployee(Employee employee, Long id);

    String deleteEmployee(Long id);
}