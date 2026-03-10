
package com.opentrends.sampleProject.Service;

import com.opentrends.sampleProject.Model.Department;
import com.opentrends.sampleProject.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        departmentRepository.save(department);
        return department;
    }

    @Override
    public List<Department> fetchDepartment() {
        return(List<Department>) departmentRepository.findAll();
    }

    @Override
    public List<Department> findDepartmentByName(String name){
        return departmentRepository.findDepartmentByName(name);
    }

    public Department updateDepartment(Department department, Long departmentID) {
        Department db = departmentRepository.findById(departmentID).get();

        if (Objects.nonNull(department.getDepartmentName())
                && !"".equalsIgnoreCase(department.getDepartmentName())) {
            db.setDepartmentName(department.getDepartmentName());

        }
        return departmentRepository.save(db);
    }

    public String  deleteDepartment(Long departmentId){
        Optional<Department> department = departmentRepository.findById(departmentId);
        try{
            if (department.isEmpty()) {
                throw new RuntimeException("No Department found");
            }
            departmentRepository.delete(department.get());
            return "Deleted Successfully";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }
}
