package com.student.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.exception.StudentException;
import com.student.model.StudentInfo;
import com.student.model.StudentMarks;
import com.student.repository.StudentInfoDao;
import com.student.repository.StudentMarksDao;

@Service
public class StudentMarksServiceImpl implements StudentMarksService {

	@Autowired
	private StudentMarksDao studentMarksDao;
	
	@Autowired
	private StudentInfoDao studentInfoDao;
	
	
	@Override
	public String createStudentMarksDetails(StudentMarks st) {
		studentMarksDao.save(st);
		return "record inserted successfully";
	}


	@Override
	public StudentMarks getStudentDetailsById(StudentInfo id) throws StudentException {
		// TODO Auto-generated method stub
		
		System.out.println(studentMarksDao.findByStdId(id));
		 return studentMarksDao.findByStdId(id);
//		return null;

	}






}
