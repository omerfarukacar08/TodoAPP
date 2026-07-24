package com.example.todoapp.controller;
import  com.example.todoapp.entity.Department;
import com.example.todoapp.facade.DepartmentFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController   {
private final DepartmentFacade departmentFacade;

public DepartmentController(DepartmentFacade departmentFacade){

    this.departmentFacade=departmentFacade;
}
@GetMapping
public List<Department> getAllDepartments() {
return departmentFacade.getAllDepartments();
}
@PostMapping
   public Department saveDepartment(@RequestBody Department department){
       return departmentFacade.saveDepartment(department);
}
@GetMapping("/{id}")
 public Department getDepartmentById(@PathVariable Long id){
           return departmentFacade.getDepartmentById(id);
}
@PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id,
                                       @RequestBody Department department){
    return departmentFacade.updateDepartment(id,department);
}
@DeleteMapping("/{id}")
public void deleteDepartment(@PathVariable Long id){
    departmentFacade.deleteDepartment(id);
}

}
