package tn.esprit.migrationProjectWeb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.esprit.migrationProject.persistence.Student;
import tn.esprit.migrationProject.services.interfaces.SchoolManagementServicesLocal;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/zidStudentServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// model
	private Student student = new Student();
	// injection of the proxy
	@EJB
	private SchoolManagementServicesLocal proxy;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.write("hello ... do get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");

		student.setFirstNameStudent(firstName);
		student.setLastNameStudent(lastName);

		proxy.addStudent(student);
		writer.write("<html><head> first page </head><body><h1>hello  "
				+ student.getFirstNameStudent() + " ... do post</h1></body>");

	}

}
