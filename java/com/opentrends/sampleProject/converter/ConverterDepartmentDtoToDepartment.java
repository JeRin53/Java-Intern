package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.DepartmentDto;
import com.opentrends.sampleProject.Model.Department;
import org.springframework.stereotype.Component;

@Component
public class ConverterDepartmentDtoToDepartment {
    public DepartmentDto convert(Department department){
        DepartmentDto departmentDto=new DepartmentDto();
        departmentDto.setDepartmentId(department.getDepartmentId());
        departmentDto.setDepartmentName(department.getDepartmentName());
        departmentDto.setEmployees(department.getEmployees());
        return departmentDto;
    }
}
