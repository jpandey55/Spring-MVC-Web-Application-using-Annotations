package com.jeet.studentadmissioncontroller;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	@NotEmpty @Pattern(regexp="[^0-9]*")
	private String studentName;
	@NotEmpty @Size(min=2, max=30) @IsHobby(listOfValidHobbies="Music|Football|Cricket|Hockey|Guitar")
	private String studentHobby;
	@Min(1000000000)
	private Long studentMobile;
	@Past 
	private Date studentDOB;
	@NotEmpty
	private List<String> studentSkills;
	private Address studentAddress;
	public String getStudentName() {
		return studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public List<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
}
