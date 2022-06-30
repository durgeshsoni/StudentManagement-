package com.student.services;

import com.student.exception.StudentException;
import com.student.model.StudentInfo;
import com.student.model.StudentMarks;

public interface StudentMarksService {
	
	public String createStudentMarksDetails(StudentMarks studentMarks);
	public StudentMarks getStudentDetailsById(StudentInfo id) throws StudentException;
	
}
