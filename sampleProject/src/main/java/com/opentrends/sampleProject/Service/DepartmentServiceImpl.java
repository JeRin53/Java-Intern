package com.opentrends.sampleProject.Service;

import com.opentrends.sampleProject.Model.Department;
import com.opentrends.sampleProject.Repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartment() {
        return (List<Department>) departmentRepository.getAllDepartments();
    }

    @Override
    public List<Department> findDepartmentByName(String name){
        return departmentRepository.findDepartmentByName(name);
    }

    @Override
    public Department updateDepartment(Department department, Long id){

        Department db = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        db.setDepartmentName(department.getDepartmentName());

        return departmentRepository.save(db);
    }

    @Override
    public String deleteDepartment(Long departmentId){

        Optional<Department> department = departmentRepository.findById(departmentId);

        if(department.isEmpty()){
            return "Department not found";
        }

        departmentRepository.delete(department.get());

        return "Deleted Successfully";
    }
}