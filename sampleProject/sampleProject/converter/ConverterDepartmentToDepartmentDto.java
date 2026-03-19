package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.DepartmentDto;
import com.opentrends.sampleProject.Dto.EmployeeDto;
import com.opentrends.sampleProject.Model.Department;
import org.springframework.stereotype.Component;

@Component
public class ConverterDepartmentToDepartmentDto {

    public DepartmentDto convert(Department department){

        DepartmentDto dto = new DepartmentDto();

        dto.setDepartmentId(department.getDepartmentId());
        dto.setDepartmentName(department.getDepartmentName());
        dto.setEmployees(department.getEmployees()
                .stream()
                .map(employee -> {
                    EmployeeDto e = new EmployeeDto();
                    e.setEmpId(employee.getEmpId());
                    e.setEmpName(employee.getEmpName());
                    return e;
                })
                .toList()
        );
        return dto;
    }
}