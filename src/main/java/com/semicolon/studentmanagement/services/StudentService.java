package com.semicolon.studentmanagement.services;

import com.semicolon.studentmanagement.dto.requests.AddStudentRequest;
import com.semicolon.studentmanagement.dto.response.AddStudentResponse;
import com.semicolon.studentmanagement.model.data.Student;

import java.util.List;

public interface StudentService {
    AddStudentResponse addStudent(AddStudentRequest request);
    public List<Student> getAllStudents();



}
