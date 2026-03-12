package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.EmployeeDto;
import com.opentrends.sampleProject.Model.Employee;
import org.springframework.stereotype.Component;

@Component
public class ConverterEmployeeDtoToEmployee {

    public Employee convert(EmployeeDto dto){

        Employee employee = new Employee();

        employee.setEmpId(dto.getEmpId());
        employee.setEmpName(dto.getEmpName());

        return employee;
    }
}