package com.example.todoapp.service;

import com.example.todoapp.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
   private final DepartmentRepository departmentRepository;
      public DepartmentService(DepartmentRepository departmentRepository){
       this.departmentRepository=departmentRepository;

}

}
