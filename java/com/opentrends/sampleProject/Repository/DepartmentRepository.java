package com.opentrends.sampleProject.Repository;

import com.opentrends.sampleProject.Model.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {
    @Query("Select d from Department d where d.departmentName=?1")
    List<Department> findDepartmentByName(String name);
}