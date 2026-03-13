package com.opentrends.sampleProject.Service;

import com.opentrends.sampleProject.Model.Department;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartment();

    Page<Department> fetchDepartmentWithPagination(int page, int size, String sortBy);

    Department updateDepartment(Department department, Long departmentID);

    String deleteDepartment(Long departmentId);

    List<Department> findDepartmentByName(String name);
}