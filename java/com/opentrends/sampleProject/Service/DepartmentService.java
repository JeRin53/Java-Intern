package com.opentrends.sampleProject.Service;


import com.opentrends.sampleProject.Model.Department;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartment();

    Department updateDepartment(Department department, Long departmentID);

    String deleteDepartment(Long departmentId);

    List<Department> findDepartmentByName(String name);
}