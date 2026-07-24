package com.example.todoapp.service;

import com.example.todoapp.entity.Department;
import com.example.todoapp.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService {
   private final DepartmentRepository departmentRepository;
      public DepartmentService(DepartmentRepository departmentRepository){
       this.departmentRepository=departmentRepository;

}
 public List<Department> getAllDepartments() {
          return departmentRepository.findAll();
 }
 public Department saveDepartment (Department department){
          return departmentRepository.save(department);
 }
 public Department getDepartmentById(Long id){
          return departmentRepository.findById(id).orElse(null);
 }
 public Department updateDepartment(Long id, Department department){
          Department existingDepartment=departmentRepository.findById(id).orElse(null);
        if (existingDepartment==null){
            return null;
        }
        existingDepartment.setName(department.getName());
        existingDepartment.setCode(department.getCode());
        return departmentRepository.save(existingDepartment);
      }
public void deleteDepartment (Long id){
          departmentRepository.deleteById(id);
}


}
