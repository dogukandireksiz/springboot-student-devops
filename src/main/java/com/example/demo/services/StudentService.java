package com.example.demo.services;

import com.example.demo.dto.DtoStudent;
import com.example.demo.dto.DtoStudentIU;
import com.example.demo.entities.Student;

import java.util.List;

public interface StudentService {

    public DtoStudent saveStudent(DtoStudentIU student);
    public DtoStudent getStudentById(int id);
    public List<DtoStudent> getAllStudents();
    public boolean deleteStudentById(int id);
    public DtoStudent updateStudent(Integer id, DtoStudentIU updateStudent);
}
