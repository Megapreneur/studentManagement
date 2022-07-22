package com.semicolon.studentmanagement.controller;


import com.semicolon.studentmanagement.dto.requests.AddStudentRequest;
import com.semicolon.studentmanagement.dto.response.AddStudentResponse;
import com.semicolon.studentmanagement.model.data.Student;
import com.semicolon.studentmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/register")
    public AddStudentResponse register(@RequestBody AddStudentRequest request){
        return studentService.addStudent(request);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
