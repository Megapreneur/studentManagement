package com.semicolon.studentmanagement.model.repository;

import com.semicolon.studentmanagement.model.data.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<  Student, Integer> {
    boolean existsByEmail(String email);

    boolean existsByStudentID(String studentID);

}
