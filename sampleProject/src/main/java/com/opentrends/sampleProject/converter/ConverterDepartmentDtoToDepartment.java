package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.DepartmentDto;
import com.opentrends.sampleProject.Model.Department;
import com.opentrends.sampleProject.Model.Employee;
import com.opentrends.sampleProject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConverterDepartmentDtoToDepartment {

    @Autowired
    private EmployeeRepository employeeRepository;
    public Department convert(DepartmentDto dto){
        List<Employee> employee= employeeRepository.findAllById(dto.getDepartmentId());
        Department department = new Department();

        department.setDepartmentId(dto.getDepartmentId());
        department.setDepartmentName(dto.getDepartmentName());
        department.setEmployees(employee);

        return department;
    }
}