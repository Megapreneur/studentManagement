package com.semicolon.studentmanagement.services;


import com.semicolon.studentmanagement.Mapper.Mapper;
import com.semicolon.studentmanagement.dto.requests.AddStudentRequest;
import com.semicolon.studentmanagement.dto.requests.DeleteStudentRequest;
import com.semicolon.studentmanagement.dto.response.AddStudentResponse;
import com.semicolon.studentmanagement.dto.response.DeleteStudentResponse;
import com.semicolon.studentmanagement.exception.StudentAlreadyExistException;
import com.semicolon.studentmanagement.exception.StudentIDIsInvalidException;
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
        if (studentRepository.existsByEmail(request.getEmail()))throw  new StudentAlreadyExistException("Student already exist");
        Student newStudent = new Student();
        Mapper.map(request, newStudent);
        String studentID = String.valueOf(UUID.randomUUID().getMostSignificantBits());
        studentID = "ST"+studentID.substring(1, 4);
        newStudent.setStudentID(studentID);

        if (studentRepository.existsByStudentID(newStudent.getStudentID())){
            String studentID1;
            studentID1 = "ST"+studentID.substring(1, 4);
            newStudent.setStudentID(studentID1);
        }
        Student savedStudent = studentRepository.save(newStudent);
        AddStudentResponse response = new AddStudentResponse();
        Mapper.map(savedStudent, response);
        return response;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(String studentID) {
        Student student = studentRepository.findByStudentId(studentID);
        if (student == null){
            throw new StudentIDIsInvalidException("No student has is assigned to this StudentId");
        }
        studentRepository.delete(student);
    }




}
