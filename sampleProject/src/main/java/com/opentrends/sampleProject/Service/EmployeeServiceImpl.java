package com.opentrends.sampleProject.Service;

import com.opentrends.sampleProject.Model.Employee;
import com.opentrends.sampleProject.Repository.DepartmentRepository;
import com.opentrends.sampleProject.Repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> fetchEmployees(){
        return  employeeRepository.getAllEmployees();
    }

    @Override
    public List<Employee> findEmployeeByName(String name){
        return employeeRepository.findEmployeeByName(name);
    }

    public Employee updateEmployee(Employee employee, Long id){

        Employee db = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        db.setEmpName(employee.getEmpName());

        return employeeRepository.save(db);
    }

    public String deleteEmployee(Long empId){

        Optional<Employee> employee = employeeRepository.findById(empId);
        if(employee.isEmpty()){
            return  "employee not found";
        }
        employeeRepository.delete(employee.get());

        return "Employee deleted successfully";
    }
}