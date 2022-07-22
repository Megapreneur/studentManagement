package com.semicolon.studentmanagement.dto.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeleteStudentRequest {
    private String studentID;
}
