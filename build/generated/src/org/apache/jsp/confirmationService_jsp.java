package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class confirmationService_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Confirmation Service</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <link href=\"css/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\t\n");
      out.write("\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body >\n");
      out.write("        <header>\n");
      out.write("            <!-- Navigation -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark static-top\" style=\"padding:0px;margin:0px;border-radius: 0px;\">\n");
      out.write("                <div class=\"container\" >\n");
      out.write("\n");
      out.write("                    <a href=\"index.jsp\"><img src=\"images/logo.png\" class=\"logo\"></a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\" style=\"padding-left: 85%;\">\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\" id=\"navblue\">\n");
      out.write("                                <a class=\"nav-link\"  href=\"login.html\">Connexion</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\" id=\"navorange\">\n");
      out.write("                                <a class=\"nav-link\" href=\"register.html\">Inscription</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .wrap-input {\n");
      out.write("                position: relative;\n");
      out.write("                width: 100%;\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("            .wrap-login {\n");
      out.write("                width: 450px;\n");
      out.write("                background: #fff;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <div class=\"wrap-login p-l-50 p-r-50 p-t-77 p-b-30\">\n");
      out.write("                    <div class=\"login-form validate-form\">\n");
      out.write("                        ");

                            Connection dbcon;
                            // Déclaration du driver
                            Class.forName("com.mysql.jdbc.Driver");
                            // Url de connexion
                            String dbUrl = "jdbc:mysql://localhost:3306/pomocServiceDb";
                            // Profil / Mot de passe
                            String user = "root";
                            String password = "";
                            // Connexion à la base
                            dbcon = DriverManager.getConnection(dbUrl, user, password);
                            PreparedStatement reqconnexion = dbcon.prepareStatement("SELECT * FROM INTERVENTION");
                            ResultSet resultreq = reqconnexion.executeQuery();
                            do { 
      out.write("\n");
      out.write("                        ");

                            if (resultreq.next()) {
                        
      out.write("\n");
      out.write("                        <table>\n");
      out.write("                            <td>\n");
      out.write("\n");
      out.write("                                ");
out.println(resultreq.getString("title"));
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                          \n");
      out.write("\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        ");


                                }
                            } while (resultreq.next());
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        %>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
