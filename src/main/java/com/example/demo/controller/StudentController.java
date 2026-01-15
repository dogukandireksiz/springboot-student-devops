package com.example.demo.controller;
import com.example.demo.dto.DtoStudent;
import com.example.demo.dto.DtoStudentIU;
import com.example.demo.entities.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentController {
    public DtoStudent saveStudent(DtoStudentIU DtoStudentIU);
    public DtoStudent getStudentById(int id);
    public List<DtoStudent> getAllStudents();
    public boolean deleteStudentById(int id);
    public DtoStudent DtoStudentupdateStudent(Integer id, DtoStudentIU updatedDtoStudentIU);




}
