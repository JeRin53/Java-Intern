package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.EmployeeDto;
import com.opentrends.sampleProject.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConverterEmployeeToEmployeeDto {

//    @Autowired
//    private ConverterDepartmentToDepartmentDto converterDepartmentToDepartmentDto;
    public EmployeeDto convert(Employee employee){

        EmployeeDto dto = new EmployeeDto();

        dto.setEmpId(employee.getEmpId());
        dto.setEmpName(employee.getEmpName());
        dto.setPassword(employee.getPassword());
//        dto.setDepartmentDto(converterDepartmentToDepartmentDto.convert(employee.getDepartment()));
        return dto;
    }
}
