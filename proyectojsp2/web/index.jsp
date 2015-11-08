<%-- 
    Document   : index
    Created on : 11-07-2015, 03:34:18 PM
    Author     : Victor Arturo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>index</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/main.css">

        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    
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
          <map name="mapa1">
            <area shape="rect" coords="0,0,70,50" href="index.jsp" />
          </map>
          <a href="index.jsp"><img src="img/logo.PNG" width="70" height="50" usemap="#mapa1"></a>
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
          <h1>----------------------</h1>
          <p><h3>Bienvenidos a TecnoInfo</h3></p>
        <div>

          <!--Modal de Ingreso-->
          <div class="modal fade" id="modelIngreso">
            <div class="modal-dialog">
              <div class="modal-content m">
                  <div class="modal-header">
                    <h4 class="modal-title">Ingresar</h4>
                  </div>
                  <div class="modal-body m">
                    <form action="#" method="POST">
                      <div class="form-group">
                        <label for="user"></label>
                        <input type="text" name="user" placeholder="E-Mail">
                      </div>
                      <div class="form-group">
                        <label for="pass"></label>
                        <input type="password" name="pass" placeholder="Password">
                      </div>
                    </form>
                  </div>
                  <div class="modal-footer m">
                    <input type="text" class="btn btn-primary" value="Aceptar" name="acept1">
                    <input type="text" class="btn btn-default" value="Cancelar" name="cancel1" data-dismiss="modal">
                  </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <div class="carousel slide" id="miSlider" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#miSlider" data-slide-to="0" class="active"></li>
            <li data-target="#miSlider" data-slide-to="1"></li>
            <li data-target="#miSlider" data-slide-to="2"></li>
            <li data-target="#miSlider" data-slide-to="3"></li>
            <li data-target="#miSlider" data-slide-to="4"></li>
          </ol>
          <div class="carousel-inner">
            <div class="item active">
              <img src="img/img1.jpg" alt="Imagen1" class="img2">
            </div>
            <div class="item">
              <img src="img/img2.jpg" alt="Imagen2" class="img2">
            </div>
            <div class="item">
              <img src="img/img3.jpg" alt="Imagen3" class="img2">
            </div>
            <div class="item">
              <img src="img/img4.jpg" alt="Imagen4" class="img2">
            </div>
            <div class="item">
              <img src="img/img5.jpg" alt="Imagen5" class="img2">
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4 justificado">
          <h2>Curso de jsp</h2>
          <img src="img/jsp.jpg" width="360" height="240"/>
          <p>En este curso, aprendera a desarrollar paginas web haciendo uso del lenguaje HTML con codigo JAVA Embebido, desde aplicaciones sencillas hasta conexion con Bases de datos, utilizando MySQL.</p>
          <p><a class="btn btn-default" href="cursos.jsp" role="button">Ver Detalles</a></p>
        </div>
        <div class="col-md-4 justificado">
          <h2>Curso de Microsoft Office</h2>
          <img src="img/office.jpg" width="360" height="240"/>
          <p>Curso diseñado para todas aquellas personas que deseen llevar su conociemiento del software de oficina mas utilizado mundialmente a un nivel avanzado, permitiendo crear documentos, presentaciones u hojas de calculo con mejor calidad.</p>
          <p><a class="btn btn-default" href="cursos.jsp" role="button">Ver Detalles</a></p>
       </div>
        <div class="col-md-4 justificado">
          <h2>Curso de Photoshop</h2>
          <img src="img/photoshop.jpg" width="360" height="240"/>
          <p>Si estas cansado de editar tus imagenes con paint y no tienes conocimientos de edición con photoshop, este curso te ayudará a conocer éste programa y a utilizar todas las herramientas que posee para la edicion de fotografias e imágenes en general.</p>
          <p><a class="btn btn-default" href="cursos.jsp" role="button">Ver Detalles</a></p>
		  <br>
		  <a href="https://www.facebook.com/TecnoInfoSV/" target="_blank"><img alt="siguenos en facebook" height="40" src="http://3.bp.blogspot.com/-MQuocq7OzfU/UiXwUY81yQI/AAAAAAAAB0Q/h6-R_R2-buI/s1600/face.png" title="siguenos en facebook" width="40" /></a>
          <a href="https://twitter.com/TecnoInfoSV" target="_blank"><img alt="siguenos en Twitter" height="40" src="http://2.bp.blogspot.com/-ZaTYz5sdFmc/UiX1V-AhNLI/AAAAAAAAB6M/ufa5OqT3x4o/s1600/Twitter+alt+4.png" title="siguenos en Twitter" width="40" /></a>
          <a href="http://tecnoinfo.pswebstore.com/es/" target="_blank"><img alt="vsita nuestra tienda" height="40" src="http://webmediaart.com/wp-content/uploads/2014/06/51527.png" title="Visita nuestra tienda" width="40" /></a>

		  
		</div>
		
      </div>

      <hr>

      <footer>
        <p>&copy; tecnoinfo S.A. de C.V. 2015</p>
      </footer>


      <a href="#miSlider" class="carousel-control left" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
      </a>
      <a href="#miSlider" class="carousel-control right" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right"></span>
      </a>



    </div> <!-- /container -->        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.min.js"></script>

        <script src="js/main.js"></script>
        <script type="text/javascript">
          $('#acept').click(function(){
            var name = $('#nom');
            var edad = $('#edad');
            var tel = $('#tel');
            var mail = $('#mail');
            var pass = $('#pass');
            var nac = $('#nac');

            var datos = "name="+name+"edad="+edad+"tel="+tel+"mail="+mail+"pass="+pass+"nac="+nac;
            $.ajax({
              type: "POST",
              url: "../Controller/controlador.php",
              data: datos
            }).done(function(data){
              document.message("Todo listo");
            });
          });
        </script>

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
