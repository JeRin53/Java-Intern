package com.opentrends.sampleProject.Controller;

import com.opentrends.sampleProject.Dto.EmployeeDto;
import com.opentrends.sampleProject.Model.Employee;
import com.opentrends.sampleProject.Service.EmployeeService;
import com.opentrends.sampleProject.converter.ConverterEmployeeDtoToEmployee;
import com.opentrends.sampleProject.converter.ConverterEmployeeToEmployeeDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ConverterEmployeeDtoToEmployee dtoToEntityConverter;

    @Autowired
    private ConverterEmployeeToEmployeeDto entityToDtoConverter;



    @PostMapping("/addEmployee")
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employeeDto){

        Employee employee = dtoToEntityConverter.convert(employeeDto);

        Employee savedEmployee = employeeService.saveEmployee(employee);

        return entityToDtoConverter.convert(savedEmployee);
    }



    @GetMapping("/getEmployeeInfo")
    public List<EmployeeDto> fetchEmployees(){

        List<Employee> employees = employeeService.fetchEmployees();

        return employees.stream()
                .map(entityToDtoConverter::convert)
                .collect(Collectors.toList());
    }



    @GetMapping("/employeeByName/{name}")
    public List<EmployeeDto> findEmployeeByName(@PathVariable String name){

        List<Employee> employees = employeeService.findEmployeeByName(name);

        return employees.stream()
                .map(entityToDtoConverter::convert)
                .collect(Collectors.toList());
    }



    @PutMapping("/putEmployee/{id}")
    public EmployeeDto updateEmployee(
            @RequestBody EmployeeDto employeeDto,
            @PathVariable Long id){

        Employee employee = dtoToEntityConverter.convert(employeeDto);

        Employee updated = employeeService.updateEmployee(employee, id);

        return entityToDtoConverter.convert(updated);
    }



    @DeleteMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam Long empId){

        return employeeService.deleteEmployee(empId);
    }
}