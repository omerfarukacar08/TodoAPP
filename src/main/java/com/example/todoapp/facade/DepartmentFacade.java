package com.example.todoapp.facade;
import com.example.todoapp.entity.Department;
import com.example.todoapp.service.DepartmentService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentFacade {
private final DepartmentService departmentService;

public DepartmentFacade(DepartmentService departmentService){

    this.departmentService=departmentService;
}
public List<Department> getAllDepartments() {
    return departmentService.getAllDepartments();
    }
    public Department saveDepartment(Department department){
    return departmentService.saveDepartment(department);
    }
    public Department getDepartmentById(Long id){
    return departmentService.getDepartmentById(id);
    }
public Department updateDepartment(Long id,Department department){
    return departmentService.updateDepartment(id,department);
}
public void deleteDepartment(Long id){
    departmentService.deleteDepartment(id);
}
}
