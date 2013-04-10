package tn.esprit.migrationProject.persistence;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Student
 * 
 */
@Entity
public class Student implements Serializable {

	private int idStudent;
	private String firstNameStudent;
	private String lastNameStudent;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdStudent() {
		return this.idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getFirstNameStudent() {
		return firstNameStudent;
	}

	public void setFirstNameStudent(String firstNameStudent) {
		this.firstNameStudent = firstNameStudent;
	}

	public String getLastNameStudent() {
		return lastNameStudent;
	}

	public void setLastNameStudent(String lastNameStudent) {
		this.lastNameStudent = lastNameStudent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Student(String firstNameStudent, String lastNameStudent) {
		super();
		this.firstNameStudent = firstNameStudent;
		this.lastNameStudent = lastNameStudent;
	}

}
