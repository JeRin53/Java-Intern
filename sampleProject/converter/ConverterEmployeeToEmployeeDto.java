package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.EmployeeDto;
import com.opentrends.sampleProject.Model.Employee;
import org.springframework.stereotype.Component;

@Component
public class ConverterEmployeeToEmployeeDto {

    public EmployeeDto convert(Employee employee){

        EmployeeDto dto = new EmployeeDto();

        dto.setEmpId(employee.getEmpId());
        dto.setEmpName(employee.getEmpName());

        return dto;
    }
}
