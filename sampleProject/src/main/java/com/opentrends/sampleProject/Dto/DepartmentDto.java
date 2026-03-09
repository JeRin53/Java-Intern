package com.opentrends.sampleProject.Dto;

import com.opentrends.sampleProject.Model.Department;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

@Getter
@Setter
public class DepartmentDto {
    @NotNull(message = "A valid id should be entered")
    private Long departmentId;
    @UniqueElements
    private String departmentName;
}
