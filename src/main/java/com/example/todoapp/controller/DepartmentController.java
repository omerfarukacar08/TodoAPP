package com.example.todoapp.controller;
import com.example.todoapp.service.DepartmentService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/departments")
public class DepartmentController   {
private final DepartmentService departmentService;

public DepartmentController(DepartmentService departmentService){
    this.departmentService=departmentService;
}

}
