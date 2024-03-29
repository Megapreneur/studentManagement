package com.semicolon.studentmanagement.model.data;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private String address;
    private String studentId;
}
