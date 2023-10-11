package com.oasys.studentdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.studentdetails.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
@Query (value = "select * from student_details where rollnumber=?",nativeQuery = true)
public Student getRoll(int e);
}
