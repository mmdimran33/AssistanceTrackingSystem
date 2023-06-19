<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
 <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Forgot Password</title>
  <!-- Bootstrap core CSS-->
 <!-- <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> --> 
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.min.css" type="text/css">
  <!-- Custom fonts for this template-->
 <!-- <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"> -->
   <link href="${pageContext.servletContext.contextPath}/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
 <!--  <link href="css/sb-admin.css" rel="stylesheet"> -->
   <link href="${pageContext.servletContext.contextPath}/css/sb-admin.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Forgot Password</div>
      <div class="card-body">
	<form:form action="forgotpassword1.html" commandName="forgotPassForm" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">Enter the User Name:</label>
			<!--<input class="form-control" id="exampleInputEmail1" type="UserName" aria-describedby="emailHelp" placeholder="UserName">-->
			<form:input path="userName" class="form-control" id="fuserName"
				type="text" aria-describedby="fuserName" placeholder="User Name" />
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Enter the New Password:</label>
			<!--<input class="form-control" id="exampleInputEmail1" type="UserName" aria-describedby="emailHelp" placeholder="UserName">-->
			<form:input path="userNewPassword" class="form-control" id="fPassword"
				type="text" aria-describedby="fPassword" placeholder="New Password" />
		</div>

		<div class="form-group">
			<label for="exampleInputPassword1">Confirm the New Password:</label>
			<!--<input class="form-control" id="exampleInputEmail1" type="UserName" aria-describedby="emailHelp" placeholder="UserName">-->
			<form:input path="userPassword" class="form-control" id="CPassword"
				type="text" aria-describedby="confirmPassword" placeholder="Confirm Password" />
		</div>


<%-- 		<div style="color: red">
			<c:out value="${userMessage}"></c:out>
		</div> --%>
		<input type="submit" class="btn btn-primary btn-block" value="Submit" />
	</form:form>
	 </div>
      </div>
    </div>
  
  <!-- Bootstrap core JavaScript-->
  <!-- <script src="vendor/jquery/jquery.min.js"></script> -->
  <script src="<%=request.getContextPath()%>/js/jquery.min.js" type="text/javascript"></script>
 <!-- <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>  -->
      <script src="<%=request.getContextPath()%>/js/boostrapjs/bootstrap.bundle.min.js" type="text/javascript"></script>
  <!-- Core plugin JavaScript-->
 <!-- <script src="vendor/jquery-easing/jquery.easing.min.js"></script> --> 
  <script src="<%=request.getContextPath()%>/js/jquery.easing.min.js" type="text/javascript"></script>
</body>
</html>