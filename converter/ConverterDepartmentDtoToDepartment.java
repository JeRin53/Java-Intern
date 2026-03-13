package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.DepartmentDto;
import com.opentrends.sampleProject.Model.Department;
import org.springframework.stereotype.Component;

@Component
public class ConverterDepartmentDtoToDepartment {

    public Department convert(DepartmentDto dto){

        Department department = new Department();

        department.setDepartmentId(dto.getDepartmentId());
        department.setDepartmentName(dto.getDepartmentName());

        return department;
    }
}