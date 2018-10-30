package com.jsfhibernate.pojo;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.jsfhibernate.dao.DatabaseOperations;
import java.util.Date;

@ManagedBean @RequestScoped
public class Thesis implements java.io.Serializable {

	
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", updatable = false, nullable=false, unique=true)
	*/
	private int id;
	
	private String name;
	private int curriculum;
	private String advisor;	
	private String secondReader;
	private String academicAssociate;
	private Date graduationDate;
	private String problemStatement;
	private String researcHypothesis;
	
	
	public static DatabaseOperations dbObj;
	private static final long serialVersionUID = 1L;

	/*public Thesis() { }

	public Thesis(int id) {
		this.id = id;
	}
*/
	/*
	public Thesis(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
*/

	// Method To Add New Student Details In Database
	public void saveThesisRecord() {
		System.out.println("Calling saveThesisRecord() Method To Save Student Record");
		dbObj = new DatabaseOperations();
		
		dbObj.addThesisInDb(this);
		
	}

/*	// Method To Delete A Particular Student Record From The Database
	public void deleteStudentRecord() {
		System.out.println("Calling deleteStudentRecord() Method To Delete Student Record");
		dbObj = new DatabaseOperations();
		dbObj.deleteStudentInDb(id);
	}

	// Method To Fetch Particular Student Details From The Database
	public List<Student> getStudentDetailsById() {
		System.out.println("Calling getStudentDetailsById() Method Details For Student Id?= " + id);
		dbObj = new DatabaseOperations();		
		studentList = dbObj.getStudentById(id);
		for(Student selectedStud : studentList) {
			name = selectedStud.getName();
			department = selectedStud.getDepartment();
		}
		System.out.println("Fetched Id? " + id + " Details Are: Name=" + name + ", Department=" + department);
		return studentList;
	}

	// Method To Update Particular Student Details In Database
	public void updateStudentDetails() {
		System.out.println("Calling updateStudentDetails() Method To Update Student Record");
		dbObj = new DatabaseOperations();		
		dbObj.updateStudentRecord(this);
	}

	// Method To Fetch All Recrods From The Database
	public List<Student> getAllStudentRecords() {
		System.out.println("Calling getAllStudentRecords() Method To Fetch Students Record");
		dbObj = new DatabaseOperations();		
		List<Student> studentsList = dbObj.retrieveStudent();
		for(Student stud : studentsList) {
			if(stud.getId() == id) {
				name = stud.getName();
				department = stud.getDepartment();
			}
		}
		return studentsList;
	}
*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(int curriculum) {
		this.curriculum = curriculum;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getSecondReader() {
		return secondReader;
	}

	public void setSecondReader(String secondReader) {
		this.secondReader = secondReader;
	}

	public String getAcademicAssociate() {
		return academicAssociate;
	}

	public void setAcademicAssociate(String academicAssociate) {
		this.academicAssociate = academicAssociate;
	}

	public Date getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getProblemStatement() {
		return problemStatement;
	}

	public void setProblemStatement(String problemStatement) {
		this.problemStatement = problemStatement;
	}

	public String getResearcHypothesis() {
		return researcHypothesis;
	}

	public void setResearcHypothesis(String researcHypothesis) {
		this.researcHypothesis = researcHypothesis;
	}
}