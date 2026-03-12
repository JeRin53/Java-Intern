package com.opentrends.sampleProject.Repository;

import com.opentrends.sampleProject.Model.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {

    @Query("SELECT d FROM Department d")
    List<Department> getAllDepartments();

    @Query("SELECT d FROM Department d WHERE d.departmentName = ?1")
    List<Department> findDepartmentByName(String name);
}