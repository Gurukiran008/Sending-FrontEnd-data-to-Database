package project1;

import javax.servlet.http.HttpServletRequest;

public class Demo {

//private void doGet(HttpServletRequest req,HttpServletRequest res) {
//	// TODO Auto-generated method stub
//	super.doGet(req,res);
//	System.out.printLn("look Here");
//	resp.getWriter().print("Focus");
//	
	private void doPost (HttpServletRequest req,HttpServletRequest res) {
		// TODO Auto-generated method stub
//	super.doPost(req,res);
	String S1=req.getParameter("hsempid");
	System.out.println(S1);
//	resp.getWriter().print("Focus");
	}
	

}
	

