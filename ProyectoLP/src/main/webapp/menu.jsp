<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>


<div class="pos-f-t" style="max-width:100%;">
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark" style="background-color: #F29F05 !important;">
	  	  <div class="navbar-header">
		       <div class="navbar-header">
	     		 <a class="navbar-brand" href="#" style="font-size: 16px !important; color: #522913; font-weight: bold;">
	     		 <img alt="logo" src="img/logoUSLG.png" style="max-width: 100%;
    width: 280px;"></a>
	  			</div>
	  	</div>
	  
	  <div class="collapse navbar-collapse" style="font-size:15px; color: #522913;">
		  <ul class="navbar-nav">
	
		   	<c:forEach items="${sessionScope.MENUS}"  var="bean" >
			    <li class="nav-item" >
			      <a class="nav-link" href="${bean.url}" style="font-size: 15px !important; color: #522913;">
			      ${bean.nombre}</a>
			    </li>
			</c:forEach>
	
		    
		  </ul>
	
		  <div class="navbar-nav ml-auto">
		  		
		     	<span class="nav-item nav-link" style="font-size: 15px !important; color: #522913;">
		     	${sessionScope.DATOS}
		     	</span>  
		     
		        <a href="ServletUsuario?ACCION=CERRAR" class="nav-item nav-link" 
		        style="font-size: 15px !important; color: #522913; ">
		        Cerrar Sesión</a>
	      </div>
    </div>
	</nav>
</div>

<!--  
<div class="logo" style="margin:20% 40%;">
    <img alt="UniversidadSLG" src="img/logoUSLG.png">
</div> -->


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
<script   src="http://code.jquery.com/jquery-3.3.1.min.js" ></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>



</body>
</html>

