package com.semicolon.studentmanagement.Mapper;

import com.semicolon.studentmanagement.dto.requests.AddStudentRequest;
import com.semicolon.studentmanagement.dto.response.AddStudentResponse;
import com.semicolon.studentmanagement.model.data.Student;

import java.time.LocalDate;

public class Mapper {
    public static void map(AddStudentRequest request, Student newStudent) {
        newStudent.setName(request.getName());
        newStudent.setAddress(request.getAddress());
//        newStudent.setDob(request.getDob());
        newStudent.setEmail(request.getEmail());
//        newStudent.setAge(request.getAge());
    }

    public static void map(Student savedStudent, AddStudentResponse response) {
        response.setMessage("Welcome on board " + savedStudent.getName().toUpperCase() + ". Your student ID is " + savedStudent.getStudentID());
    }
}
