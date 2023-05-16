package project1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.swing.text.html.HTML;

import dao.EmployeDao;
import dto.Employee;

public class smaple extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String s1 = req.getParameter("empid");
	int empid =Integer.parseInt(s1);
	String s2 = req.getParameter("eName");
	String s3 = req.getParameter("dob");
	String s4 = req.getParameter("gender");
	String s5 = req.getParameter("country");
	
	Employee employee=new Employee();
	employee.setEmpid(empid);
	employee.seteName(s2);
	employee.setDob(s3);
	employee.setGender(s4);
	employee.setCountry(s5);
	
	
	EmployeDao employeDao=new EmployeDao();
	employeDao.insert(employee);
	
	res.getWriter().print("<html><body><h1><center>hurraaeee</center></body></html>");
	}

}
