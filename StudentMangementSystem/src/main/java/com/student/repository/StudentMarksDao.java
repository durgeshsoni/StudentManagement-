package com.student.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.model.StudentInfo;
import com.student.model.StudentMarks;

@Repository
public interface StudentMarksDao extends JpaRepository<StudentMarks, Integer> {
	
	StudentMarks findByStdId(StudentInfo stdId);
}
