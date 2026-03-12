package com.opentrends.sampleProject.Repository;

import com.opentrends.sampleProject.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    @Query("SELECT e FROM Employee e")
    List<Employee> getAllEmployees();

    @Query("SELECT e FROM Employee e WHERE e.empName = ?1")
    List<Employee> findEmployeeByName(String name);
}