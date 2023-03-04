package com.semicolon.studentmanagement.services;

import com.semicolon.studentmanagement.dto.requests.AddStudentRequest;
import com.semicolon.studentmanagement.dto.requests.DeleteStudentRequest;
import com.semicolon.studentmanagement.dto.response.AddStudentResponse;
import com.semicolon.studentmanagement.dto.response.DeleteStudentResponse;
import com.semicolon.studentmanagement.model.data.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {
    AddStudentResponse addStudent(AddStudentRequest request);
    public Page<Student> getAllStudents(int page, int size);
    public  void deleteStudent(String studentID);






}
