<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" >
	<link rel="stylesheet" href="css/login.css">
	<link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Cabin&family=Itim&display=swap" rel="stylesheet">
	
<title>Login</title>
</head>
<body>
<!-- MENSAJE --> 
  	<c:if test="${requestScope.MENSAJE!=null}">
	  		<div class="alert alert-dark alert-dismissible fade show" role="alert">
			  <strong>Mensaje : </strong>${requestScope.MENSAJE}
			  <button type="button" class="close btn-close" data-dismiss="alert" aria-label="Close">
			    <span aria-hidden="true">&times;</span>
			  </button>
			</div>
  		</c:if>

<!--  -->			
<div class="container">

	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Ingresar</h3>
				<div class="d-flex justify-content-end social_icon">
				<a href="https://www.facebook.com/UnicaSLG">
					<span><i  class="fab fa-facebook-square"></i></span>
				</a>	
				<a href="https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&hd=unica.edu.pe&sacu=1&flowName=GlifWebSignIn&flowEntry=AddSession">
					<span><i class="fab fa-google-plus-square"></i></span>
				</a>
				<a href="https://www.youtube.com/user/UnicaSLG">
					<span><i class="fab fa-youtube-square"></i></span>
				</a>
				</div>
			</div>
			<div class="card-body">
				<form id ="formLogin"action="ServletUsuario?ACCION=INICIAR" method="post" >
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" name="login" placeholder="username" required="required">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" name="clave" placeholder="password" required="required">
					</div>
						<div class="form-group">
						<input  type="submit" value="Login" aria-pressed="true"  class="btn float-right login_btn">
					</div>
					
				</form>
			</div>
	
		</div>
	</div>
</div>

<!-- Javascript -->

		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"></script>
	    <script src="https://cdn.bootcdn.net/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>
	
	    <script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
	    <script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap4.min.js"></script>

</body>
</html>
