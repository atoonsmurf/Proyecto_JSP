<jsp:include page="menu.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <link rel ="stylesheet" href="css/Capacitacion.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap4.min.css">
<title>Capacitación Oficializada</title>

</head>

<body>

<div class="contenedor" style="margin: 2em 4em;
    width: auto;
    max-width:100%;
    height: 62rem;
    border-radius: 10px;
    background-color: white;
    box-shadow: 10px 10px 12px rgb(60 60 60 / 14%), -10px -10px 12px rgb(60 60 60 / 14%);">

<div class="titulo"   style="max-width: 100%">
<h1>Registro de Solicitud de Licencia por Capacitación Oficializada</h1>
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
    <p><a href="Acerca.jsp">Acerca de</a></p>
    <span>
    <img src="img/informacion.png" alt="info" style="max-width:100%">
    </span>
  </li>
</ul> 
</div>  Fin menu-->

<div class="contenedor-capacitacion" style="width: 95%;
    max-width: 100%;
    margin: 0px 31px;
    padding: 0px; float: left;">
    
    
    
    <c:if test="${requestScope.MENSAJE!=null }">
			<div class="alert alert-warning alert-dismissible fade show" role="alert">
  				<strong>${requestScope.MENSAJE}</strong>
 					 <button type="button" class="close" data-dismiss="alert" aria-label="Close">
   				 <span aria-hidden="true">&times;</span>
 					 </button>
				</div>
			</c:if>
	
		<form>
		   <div class="form-row mt-4">
			    <div class="col-auto">
			       <label for="exampleInputPassword1">Ingresar Fecha</label>
			    </div>
			    <div class="col-auto">
			      	 <input type="text" class="form-control" id="idAnios">
			    </div>
			    <div class="col-auto">
			      <button type="button" class="btn btn-primary mb-2" id="btn-consultar">Consultar</button>
			    </div>
		  </div>
		</form>
    
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalSolicitud">
          Nueva Solicitud
        </button>
        
        <table id="tableSolicitudes" class="table table-striped table-bordered" style="width:100%">
        <thead>
            <tr style="background-color: gold;">
                <th>CÓDIGO</th>
                <th>TRABAJADOR</th>
                <th>FECHA</th>
                <th>DESCRIPCIÓN</th>
                <th>DURACIÓN</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
         <tbody>
            <!-- en el atributo items permite recuperar el atributo "solicitudes" que viene del ServletDocente -->
            <c:forEach items="${requestScope.Solicitudes}" var="row">
                <tr>
                    <td>${row.nroSoli}</td>
                    <td>${row.codTrab}</td>
                    <td>${row.fecha}</td>
                    <td>${row.descripcion}</td>
                    <td>${row.duracion}</td>
                    <td><button type="button" class="btn btn-info btn-editar" data-toggle="modal" data-target="#modalSolicitud">Editar</button></td>
                    <td><button type="button" class="btn btn-danger btn-eliminar" data-toggle="modal" data-target="#modalEliminar">Eliminar</button></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

                <!-- INICIO - Modal PARA REGISTRAR Y ACTUALIZAR DOCENTE-->
        <div class="modal fade" id="modalSolicitud" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">

                <h5 class="modal-title" id="staticBackdropLabel">Solicitud de Capacitación Oficializada</h5>

                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                <form id="formSolicitudes"  action="ServletSolicitud?ACCION=GUARDAR" method="post">
                 <div class="form-group">
                    <label for="exampleInputEmail1">Código</label>
                    <input type="text" class="form-control" id="idNumero" name="nroSoli" value="0" readonly>
                  </div>
                    
                  
                  <div class="form-group">
                    <label for="exampleInputPassword1">Trabajador</label>
                    <select class="form-control" id="idTrabajador" name="codTrab">
                      <option value=" ">[Seleccione Trabajador]</option>
                    </select>
                  </div>      
                  <div class="form-group">
                    <label for="exampleInputPassword1">Fecha</label>
                    <input type="date" class="form-control" id="idFecha" name="fecha" >
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Descripción</label>
                    <input type="text" class="form-control" id="idDescripcion" name="descripcion" placeholder="Ingresar descripción">
                  </div>            
                  <div class="form-group">
                    <label for="exampleInputPassword1">Duración</label>
                    <input type="text" class="form-control" id="idDuracion" name="duracion" placeholder="Ingresar duración de la capacitación">
                  </div>
                  <div class="modal-footer">
                    <button type="submit" class="btn btn-primary">Guardar</button>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal" id="btn-cerrar">Cerrar</button>                    
                  </div>
                </form>
              </div>
              
            </div>
          </div>
        </div>
        
        <!-- INICIO - Modal PARA ELIMINAR SOLICITUD -->
        <div class="modal fade" id="modalEliminar" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
          <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel">SISTEMA</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                <form id="formSolicitudes"  action="ServletSolicitud?ACCION=ELIMINAR" method="post">
              
                
                        <input type="hidden" class="form-control" id="idNroEliminar" name="nroEliminar"> 
                  
                  SEGURO DE ELIMINAR ?
                  <div class="modal-footer">
                    <button type="submit" class="btn btn-primary">SI</button>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">NO</button>                    
                  </div>
                </form>
              </div>
              
            </div>
          </div>
        </div>
        <!-- FIN - Modal PARA ELIMINAR SOLICITUD-->   
        
        
    
