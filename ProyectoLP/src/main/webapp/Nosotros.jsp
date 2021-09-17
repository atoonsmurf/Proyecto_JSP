<jsp:include page="menu.jsp"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Fuentes -->
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Cabin&family=Itim&display=swap" rel="stylesheet">
<!-- CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel ="stylesheet" href="css/Estilos.css">
    <link rel ="stylesheet" href="css/Nosotros.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap4.min.css">
<title>Nosotros</title>

</head>

<body>

<div class="contenedor" style="margin: 4em 4em;
    width: auto;
    height: 800px;
    border-radius: 10px;
    background-color: white;
    box-shadow: 10px 10px 12px rgb(60 60 60 / 14%), -10px -10px 12px rgb(60 60 60 / 14%);">

<div class="titulo" >
<h1>Universidad Nacional San Luis Gonzaga</h1>
</div>

<!-- Ocultar menu 
<div class="menu">
<ul id="list">
  <li class="link">
    <p><a href="Inicio.jsp">Inicio</a></p>
    <span>
    <img src="img/house.png" alt="inicio" style="max-width:100%">
    </span>
  </li>
  <li class="link">
    <p><a href="Nosotros.jsp">Nosotros</a></p>
    <span><img src="img/united.png" alt="nosotros" style="max-width:100%">
    </span>
  </li>
  <li class="link">
    <p><a href="BonificacionP.jsp">Bonificación Personal</a></p>
    <span>
    <img src="img/wreath.png" alt="bonificación" style="max-width:100%">
    </span>
  </li>
  <li class="link">
    <p><a href="CapacitacionO.jsp">Capacitación Oficializada</a></p>
    <span>
    <img src="img/presentation.png" alt="capacitación" style="max-width:100%">
    </span>
  </li>
  <li class="link">
    <p><a href="login.jsp">Login</a></p>
    <span>
    <img src="img/log.png" alt="login" style="max-width:100%">
    </span>
  </li>
  <li class="link">
    <p><a href="Acerca.jsp">Acerca de</a></p>
    <span>
    <img src="img/informacion.png" alt="info" style="max-width:100%">
    </span>
  </li>
</ul> -->
</div>

<div class="contenedor-nosotros" style="width: 90%;
    max-width: 100%;
    margin: auto;
    padding: 0px; float: left;">
    
    <div class="container-fluid">
  <div class="col-lg-6 col-lg-offset-0 col-md-6 col-md-offset-0 col-sm-10 col-sm-offset-1 col-xs-12">
    <figure>
      <div class="media" style="background-image: url(img/ica01.jpg)"></div>
      <figcaption>
        <svg viewBox="0 0 200 200" version="1.1" preserveAspectRatio="none" xmlns="http://www.w3.org/2000/svg">
          <defs>
            <mask id="mask" x="0" y="0" width="100%" height="100%">
              <rect id="alpha" x="0" y="0" width="100%" height="100%"></rect>
              <text class="title" dx="50%" dy="2.5em">MISIÓN</text>
            </mask>
          </defs>
          <rect id="base" x="0" y="0" width="100%" height="100%"></rect>
        </svg>
        <div class="body">
          <p>Crear y desarrollar conocimientos científicos, generar tecnologías que se orienten al desarrollo sostenido de la región y del país, en el marco de los valores humanos,
           proporcionando los medios necesarios que permitan a la comunidad universitaria.</p>
        </div>
      </figcaption><a href="#"></a>
    </figure>
  </div>
 
</div>
    
</div>

<!-- Javascript -->

    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>
    <script type="text/javascript" src="js/JSNosotros.js"></script>

    <script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap4.min.js"></script>
    
</body>
</html>