package com.semicolon.studentmanagement.services;


import com.semicolon.studentmanagement.Mapper.Mapper;
import com.semicolon.studentmanagement.dto.requests.AddStudentRequest;
import com.semicolon.studentmanagement.dto.response.AddStudentResponse;
import com.semicolon.studentmanagement.model.data.Student;
import com.semicolon.studentmanagement.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public AddStudentResponse addStudent(AddStudentRequest request) {
        Student newStudent = new Student();
        Mapper.map(request, newStudent);
        String studentID = String.valueOf(UUID.randomUUID().getMostSignificantBits());
        studentID = "ST"+studentID.substring(1, 4);
        newStudent.setStudentID(studentID);
        Student savedStudent = studentRepository.save(newStudent);
        AddStudentResponse response = new AddStudentResponse();
        Mapper.map(savedStudent, response);
        return response;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
