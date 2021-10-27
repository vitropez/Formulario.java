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
 * Servlet implementation class CreateServlet
 */
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
          String   nombre = request.getParameter("nombre");
          String   telefono = request.getParameter("telefono");
          String  direccion = request.getParameter("direccion");
          String   comentarios = request.getParameter("comentarios");
          String   edadString = request.getParameter("edad").trim();
          String   nivelAmistadString = request.getParameter("nivelAmistad");
          
        
      	if( validarTelefono(telefono)==true){

          try {
        	  
         	      	 
         	 
         	
        	  Class.forName("com.mysql.jdbc.Driver");
        	  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/amigos", "root", "");
        	  String consulta = "INSERT INTO amigo VALUES (?,?,?,?,?,?)";
        	  PreparedStatement ps=null;            	    
            ps= con.prepareStatement(consulta);
         
            
            ps.setString(1,nombre);
            ps.setString(2,telefono);
            ps.setString(3,direccion);
            ps.setString(4,comentarios);
            ps.setString(5,edadString);
            ps.setString(6,nivelAmistadString);
            ps.executeUpdate();
            
	PrintWriter out = response.getWriter();
            
            out.println("datos introducidos correctamene");
            
             
              
        }catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            	 System.out.println(e);
            }
        
    
    }else 
    	System.out.println("telefono no valido");
    	
    }
    
        /**
         * Realizamos las validaciones pertinentes
         * @param telefono
         * @return
         */
        private boolean validarTelefono(String telefono) {
        
          if (telefono.length()!=9){
        	
                return false;  
          }
          else {
        	  return true;
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

