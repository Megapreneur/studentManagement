package com.semicolon.studentmanagement.services;

import com.semicolon.studentmanagement.model.data.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
