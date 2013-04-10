package tn.esprit.migrationProject.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.migrationProject.persistence.Student;
import tn.esprit.migrationProject.services.interfaces.SchoolManagementServicesLocal;
import tn.esprit.migrationProject.services.interfaces.SchoolManagementServicesRemote;

/**
 * Session Bean implementation class SchoolManagementServices
 */
@Stateless
public class SchoolManagementServices implements
		SchoolManagementServicesRemote, SchoolManagementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public SchoolManagementServices() {
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);

	}

}
