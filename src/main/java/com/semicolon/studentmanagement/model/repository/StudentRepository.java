package com.semicolon.studentmanagement.model.repository;

import com.semicolon.studentmanagement.model.data.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
