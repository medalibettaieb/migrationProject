package tn.esprit.migrationProject.services.interfaces;

import javax.ejb.Local;

import tn.esprit.migrationProject.persistence.Student;

@Local
public interface SchoolManagementServicesLocal {
	public void addStudent(Student student);
}
