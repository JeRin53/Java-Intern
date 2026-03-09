package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.DepartmentDto;
import com.opentrends.sampleProject.Model.Department;
import org.springframework.stereotype.Component;

@Component
public class ConvertEntityToDtoClass {
    public DepartmentDto convertEntityToDto(Department department){
        DepartmentDto departmentDto=new DepartmentDto();
        departmentDto.setDepartmentId(department.getDepartmentId());
        departmentDto.setDepartmentName(department.getDepartmentName());

        return departmentDto;
    }
}
