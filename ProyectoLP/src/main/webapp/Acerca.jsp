<jsp:include page="menu.jsp"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Fuentes -->
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Cabin&family=Itim&display=swap" rel="stylesheet">
<!-- CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel ="stylesheet" href="css/Estilos.css">
    <link rel ="stylesheet" href="css/Acercade.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap4.min.css">
<title>Capacitaci�n Oficializada</title>

</head>

<body>

<div class="contenedor" style="margin: 4em 4em;
    width: auto;
    height: 700px;
    border-radius: 10px;
    background-color: white;
    box-shadow: 10px 10px 12px rgb(60 60 60 / 14%), -10px -10px 12px rgb(60 60 60 / 14%);">

<div class="titulo" >
<h1>Universidad Nacional San Luis Gonzaga</h1>
</div>

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
    <p><a href="BonificacionP.jsp">Bonificaci�n Personal</a></p>
    <span>
    <img src="img/wreath.png" alt="bonificaci�n" style="max-width:100%">
    </span>
  </li>
  <li class="link">
    <p><a href="CapacitacionO.jsp">Capacitaci�n Oficializada</a></p>
    <span>
    <img src="img/presentation.png" alt="capacitaci�n" style="max-width:100%">
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
</ul> 
</div>

<div class="contenedor-acerca" style="width: 100%;
    max-width: 68%;
    margin: auto;
    padding: 0px; float: left;">
 
 <div class="version" >
<h3>Versi�n</h3>
<p>1.0</p>
 </div>
 
 <div class="autores" >
 <p>Creado por: Melany, Sebasti�n y Diego</p>
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