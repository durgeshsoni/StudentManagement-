package com.student.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentInfo {
	
	@Id
	private Integer stdId;
	
	private String std_name;
	private String std_address;	
	private String std_email ;
	@Min(value=9, message="Mobile should be 10 digit")
	@Pattern(regexp = "[0-9]{10}",message="Mobile no invalid")
	private String std_phoneno;
	private String std_section;
	private String std_grade;
	
	

}