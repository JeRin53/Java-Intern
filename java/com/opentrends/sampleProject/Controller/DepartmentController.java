package com.opentrends.sampleProject.Controller;

import com.opentrends.sampleProject.converter.ConverterDepartmentToDepartmentDto;
import com.opentrends.sampleProject.converter.ConverterDepartmentDtoToDepartment;
import com.opentrends.sampleProject.Dto.DepartmentDto;
import com.opentrends.sampleProject.Model.Department;
import com.opentrends.sampleProject.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private ConverterDepartmentToDepartmentDto dtoToEntityClass;

    @Autowired
    private ConverterDepartmentDtoToDepartment entityToDtoClass;



    @PostMapping("/addDepartment")
    public DepartmentDto saveDepartment(@RequestBody DepartmentDto departmentDto) {
        Department department= dtoToEntityClass.convert(departmentDto);
        Department savedDepartment= departmentService.saveDepartment(department);
        return entityToDtoClass.convert(savedDepartment);
    }

    @GetMapping("/getDepartmentInfo")
    public List<DepartmentDto> fetchDepartment() {
        List<Department> departments=departmentService.fetchDepartment();
        return departments.stream()
                .map(entityToDtoClass::convert)
                .collect(Collectors.toList());
    }


    @GetMapping("departmentBYName/{name}")
    public List<Department> findDepartmentByName(@PathVariable String name){
        return departmentService.findDepartmentByName(name);
    }


    @PutMapping("/putDepartment/{departmentId}")
    public DepartmentDto updateDepartment(@RequestBody DepartmentDto departmentDto, @PathVariable("departmentId") Long departmentId) {
        Department department = dtoToEntityClass.convert(departmentDto);
        Department update=departmentService.updateDepartment(department,departmentId);
        return entityToDtoClass.convert(update);
    }

    /*@DeleteMapping("/deleteDepartment/{departmentId}")
    public ResponseEntity<Boolean> deleteDepartment(@PathVariable("departmentId") Long departmentId) {

        if (departmentId == null || !departmentService.existsByID(departmentId)) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item not found");
        }
        departmentService.deleteDepartment(departmentId);
        return "deleted sucessfully";
    }*/


    @DeleteMapping("/deleteDepartment")
    public String deleteDepartment(@RequestParam("departmentId") Long departmentId) {

        return departmentService.deleteDepartment(departmentId);
    }

  /*  // Repetated delete for checking Request Param
    @DeleteMapping("/deleteDepartment")
    public String deleteDepartment(@RequestParam Long departmentId) {
        departmentService.deleteDepartment(departmentId);
        return "deleted sucessfully";
    }*/
}