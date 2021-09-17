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
    <link rel ="stylesheet" href="css/Inicio.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap4.min.css">
<title>Menú Principal</title>

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
</ul> 
</div> -->

<div class="contenedor-inicio" style="width: 90%;
    max-width: 100%;
    margin: 0px 2.9em;
    padding: 0px;">

    <section class="carousel" aria-label="Gallery">
  <ol class="carousel__viewport">
    <li id="carousel__slide1"
        tabindex="0"
        class="carousel__slide">
        <img alt="portada1" src="img/univ01.jpg" style="max-width:100%">
      <div class="carousel__snapper">
        <a href="#carousel__slide4"
           class="carousel__prev">Go to last slide</a>
        <a href="#carousel__slide2"
           class="carousel__next">Go to next slide</a>
      </div>
    </li>
    <li id="carousel__slide2"
        tabindex="0"
        class="carousel__slide">
        <img alt="portada2" src="img/univSLG.png" style="max-width:100%">
      <div class="carousel__snapper"></div>
      <a href="#carousel__slide1"
         class="carousel__prev">Go to previous slide</a>
      <a href="#carousel__slide3"
         class="carousel__next">Go to next slide</a>
    </li>
    <li id="carousel__slide3"
        tabindex="0"
        class="carousel__slide">
        <img alt="portada3" src="img/univ02.jpg" style="max-width:100%">
      <div class="carousel__snapper"></div>
      <a href="#carousel__slide2"
         class="carousel__prev">Go to previous slide</a>
      <a href="#carousel__slide4"
         class="carousel__next">Go to next slide</a>
    </li>
    <li id="carousel__slide4"
        tabindex="0"
        class="carousel__slide">
        <img alt="portada4" src="img/univ03.jpg" style="max-width:100%">
      <div class="carousel__snapper"></div>
      <a href="#carousel__slide3"
         class="carousel__prev">Go to previous slide</a>
      <a href="#carousel__slide1"
         class="carousel__next">Go to first slide</a>
    </li>
  </ol>
  <aside class="carousel__navigation">
    <ol class="carousel__navigation-list">
      <li class="carousel__navigation-item">
        <a href="#carousel__slide1"
           class="carousel__navigation-button">Go to slide 1</a>
      </li>
      <li class="carousel__navigation-item">
        <a href="#carousel__slide2"
           class="carousel__navigation-button">Go to slide 2</a>
      </li>
      <li class="carousel__navigation-item">
        <a href="#carousel__slide3"
           class="carousel__navigation-button">Go to slide 3</a>
      </li>
      <li class="carousel__navigation-item">
        <a href="#carousel__slide4"
           class="carousel__navigation-button">Go to slide 4</a>
      </li>
    </ol>
  </aside>
</section>

</div>

</div>

<!-- Javascript -->

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>

    <script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap4.min.js"></script>
    
</body>
</html>