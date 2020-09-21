
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.time.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {

    Connection dbcon;

    public static final String VUE = "/register.jsp";
    public static final String CHAMP_MAIL = "mail";
    public static final String CHAMP_PASS = "password";
    public static final String CHAMP_CONF = "confirmation";
    public static final String CHAMP_NAME = "name";
    public static final String CHAMP_FIRSTNAME = "firstName";
    public static final String CHAMP_TEL = "tel";
    public static final String CHAMP_BIRTHDATE = "birthDate";
    public static final String ATT_ERREURS = "erreurs";
    public static final String ATT_RESULTAT = "resultat";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String resultat;

        Map<String, String> erreurs = new HashMap<>();
        try (PrintWriter out = response.getWriter()) {

            // Déclaration du driver
            Class.forName("com.mysql.jdbc.Driver");
            // Url de connexion
            String dbUrl = "jdbc:mysql://localhost:3306/pomocServiceDb";
            // Profil / Mot de passe
            String user = "root";
            String pass = "";
            dbcon = DriverManager.getConnection(dbUrl, user, pass);
            out.println(erreurs);

            /* Récupération des champs du formulaire. */
            String mail = request.getParameter(CHAMP_MAIL);
            String password = request.getParameter(CHAMP_PASS);
            String confirmation = request.getParameter(CHAMP_CONF);
            String name = request.getParameter(CHAMP_NAME);
            String firstName = request.getParameter(CHAMP_FIRSTNAME);
            String tel = request.getParameter(CHAMP_TEL);
            String birthDate = request.getParameter(CHAMP_BIRTHDATE);

            
            /*Date changement*/
            // Vérification si le client a plus de 18 ans
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            java.util.Date d;
            d = sdf.parse(birthDate);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH) + 1;
            int date = c.get(Calendar.DATE);
            LocalDate l1 = LocalDate.of(year, month, date);
            LocalDate now1 = LocalDate.now();
            Period diff1 = Period.between(l1, now1);

        

            /* Validation du champ email. */
            try {
               
                if (mail != null && mail.trim().length() != 0) {
                    if (!mail.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                        throw new Exception("Merci de saisir une adresse mail valide.");
                    }
                } else {
                    throw new Exception("Merci de saisir une adresse mail.");
                }
            } catch (Exception e) {
                erreurs.put(CHAMP_MAIL, e.getMessage());
            }

            /* Validation des champs mot de passe et confirmation. */
            try {
                
                if (password != null && password.trim().length() != 0 && confirmation != null && confirmation.trim().length() != 0) {
                    if (!password.equals(confirmation)) {
                        throw new Exception("Les mots de passe entrés sont différents, merci de les saisir à nouveau.");
                    } else if (password.trim().length() < 3) {
                        throw new Exception("Les mots de passe doivent contenir au moins 3 caractères.");
                    }
                } else {
                    throw new Exception("Merci de saisir et confirmer votre mot de passe.");
                }
            } catch (Exception e) {
                erreurs.put(CHAMP_PASS, e.getMessage());
            }

            /* Validation du champ nom. */
            try {
                
                if (name != null && name.trim().length() < 3) {
                    throw new Exception("Le nom d'utilisateur doit contenir au moins 3 caractères.");
                }
            } catch (Exception e) {
                erreurs.put(CHAMP_NAME, e.getMessage());
            }
            /* Validation du champ PR2NOM. */
            try {
                if (firstName != null && firstName.trim().length() < 3) {
                    throw new Exception("Le prénom d'utilisateur doit contenir au moins 3 caractères.");
                }
            } catch (Exception e) {
                erreurs.put(CHAMP_FIRSTNAME, e.getMessage());
            }

            /* Validation du champ tel. */
            try {
                if (tel != null && tel.trim().length() != 10) {
                    throw new Exception("Le nom d'utilisateur doit contenir au moins 10 chiffres.");
                }
            } catch (Exception e) {
                erreurs.put(CHAMP_TEL, e.getMessage());
            }
            
          
            /* Initialisation du résultat global de la validation. */
            if (erreurs.isEmpty()) {
                
                resultat = "Succès de l'inscription.";
                PreparedStatement reqinscription = dbcon.prepareStatement("INSERT INTO `Person`(`name`, `firstName`, `mail`, `tel`, `dateBorn`, `password`) "
                        + "VALUES (?,?,?,?,?,?)");
                reqinscription.setString(1, name);
                reqinscription.setString(2, firstName);
                reqinscription.setString(3, mail);
                reqinscription.setString(4, tel);
                reqinscription.setString(5, birthDate);
                reqinscription.setString(6, password);
                int validationreq = reqinscription.executeUpdate();


                
                
               

                this.getServletContext().getRequestDispatcher(VUE).forward(request, response);

            } else {
                resultat = "Échec de l'inscription.";
            }

            /* Stockage du résultat et des messages d'erreur dans l'objet request */
            request.setAttribute(ATT_ERREURS, erreurs);
            request.setAttribute(ATT_RESULTAT, resultat);

            /* Transmission de la paire d'objets request/response à notre JSP */
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (dbcon != null) {
                try {
                    dbcon.close();
                } catch (SQLException ex) {
                    Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

}
