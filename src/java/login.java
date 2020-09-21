

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
import java.sql.PreparedStatement;

@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {
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
            
            
            // Récupération des données
            String mail = request.getParameter("mail");
            String pass = request.getParameter("pass");
            // execution de la requête
            PreparedStatement reqconnexion = dbcon.prepareStatement("SELECT * FROM PERSON WHERE mail = ? AND password = ?");
            reqconnexion.setString(1, mail);
            reqconnexion.setString(2, pass);
            ResultSet resultreq = reqconnexion.executeQuery();
            if (!resultreq.next()) {
               
                request.setAttribute("error", "Cet utilisateur n'existe pas");
                this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
                
            } else {
                do {
                         
                        int test =  Integer.parseInt(resultreq.getString("id"));
                        HttpSession session1 = request.getSession();
                        session1.setAttribute("id", test);
                        session1.setAttribute("mail", resultreq.getString("mail"));
                        session1.setAttribute("name", resultreq.getString("name"));
                        session1.setAttribute("firstName", resultreq.getString("firstName"));
                      
                        
               
                 
         
                PreparedStatement reqtest = dbcon.prepareStatement("SELECT `idWorker`FROM WORKER WHERE PERSON_idPerson = ?");
                reqtest.setInt(1,test);
                
                ResultSet resulttest = reqtest.executeQuery();
               
               
            
                 
            if (    !resulttest.next()) {
                
                
                PreparedStatement reqinscription = dbcon.prepareStatement("INSERT INTO `worker`(`PERSON_idPerson`) "
                        + "VALUES (?)");
                reqinscription.setInt(1,test);
                
                int resultin = reqinscription.executeUpdate();
                
                this.getServletContext().getRequestDispatcher("/confirmationService.jsp").forward(request, response);
                
            }else{
                
                this.getServletContext().getRequestDispatcher("/confirmationService.jsp").forward(request, response);
                
            }
                
               
                
                
                }while (resultreq.next());
                } 
               
                
            } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    
    }  

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
