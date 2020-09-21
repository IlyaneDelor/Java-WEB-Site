import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/serviceStopped"})
public class serviceStopped extends HttpServlet {
    Connection dbcon;

 

  
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    @SuppressWarnings("empty-statement")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
           
            // Déclaration du driver
            Class.forName("com.mysql.jdbc.Driver");
            // Url de connexion
            String dbUrl = "jdbc:mysql://localhost:3306/pomocServiceDb";
            // Profil / Mot de passe
            String user = "root";
            String password = "";
            // Connexion à la base
            dbcon = DriverManager.getConnection(dbUrl, user, password);
            
            
       
         
            String idInter = request.getParameter("idIntervention");
            
            PreparedStatement requpda = dbcon.prepareStatement("UPDATE `intervention` SET `etat` = 2 WHERE idIntervention = "+idInter+"");
           
            out.println(requpda);
            requpda.executeUpdate();
            this.getServletContext().getRequestDispatcher("/historique.jsp").forward(request, response);
            
            
            
            
                       
        
            
            
          
           
           
             
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
