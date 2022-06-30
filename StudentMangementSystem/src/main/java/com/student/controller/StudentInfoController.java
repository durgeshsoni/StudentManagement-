package com.student.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.StudentInfo;
import com.student.services.StudentInfoServiceImpl;

@RestController
public class StudentInfoController {
	
	@Autowired
	private StudentInfoServiceImpl studentInfoImpl;
	
	
	@PostMapping("/student/details")
	public ResponseEntity<String> studentDetails( @Valid @RequestBody List<StudentInfo> std) {
		return new ResponseEntity<>(studentInfoImpl.createStudent(std), HttpStatus.CREATED);
	}
	
	@GetMapping("student/details")
	public ResponseEntity<List<StudentInfo>> getAllStudentsDetails(){
		
		List<StudentInfo> std = studentInfoImpl.getAllStudentDetailsI();
		return new ResponseEntity<List<StudentInfo>>(std,HttpStatus.OK);
	}
}
