package com.semicolon.studentmanagement.dto.requests;


import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class AddStudentRequest {
    @NonNull
    private String name;
    @NonNull
    private String email;
//    @NonNull
//    private LocalDate dob;
    @NonNull
    private String address;
//    private int age;
}
