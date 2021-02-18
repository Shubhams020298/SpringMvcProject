package com.lerning.springrestimplement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Student")
@Component
public class StudentModel {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int StudenId;
	
	private String Studentname;
	
	@Column(unique = true)
	private String StudentEmail;
	private String StudentAdd;
	
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentModel(int studenId, String studentname, String studentEmail, String studentAdd) {
		super();
		StudenId = studenId;
		Studentname = studentname;
		StudentEmail = studentEmail;
		StudentAdd = studentAdd;
	}

	public int getStudenId() {
		return StudenId;
	}

	public void setStudenId(int studenId) {
		StudenId = studenId;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public String getStudentEmail() {
		return StudentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}

	public String getStudentAdd() {
		return StudentAdd;
	}

	public void setStudentAdd(String studentAdd) {
		StudentAdd = studentAdd;
	}

	@Override
	public String toString() {
		return "StudentModel [StudenId=" + StudenId + ", Studentname=" + Studentname + ", StudentEmail=" + StudentEmail
				+ ", StudentAdd=" + StudentAdd + "]";
	}
	
	
	
}
