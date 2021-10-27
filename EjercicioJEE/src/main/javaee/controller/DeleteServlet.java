package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    	String nombre = request.getParameter("nombre");
    
        

        
        if (nombre != null ) 
        try{
        	
        	
      	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/amigos", "root", "");
    	  String consulta = "DELETE FROM amigo WHERE nombre = ?";
    	  PreparedStatement ps=null;            	    
        ps= con.prepareStatement(consulta);
        ps.setString(1,nombre);
        ps.executeUpdate();
    	PrintWriter out = response.getWriter();
        
        out.println("datos borrados correctamene");
        
     
           }catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            	 System.out.println(e);
            }
           
      
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	processRequest(request, response);
    }

}
