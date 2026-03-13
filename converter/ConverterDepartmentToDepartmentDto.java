package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.DepartmentDto;
import com.opentrends.sampleProject.Model.Department;
import org.springframework.stereotype.Component;

@Component
public class ConverterDepartmentToDepartmentDto {

    public DepartmentDto convert(Department department){

        DepartmentDto dto = new DepartmentDto();

        dto.setDepartmentId(department.getDepartmentId());
        dto.setDepartmentName(department.getDepartmentName());

        return dto;
    }
}