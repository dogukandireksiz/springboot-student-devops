package com.example.demo.controller.implement;

import com.example.demo.controller.StudentController;
import com.example.demo.dto.DtoStudent;
import com.example.demo.dto.DtoStudentIU;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public DtoStudent saveStudent(@RequestBody DtoStudentIU DtostudentIU) {
        return studentService.saveStudent(DtostudentIU);
    }

    @GetMapping(path = "/get/{id}")
    @Override
    public DtoStudent getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(path = "/get")
    @Override
    public List<DtoStudent> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public boolean deleteStudentById(@PathVariable int id) {
        return studentService.deleteStudentById(id);
    }

    @PutMapping(path = "/put/{id}")
    @Override
    public DtoStudent DtoStudentupdateStudent(@PathVariable(name = "id") Integer id, @RequestBody DtoStudentIU updatedStudentDtoIU) {
        return studentService.updateStudent(id, updatedStudentDtoIU);
    }


}
