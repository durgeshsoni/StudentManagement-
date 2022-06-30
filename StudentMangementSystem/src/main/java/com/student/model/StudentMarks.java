package com.student.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class StudentMarks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer marksId;

	
	private String session;
	private String semester ;
	private Integer total_subject;
	private Integer total_markes;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stdId")

	private StudentInfo stdId;
	
	
	

}
