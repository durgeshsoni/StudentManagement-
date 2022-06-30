package com.student.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.student.exception.StudentException;
import com.student.model.StudentInfo;

@Repository
public interface StudentInfoService {
	
	public String createStudent(List<StudentInfo> student);
	
	public List<StudentInfo> getAllStudentDetailsI() throws StudentException;
	

}
