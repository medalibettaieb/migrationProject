package tn.esprit.migrationProject.services.interfaces;

import javax.ejb.Remote;

import tn.esprit.migrationProject.persistence.Student;

@Remote
public interface SchoolManagementServicesRemote {
	public void addStudent(Student student);
}
