<%-- 
    Document   : resultado
    Created on : 11-07-2015, 01:45:42 PM
    Author     : Victor Arturo
--%>

<%@page import="modelo.Email"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>resultado</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>
        <link rel="stylesheet" href="../css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="../css/style.css">
        <link rel="stylesheet" href="../css/main.css">

        <script src="../js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    
    </head>
    <body>
        <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
    <nav class="navbar nav-principal navbar-fixed-top" role="navigation">


      <div class="container">
        <div class="navbar-header">

          <button class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
            <span class="icon-bar app-bar"></span>
            <span class="icon-bar app-bar"></span>
            <span class="icon-bar app-bar"></span>
          </button>
          <a class="navbar-brand link-personalizado" href="index.jsp">TecnoInfo</a>
        </div>
         <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right nav-1">
              <li><a href="vistas/cursos.jsp">Cursos
                <span class="glyphicon glyphicon-tag"></span></a></li>
              <li><a href="vistas/descuentos.jsp">Descuentos
                <span class="glyphicon icon-gift"></span></a></li>
              <li><a href="vistas/paquetes.jsp">Paquetes
                <span class="glyphicon icon-briefcase"></span></a></li>
              <li><a href="vistas/contactenos.jsp">Contactenos
                <span class="glyphicon icon-envelop"></span></a></li>
              <li><a href="vistas/registrese.jsp" data-toggle="modal">Registro
                <span class="glyphicon icon-user-plus"></span></a></li>
              <li><a href="vistas/ingresar.jsp">Ingresar
                <span class="glyphicon icon-users"></span></a></li>
            </ul>

          </div><!--/.navbar-collapse -->
        </div><!--/.navbar-collapse -->
      
    </nav>
      <section class="app-principal">
        <div class="container">
         <h1>TECNOINFO</h1>
          <p>Lo mejor en cursos en linea</p>
        <div>
      </section>

    <div class="container">
      <!-- Example row of columns -->
      
      <center>
       <%
        Email email = new Email();
        String de = request.getParameter("de");
        String clave = request.getParameter("clave");
        String para = request.getParameter("para");
        String mensaje = request.getParameter("mensaje");
        String asunto = request.getParameter("asunto");
       
        /*
        String[] direcciones = {"correo numero 1","correo numero 2","correo numero 3","correo ..."}
        boolean resultado =  email.enviarCorreo(de, clave, direcciones, mensaje, asunto);
        */
       boolean resultado =  email.enviarCorreo(de, clave, para, mensaje, asunto);
        if(resultado)
        {
            out.print("<h3>correo enviado:</h3>"+"\n\n"+"<a href='contactenos.jsp'><br><br><input type='submit' name='acept' value='Volver al Inicio' class='btn btn-primary'></a>");
        }else{
            out.print("<h3>correo no enviado:</h3>"+"\n\n"+"<a href='contactenos.jsp'><br><br> <input type='submit' name='acept' value='Volver al Inicio' class='btn btn-primary'></a>");
        }
        
        %>
        
      
      </center>
      <hr>

      <footer>
        <p>&copy; BRBJ S.A. de C.V. 2015</p>
      </footer>





    </div> <!-- /container -->        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="../js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

        <script src="../js/vendor/bootstrap.min.js"></script>

        <script src="../js/main.js"></script>


        <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
        <!--<script>
          (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
            function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
            e=o.createElement(i);r=o.getElementsByTagName(i)[0];
            e.src='//www.google-analytics.com/analytics.js';
            r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
            ga('create','UA-XXXXX-X','auto');ga('send','pageview');
        </script>-->
    </body>
</html>
