package com.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.exception.StudentException;
import com.student.model.StudentInfo;
import com.student.repository.StudentInfoDao;

@Service
public class StudentInfoServiceImpl implements StudentInfoService{
	
	@Autowired
	private StudentInfoDao studentDao;
	
	
	@Override
	public String createStudent(List<StudentInfo> student) {
		studentDao.saveAll(student);
		return student.size()+" records inserted successful";
		
	}


	@Override
	public List<StudentInfo> getAllStudentDetailsI() throws StudentException {
		
		List<StudentInfo> student  = studentDao.findAll();
		
		if(student.size()>0) {
			return student;
		}else {
			throw new StudentException("No Student found...");
		}
		
	
	}

}
