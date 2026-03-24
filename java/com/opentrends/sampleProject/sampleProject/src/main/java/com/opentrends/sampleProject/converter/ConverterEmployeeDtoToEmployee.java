package com.opentrends.sampleProject.converter;

import com.opentrends.sampleProject.Dto.EmployeeDto;
import com.opentrends.sampleProject.Model.Department;
import com.opentrends.sampleProject.Model.Employee;
import com.opentrends.sampleProject.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ConverterEmployeeDtoToEmployee {

//    @Autowired
//    private DepartmentRepository departmentRepository;

    public Employee convert(EmployeeDto dto){

        Employee employee = new Employee();
//        Department department=departmentRepository.findById(dto.getDepartmentDto().getDepartmentId()).get();
        employee.setEmpId(dto.getEmpId());
        employee.setEmpName(dto.getEmpName());
        employee.setPassword(dto.getPassword());
//        employee.setDepartment(department);
        return employee;
    }
}