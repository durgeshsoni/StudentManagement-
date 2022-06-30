package com.student.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.exception.StudentException;
import com.student.model.StudentInfo;
import com.student.model.StudentMarks;
import com.student.repository.StudentInfoDao;

import com.student.services.StudentMarksServiceImpl;

@RestController
public class StudentMarksController {
		
	
	
	@Autowired
	private StudentMarksServiceImpl serviceImpl;
	
	@Autowired
	private StudentInfoDao stdDao;
	
	
	@PostMapping("/student/marks/detail")
	public ResponseEntity<String> createStudentsMarks(@Valid @RequestBody StudentMarks stdMarks, @RequestParam Integer stdId){
		
		Optional<StudentInfo> student =stdDao.findById(stdId);
		
		if(student.get()==null) {
			throw new StudentException("Student not found");
		}else {
				stdMarks.setStdId(student.get());
			return new ResponseEntity<>(serviceImpl.createStudentMarksDetails(stdMarks),HttpStatus.CREATED);
			
		}
		
	}
	
	@GetMapping("/student/details/{id}")
	public StudentMarks getStudentdetailsById(@PathVariable("id") Integer id) {
		Optional<StudentInfo> student =stdDao.findById(id);
		if(student.get()==null) {
			throw new StudentException("Student not found");
		}else {
				
			return serviceImpl.getStudentDetailsById(student.get());
			
			
		}
	}
	
	
	

}
