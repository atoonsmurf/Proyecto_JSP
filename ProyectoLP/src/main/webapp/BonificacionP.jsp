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
    <link rel ="stylesheet" href="css/Bonificacion.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap4.min.css">
<title>Bonificación Personal</title>

</head>

<body>

<div class="contenedor" style="margin: 4em 4em;
    width: auto;
    max-width:100%;
    height: 800px;
    border-radius: 10px;
    background-color: white;
    box-shadow: 10px 10px 12px rgb(60 60 60 / 14%), -10px -10px 12px rgb(60 60 60 / 14%);">

<div class="titulo" >
<h1>Registrar Solicitud de Bonificación Personal</h1>
</div>
<!-- Ocultar menú 
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
</div>
 Fin menú -->

<div class="contenedor-bonificacion" style="width: 100%;
    max-width: 100%;
    margin: auto;
    padding: 0px; float: left;">
    
              <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Registro de Solicitud por Bonificación Personal</h5>
              </div>
              <div class="modal-body">
                <form id="idRegistra" action="ServletBonificación" method="post" data-toggle="validator" role="form">
                  <div class="form-group">
                    <label for="exampleInputPassword1">Trabajador</label>
                    <select class="form-control" name="condicion" id="idTrabajador">
                      <option value=" ">[Seleccione Trabajador]</option>
                    </select>
                  </div>
                   <div class="form-group">
                    <label for="exampleInputEmail1">Fecha</label>
                    <input type="datetime-local" class="form-control" name="idEstado">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Detalle</label>
                    <input type="text" class="form-control" name="idDetalle">
                  </div>
                   <div class="form-group">
                    <label for="exampleInputEmail1">Estado</label>
                    <input type="text" class="form-control" name="idEstado">
                  </div>
                  <div class="modal-footer">
                    <button type="submit" class="btn btn-primary">Registrar</button>
                  </div>    
                </form>
              </div>
            </div>
          </div>
 
</div>
    
</div>

<!-- Javascript -->

    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>
    <script type="text/javascript" src="js/JSNosotros.js"></script>

    <script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap4.min.js"></script>
    
    <script>
    trabajadores();
    
    function trabajadores(){
        $.getJSON("ServletTrabajadorJSON",{},function(response){
            $.each(response,function(index,item){
                $("#idTrabajador").append("<option value='"+item.codigo+"'>"+item.nomtrabajador+"</option>");
            })
        })
    } 
    
    
    </script>
    
</body>
</html>