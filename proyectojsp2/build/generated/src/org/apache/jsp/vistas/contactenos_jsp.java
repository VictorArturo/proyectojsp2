package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactenos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>contactenos</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                padding-top: 50px;\n");
      out.write("                padding-bottom: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/main.css\">\n");
      out.write("\n");
      out.write("        <script src=\"../js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("    <nav class=\"navbar nav-principal navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("          <button class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar\">\n");
      out.write("            <span class=\"icon-bar app-bar\"></span>\n");
      out.write("            <span class=\"icon-bar app-bar\"></span>\n");
      out.write("            <span class=\"icon-bar app-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand link-personalizado\" href=\"vistaInicio.php\">TechnoInfo</a>\n");
      out.write("        </div>\n");
      out.write("          <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right nav-1\">\n");
      out.write("              <li><a href=\"php/vistaVehiculos.php\">Cursos\n");
      out.write("                <span class=\"glyphicon glyphicon-tag\"></span></a></li>\n");
      out.write("              <li><a href=\"php/vistaDescuentos.php\">Descuentos\n");
      out.write("                <span class=\"glyphicon icon-gift\"></span></a></li>\n");
      out.write("              <li><a href=\"php/vistaPaquetes.php\">Paquetes\n");
      out.write("                <span class=\"glyphicon icon-briefcase\"></span></a></li>\n");
      out.write("              <li><a href=\"vistas/contactenos.jsp\">Contactenos\n");
      out.write("                <span class=\"glyphicon icon-envelop\"></span></a></li>\n");
      out.write("              <li><a href=\"php/frmRegistro.php\" data-toggle=\"modal\">Registro\n");
      out.write("                <span class=\"glyphicon icon-user-plus\"></span></a></li>\n");
      out.write("              <li><a href=\"php/Session.php\">Ingresar\n");
      out.write("                <span class=\"glyphicon icon-users\"></span></a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("          </div><!--/.navbar-collapse -->\n");
      out.write("        </div><!--/.navbar-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("      <section class=\"app-principal\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("         <h1>TECHNOINFO</h1>\n");
      out.write("          <p>Lo mejor en cursos en linea</p>\n");
      out.write("        <div>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <!-- Example row of columns -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <form class=\"form-horizontal\" method=\"POST\" action=\"resultado.jsp\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"para\"></label>\n");
      out.write("            <input class=\"\" type=\"text\" name=\"para\" value=\"cursos.izi.sv@gmail.com\" readonly=\"readonly\">\n");
      out.write("          <!--</div>-->\n");
      out.write("          <!--<div class=\"form-group\">-->\n");
      out.write("            <label for=\"de\"></label>\n");
      out.write("            <input class=\"\" type=\"e-mail\" name=\"de\" placeholder=\"De\">\n");
      out.write("          <!--</div>-->\n");
      out.write("          <!--<div class=\"form-group\">-->\n");
      out.write("            <label for=\"clave\"></label>\n");
      out.write("            <input class=\"\" type=\"password\" name=\"clave\" placeholder=\"Contraseña de\">\n");
      out.write("          <!--</div>-->\n");
      out.write("          <!--<div class=\"form-group\">-->\n");
      out.write("            <label for=\"asunto\"></label>\n");
      out.write("            <input class=\"\" type=\"text\" name=\"asunto\" placeholder=\"Asunto\">\n");
      out.write("          <!--</div>-->\n");
      out.write("          <!--<div class=\"form-group\">-->\n");
      out.write("           \n");
      out.write("          <!--</div>-->\n");
      out.write("          <!--<div class=\"form-group\">-->\n");
      out.write("            <label for=\"mensaje\"></label>\n");
      out.write("            <center><textarea name=\"mensaje\" cols=\"40\" rows=\"10\" placeholder=\"mensaje\"></textarea></center>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <center>\n");
      out.write("            <input type=\"submit\" name=\"acept\" value=\"Aceptar\" class=\"btn btn-primary\">\n");
      out.write("           \n");
      out.write("            <a href=\"https://www.facebook.com/TecnoInfoSV/\" class=\"btn btn-primary\">Facebook<span class=\"glyphicon icon-facebook2\"></span></a>\n");
      out.write("        </center>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <hr>\n");
      out.write("\n");
      out.write("      <footer>\n");
      out.write("        <p>&copy; BRBJ S.A. de C.V. 2015</p>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"../js/vendor/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("\n");
      out.write("        <script src=\"../js/vendor/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->\n");
      out.write("        <!--<script>\n");
      out.write("          (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=\n");
      out.write("            function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;\n");
      out.write("            e=o.createElement(i);r=o.getElementsByTagName(i)[0];\n");
      out.write("            e.src='//www.google-analytics.com/analytics.js';\n");
      out.write("            r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));\n");
      out.write("            ga('create','UA-XXXXX-X','auto');ga('send','pageview');\n");
      out.write("        </script>-->\n");
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
