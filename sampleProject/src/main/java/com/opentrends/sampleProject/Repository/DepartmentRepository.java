package com.opentrends.sampleProject.Repository;

import com.opentrends.sampleProject.Model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {
    
}