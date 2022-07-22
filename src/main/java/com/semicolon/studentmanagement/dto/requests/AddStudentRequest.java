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
    @NonNull
    private LocalDate dob;
    private int age;
    @NonNull
    private String address;
}
