/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 
*/



import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.*;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.sql.*;


/**
 *
 * @author Lab13-sys15
 */

public class MEDSERVLET extends HttpServlet {

   
    /** 
     
	* Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     
	* @param request servlet request

	* @param response servlet response

	* @throws ServletException if a servlet-specific error occurs

	* @throws IOException if an I/O error occurs
     
	*/
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
  
 throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        
	PrintWriter out = response.getWriter();
        
	Connection conn;
        
	Statement stmt;
        
	try {
            
		//Getting input from registration page.
	
		String username=request.getParameter("uname");
	
		String password=request.getParameter("pwd");
 
		RequestDispatcher rd;
        
if(username.equals("")||password.equals(""))
        
{
            
	rd=request.getRequestDispatcher("Signit.html");
            
	out.println("username & password invalid");
            
	rd.include(request,response);
        
}

else
{
	rd=request.getRequestDispatcher("login.html");
	rd.forward(request,response);
}
     //STEP 1: Register JDBC driver

      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

 
     //STEP 2: Open a connection
 
     out.println("Connecting to database...");
   
   conn = DriverManager.getConnection("jdbc:odbc:Database5");



      //STEP 3: Execute a query
      
	out.println("Creating statement...");
      
	stmt = conn.createStatement();
      
	String sql;
      
	sql = "insert into Table1(username,password) values('"+username+"','"+password+"')";
      
	int count = stmt.executeUpdate(sql);


     
	if(count==1)
	
		out.print("User successfully registered");

     	else
       
		out.println("user could not be registered");

//STEP 5: Clean-up environment

      
	stmt.close();
      
	conn.close();
	
	out.close();
    
}
catch(SQLException se)
{
      //Handle errors for JDBC
      
	se.printStackTrace();
   
}
  
catch(ClassNotFoundException e)
{
      //Handle errors for Class.forName
      
e.printStackTrace();
  
}
         
finally { 
            
out.close();
        
}
    
}
 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
	/** 
     
	* Handles the HTTP <code>GET</code> method.
     
	* @param request servlet request
     
	* @param response servlet response
     
	* @throws ServletException if a servlet-specific error occurs
     
	* @throws IOException if an I/O error occurs
     
	*/
    
	@Override
 
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
   
		 throws ServletException, IOException {
        processRequest(request, response);
    
	}
 
	/** 
     
	* Handles the HTTP <code>POST</code> method.
     
	* @param request servlet request
     
	* @param response servlet response
     
	* @throws ServletException if a servlet-specific error occurs
     
	* @throws IOException if an I/O error occurs
     
	*/
    
	@Override
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
    
	throws ServletException, IOException {
        
	processRequest(request, response);
	
    }

    
	/** 
     
	* Returns a short description of the servlet.
     
	* @return a String containing servlet description
     
	*/

	@Override
    
		public String getServletInfo() {
        
			return "Short description";
 
		   }
// </editor-fold>


}
