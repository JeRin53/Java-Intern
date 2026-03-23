package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.DepartmentDto;
import com.opentrends.sampleProject.Model.Department;
import com.opentrends.sampleProject.Model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConverterDepartmentDtoToDepartment {

    public Department convert(DepartmentDto dto){

        Department department = new Department();

        department.setDepartmentId(dto.getDepartmentId());
        department.setDepartmentName(dto.getDepartmentName());
        if(dto.getEmployees() != null) {
            List<Employee> employees = dto.getEmployees()
                    .stream()
                    .map(employeeDto -> {
                        Employee emp = new Employee();
                        emp.setEmpId(employeeDto.getEmpId());
                        emp.setEmpName(employeeDto.getEmpName());
                        return emp;
                    }).collect(Collectors.toList());

            department.setEmployees(employees);
        };

        return department;
    }
}