</div>

<!-- Javascript -->

   	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"  ></script>
	<script src="https://cdn.bootcdn.net/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>


	<script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js "></script>
	<script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap4.min.js" ></script>
    
    <script>
        $(document).ready(function() {
            $('#tableSolicitudes').DataTable();
            llenarTrabajadores();
        } );
    
        //asignar evento click a los botones con clase "btn-editar"
        $(document).on("click",".btn-editar",function(){
            //variables
            var nroSoli,codTrab,fecha,desc,duracion;
            //obtener valores de la fila actual segÃƒÂƒÃ‚Âºn donde se haga clic al botÃƒÂƒÃ‚Â³n editar
            nroSoli=$(this).parents("tr").find("td")[0].innerHTML;
            codTrab=$(this).parents("tr").find("td")[1].innerHTML;
            fecha=$(this).parents("tr").find("td")[2].innerHTML;
            desc=$(this).parents("tr").find("td")[3].innerHTML;
            duracion=$(this).parents("tr").find("td")[4].innerHTML;
            //mostrar los valores de las variables en los controles(cajas y select)
            $("#idNumero").val(nroSoli);
            $("#idTrabajador").val(codTrab);
            $("#idFecha").val(fecha);
            $("#idDescripcion").val(desc);
            $("#idDuracion").val(duracion);
        })
        
	     $(document).on("click","#btn-consultar",function(){

        	

        	$("#tableSolicitudes tbody").empty();

        	var anios;
        	anios=$("#idAnios").val();
        	
        	$.getJSON("ServletSolicitudPorAnio",{Anio:anios},function(response){
        		
        		$.each(response,function(index,item){
        			$("#tableSolicitudes").append("<tr><td>"+item.nroSoli+"</td><td>"+item.codTrab+"</td><td>"+item.fecha+"</td><td>"
        					+item.descripcion+"</td><td>"+item.duracion+"</td><td><button type='button' class='btn btn-success btn-editar' data-target='#modalSolicitud' data-toggle='modal'>Ver Datos</button></td><td>"+"<button type='button' class='btn btn-danger btn-eliminar' data-target='#modalEliminar' data-toggle='modal'>Eliminar Datos</button></td></tr>");
        		})
        	})
        })
	    
        //asignar evento click a los botones con clase "btn-eliminar"
        $(document).on("click",".btn-eliminar",function(){
            //variables
            var nroSoli,codTrab;
            //obtener codigo de la fila actual segÃºn donde se haga clic al botón editar
            nroSoli=$(this).parents("tr").find("td")[0].innerHTML;
       
            //
            $("#idNroEliminar").val(nroSoli);
         
           
        
        })

        $(document).on("click","#btn-cerrar",function(){
             //resetear validacion 
             $('#formSolicitudes'). data("bootstrapValidator").resetForm(true);
             //limpiar cajas
             $('#formSolicitudes').trigger("reset");
             //asignar "0" a la caja con ID "idCodigo" 
             $("#idNumero").val(0);
        })
        
        //implementar funcion para llenar el select con ID "idEstado"
        function llenarTrabajadores(){
            $.getJSON("ServltTrabajadorJSN",{},function(response){
                //bucle para realizar recorrido sobre "response"
                $.each(response,function(index,item){
                    $("#idTrabajador").append("<option value='"+item.codigo+"'>"+item.codigo+"</option>");
                })
                
            })
            
        }
        
    </script>
    
    <script type="text/javascript">    
    $(document).ready(function(){     
        $('#formSolicitudes').bootstrapValidator({      
             fields:{
            	 codTrab:{
            		 validators:{
            			 notEmpty:{
            				 message:'Campo trabajador es obligatorio'
            			 }
            		 }
            	 },
                    descripcion:{
                        validators:{
                            notEmpty:{
                                message:'Campo descripción es obligatorio'
                            },
                            regexp:{
                                regexp:/^[a-zA-Z\s\0-9]{3,100}$/,
                                message:'Campo descripción solo letras mínimo 3 y máximo 100'
                            }
                        }
                    },
                    duracion:{
                        validators:{
                            notEmpty:{
                                message:'Campo duración es obligatorio'
                            },
                            regexp:{
                                regexp:/^[a-zA-Z\s\0-9]{3,30}$/,
                                message:'Campo duración mínimo 3 y máximo 30'
                            }
                        }
                    },
                    fecha:{
                        validators:{
                            notEmpty:{
                                message:'Campo fecha es obligatorio'
                            }
                        }
                    },  
             }
        });   
            
    });    
</script>
    
</body>
</html>
