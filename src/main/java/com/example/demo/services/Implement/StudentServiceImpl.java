package com.example.demo.services.Implement;

import com.example.demo.dto.DtoStudent;
import com.example.demo.dto.DtoStudentIU;
import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.services.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU DtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(DtoStudentIU, student);
        Student savedStudent = studentRepository.save(student);
        BeanUtils.copyProperties(savedStudent, response);
        return response;
    }

    @Override
    public DtoStudent getStudentById(int id) {
        Student student = studentRepository.findById(id).orElse(null);
        DtoStudent response = new DtoStudent();
        BeanUtils.copyProperties(student, response);
        return response;
    }

    @Override
    public List<DtoStudent> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        List<DtoStudent> dtoStudentList = new ArrayList<>();
        for (Student student : studentList) {
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(student, dtoStudent);
            dtoStudentList.add(dtoStudent);
        }
        return dtoStudentList;
    }

    @Override
    public boolean deleteStudentById(int id) {
        for (Student student : studentRepository.findAll()) {
            if (student.getId().equals(id)) {
                studentRepository.delete(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public DtoStudent updateStudent(Integer id, DtoStudentIU updatedStudentDtoIU) {
        Student student = studentRepository.getReferenceById(id);
        if(student != null){
            student.setFirstName(updatedStudentDtoIU.getFirstName());
            student.setLastName(updatedStudentDtoIU.getLastName());
            student.setBirtofDate(updatedStudentDtoIU.getBirtofDate());
            studentRepository.save(student);
        }
        return null;
    }
}
