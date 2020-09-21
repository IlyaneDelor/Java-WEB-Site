package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Register Home Service</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("    <link href=\"css/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\t\n");
      out.write("\n");
      out.write("    <script src=\"jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark static-top\" style=\"padding:0px;margin:0px;border-radius: 0px;\">\n");
      out.write("            <div class=\"container\" >\n");
      out.write("\n");
      out.write("                <a href=\"index.jsp\"><img src=\"images/logo.png\" class=\"logo\"></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\" style=\"padding-left: 85%;\">\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\" id=\"navblue\">\n");
      out.write("                            <a class=\"nav-link\"  href=\"login.html\">Connexion</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\" id=\"navorange\">\n");
      out.write("                            <a class=\"nav-link\" href=\"register.html\">Inscription</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <form action=\"register\" method=\"post\" >\n");
      out.write("        <div class = \"limiter\" >\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <div class=\"wrap-login p-l-50 p-r-50 p-t-77 p-b-30\">\n");
      out.write("                    <div class=\"login-form validate-form\">\n");
      out.write("                        <span class=\"login-form-title p-b-55\">\n");
      out.write("                            REGISTER\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input validate-input m-b-16\" >\n");
      out.write("                            <input class=\"input\" type=\"text\" id=\"name\" name=\"name\" placeholder=\"Name\">\n");
      out.write("                            <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['nom']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            <span class=\"focus-input\"></span>\n");
      out.write("                            <span class=\"symbol-input\">\n");
      out.write("                                <span class=\"lnr lnr-user\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"wrap-input validate-input m-b-16\" >\n");
      out.write("                            <input class=\"input\" type=\"text\" id=\"firstName\" name=\"firstName\" placeholder=\"FirstName\">\n");
      out.write("                            <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['firstName']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            <span class=\"focus-input\"></span>\n");
      out.write("                            <span class=\"symbol-input\">\n");
      out.write("                                <span class=\"lnr lnr-user\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"wrap-input validate-input m-b-16\">\n");
      out.write("\n");
      out.write("                            <input class=\"input\" type=\"text\" id=\"mail\" name=\"mail\" placeholder=\"Email\">\n");
      out.write("                            <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['email']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            <span class=\"focus-input\"></span>\n");
      out.write("                            <span class=\"symbol-input\">\n");
      out.write("                                <span class=\"lnr lnr-envelope\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input validate-input m-b-16\" >\n");
      out.write("                            <input class=\"input\" type=\"date\" id=\"birthDate\" name=\"birthDate\">\n");
      out.write("                            <span class=\"focus-input\"></span>\n");
      out.write("                            <span class=\"symbol-input\">\n");
      out.write("                                <span class=\"lnr lnr-heart\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input validate-input m-b-16\" >\n");
      out.write("                            <input class=\"input\" type=\"tel\" name=\"tel\" id=\"tel\"placeholder=\"Phone ex: 0654846578\">\n");
      out.write("                            <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['tel']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            <span class=\"focus-input\"></span>\n");
      out.write("                            <span class=\"focus-input\"></span>\n");
      out.write("                            <span class=\"symbol-input\">\n");
      out.write("                                <span class=\"lnr lnr-phone\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input validate-input m-b-16\" data-validate = \"Passsword is required\">\n");
      out.write("                            <input class=\"input\" type=\"text\" name=\"password\" id=\"password\" placeholder=\"Password\">\n");
      out.write("                            <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['password']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            <span class=\"focus-input\"></span>\n");
      out.write("                            <span class=\"focus-input\"></span>\n");
      out.write("                            <span class=\"symbol-input\">\n");
      out.write("                                <span class=\"lnr lnr-home\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input validate-input m-b-16\" >\n");
      out.write("                            <input class=\"input\" type=\"text\" name=\"confirmPassword\" id=\"confirmPass\" placeholder=\"Password Verification\">\n");
      out.write("                            <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['confirmation']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            <span class=\"focus-input\"></span>\n");
      out.write("                            <span class=\"symbol-input\">\n");
      out.write("                                <span class=\"lnr lnr-home\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"container-login-form-btn p-t-25\">\n");
      out.write("                            <input type=\"submit\" class=\"login-form-btn\" value=\"Register\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <p class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty form.erreurs ? 'succes' : 'erreur'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.resultat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                        <div class=\"text-center w-full p-t-42 p-b-22\">\n");
      out.write("                            <span class=\"txt1\">\n");
      out.write("                                Or register with\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <a href=\"#\" class=\"btn-face m-b-10\">\n");
      out.write("                            <i class=\"fa fa-facebook-official\"></i>\n");
      out.write("                            Facebook\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <a href=\"#\" class=\"btn-google m-b-10\">\n");
      out.write("                            <img src=\"../images/icons/icon-google.png\" alt=\"GOOGLE\">\n");
      out.write("                            Google\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <div class=\"text-center w-full p-t-115\">\n");
      out.write("                            <span class=\"txt1\">\n");
      out.write("                                Already a member?\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("                            <a class=\"txt1 bo1 hov1\" href=\"#\">\n");
      out.write("                                Sign in\t\t\t\t\t\t\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
