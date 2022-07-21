package com.semicolon.studentmanagement.dto.requests;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentRequest {
    private String name;
    private String email;
    private String dob;
    private int age;
    private String address;
}
