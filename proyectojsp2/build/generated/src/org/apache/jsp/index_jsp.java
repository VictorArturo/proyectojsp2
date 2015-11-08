package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html class=\"no-js\" lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>index</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                padding-top: 50px;\n");
      out.write("                padding-bottom: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--[if lt IE 8]>\n");
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
      out.write("          <a class=\"navbar-brand link-personalizado\" href=\"index.jsp\">TechnoInfo</a>\n");
      out.write("        </div>\n");
      out.write("          <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right nav-1\">\n");
      out.write("              <li><a href=\"vistas/cursos.jsp\">Cursos\n");
      out.write("                <span class=\"glyphicon glyphicon-tag\"></span></a></li>\n");
      out.write("              <li><a href=\"vistas/descuentos.jsp\">Descuentos\n");
      out.write("                <span class=\"glyphicon icon-gift\"></span></a></li>\n");
      out.write("              <li><a href=\"vistas/paquetes.jsp\">Paquetes\n");
      out.write("                <span class=\"glyphicon icon-briefcase\"></span></a></li>\n");
      out.write("              <li><a href=\"vistas/contactenos.jsp\">Contactenos\n");
      out.write("                <span class=\"glyphicon icon-envelop\"></span></a></li>\n");
      out.write("              <li><a href=\"vistas/registrese.jsp\" data-toggle=\"modal\">Registro\n");
      out.write("                <span class=\"glyphicon icon-user-plus\"></span></a></li>\n");
      out.write("              <li><a href=\"vistas/ingresar.jsp\">Ingresar\n");
      out.write("                <span class=\"glyphicon icon-users\"></span></a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("          </div><!--/.navbar-collapse -->\n");
      out.write("        </div><!--/.navbar-collapse -->\n");
      out.write("      \n");
      out.write("    </nav>\n");
      out.write("      <section class=\"app-principal\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <h1>TECHNOINFO</h1>\n");
      out.write("          <p>Lo mejor en cursos en linea</p>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("          <!--Modal de Ingreso-->\n");
      out.write("          <div class=\"modal fade\" id=\"modelIngreso\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("              <div class=\"modal-content m\">\n");
      out.write("                  <div class=\"modal-header\">\n");
      out.write("                    <h4 class=\"modal-title\">Ingresar</h4>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"modal-body m\">\n");
      out.write("                    <form action=\"#\" method=\"POST\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label for=\"user\"></label>\n");
      out.write("                        <input type=\"text\" name=\"user\" placeholder=\"E-Mail\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label for=\"pass\"></label>\n");
      out.write("                        <input type=\"password\" name=\"pass\" placeholder=\"Password\">\n");
      out.write("                      </div>\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"modal-footer m\">\n");
      out.write("                    <input type=\"text\" class=\"btn btn-primary\" value=\"Aceptar\" name=\"acept1\">\n");
      out.write("                    <input type=\"text\" class=\"btn btn-default\" value=\"Cancelar\" name=\"cancel1\" data-dismiss=\"modal\">\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("    <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"carousel slide\" id=\"miSlider\" data-ride=\"carousel\">\n");
      out.write("          <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#miSlider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("            <li data-target=\"#miSlider\" data-slide-to=\"1\"></li>\n");
      out.write("            <li data-target=\"#miSlider\" data-slide-to=\"2\"></li>\n");
      out.write("            <li data-target=\"#miSlider\" data-slide-to=\"3\"></li>\n");
      out.write("            <li data-target=\"#miSlider\" data-slide-to=\"4\"></li>\n");
      out.write("          </ol>\n");
      out.write("          <div class=\"carousel-inner\">\n");
      out.write("            <div class=\"item active\">\n");
      out.write("              <img src=\"img/img1.jpg\" alt=\"Imagen1\" class=\"img2\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("              <img src=\"img/img2.jpg\" alt=\"Imagen2\" class=\"img2\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("              <img src=\"img/img3.jpg\" alt=\"Imagen3\" class=\"img2\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("              <img src=\"img/img4.jpg\" alt=\"Imagen4\" class=\"img2\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("              <img src=\"img/img5.jpg\" alt=\"Imagen5\" class=\"img2\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <!-- Example row of columns -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4 justificado\">\n");
      out.write("          <h2>Consultas</h2>\n");
      out.write("          <p>Consulta Cualquier duda en nuestro chat o a los telefonos 5555-2222</p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"contactenos.jsp\" role=\"button\">Acceder</a></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4 justificado\">\n");
      out.write("          <h2>Categorias</h2>\n");
      out.write("          <p>Programacion web<br>Programacion para dispositivos moviles<br>programacion para aplicaciones de escritorio<br>Diseño grafico<br>Programas de oficina</p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"cursos.jsp\" role=\"button\">Acceder</a></p>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"col-md-4 justificado\">\n");
      out.write("          <h2>Servicios</h2>\n");
      out.write("          <p>Cursos nivel basico<br>cursos nivel intermedio<br>cursos nivel avanzado<br>chat en linea para consultas mediante nuestra pagina de fb</p>\n");
      out.write("          <p><a class=\"btn btn-default\" target=\"_blank\" href=\"#\" role=\"button\">Visitaos en nuestras redes sociales</a></p>\n");
      out.write("\t\t  <br>\n");
      out.write("\t\t  <a href=\"https://www.facebook.com/TecnoInfoSV/\" target=\"_blank\"><img alt=\"siguenos en facebook\" height=\"40\" src=\"http://3.bp.blogspot.com/-MQuocq7OzfU/UiXwUY81yQI/AAAAAAAAB0Q/h6-R_R2-buI/s1600/face.png\" title=\"siguenos en facebook\" width=\"40\" /></a>\n");
      out.write("          <a href=\"https://twitter.com/TecnoInfoSV\" target=\"_blank\"><img alt=\"siguenos en Twitter\" height=\"40\" src=\"http://2.bp.blogspot.com/-ZaTYz5sdFmc/UiX1V-AhNLI/AAAAAAAAB6M/ufa5OqT3x4o/s1600/Twitter+alt+4.png\" title=\"siguenos en Twitter\" width=\"40\" /></a>\n");
      out.write("          <a href=\"http://tecnoinfo.pswebstore.com/es/\" target=\"_blank\"><img alt=\"vsita nuestra tienda\" height=\"40\" src=\"http://webmediaart.com/wp-content/uploads/2014/06/51527.png\" title=\"Visita nuestra tienda\" width=\"40\" /></a>\n");
      out.write("\n");
      out.write("\t\t  \n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <hr>\n");
      out.write("\n");
      out.write("      <footer>\n");
      out.write("        <p>&copy; tecnoinfo S.A. de C.V. 2015</p>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <a href=\"#miSlider\" class=\"carousel-control left\" data-slide=\"prev\">\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      </a>\n");
      out.write("      <a href=\"#miSlider\" class=\"carousel-control right\" data-slide=\"next\">\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("          $('#acept').click(function(){\n");
      out.write("            var name = $('#nom');\n");
      out.write("            var edad = $('#edad');\n");
      out.write("            var tel = $('#tel');\n");
      out.write("            var mail = $('#mail');\n");
      out.write("            var pass = $('#pass');\n");
      out.write("            var nac = $('#nac');\n");
      out.write("\n");
      out.write("            var datos = \"name=\"+name+\"edad=\"+edad+\"tel=\"+tel+\"mail=\"+mail+\"pass=\"+pass+\"nac=\"+nac;\n");
      out.write("            $.ajax({\n");
      out.write("              type: \"POST\",\n");
      out.write("              url: \"../Controller/controlador.php\",\n");
      out.write("              data: datos\n");
      out.write("            }).done(function(data){\n");
      out.write("              document.message(\"Todo listo\");\n");
      out.write("            });\n");
      out.write("          });\n");
      out.write("        </script>\n");
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
