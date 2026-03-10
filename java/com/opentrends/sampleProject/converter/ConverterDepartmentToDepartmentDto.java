package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.DepartmentDto;
import com.opentrends.sampleProject.Model.Department;
import org.springframework.stereotype.Component;

@Component
public class ConverterDepartmentToDepartmentDto {

    public Department convert(DepartmentDto departmentDto){
        Department department=new Department();
        department.setDepartmentId(departmentDto.getDepartmentId());
        department.setDepartmentName(departmentDto.getDepartmentName());
        department.setEmployees(department.getEmployees(departmentDto.getEmployees()));
        return department;
    }
}
