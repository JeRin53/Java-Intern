package com.opentrends.sampleProject.Dto;

import com.opentrends.sampleProject.Model.Department;
import com.opentrends.sampleProject.Model.Employee;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

@Getter
@Setter
public class DepartmentDto {

    private Long departmentId;

    private String departmentName;
    private List<EmployeeDto> employees;
}
