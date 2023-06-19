<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SB Admin - Start Bootstrap Template</title>
  <!-- Bootstrap core CSS-->
 <!-- <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> --> 
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.min.css" type="text/css">
  <!-- Custom fonts for this template-->
 <!-- <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"> -->
   <link href="${pageContext.servletContext.contextPath}/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
 <!--  <link href="css/sb-admin.css" rel="stylesheet"> -->
   <link href="${pageContext.servletContext.contextPath}/css/sb-admin.css" rel="stylesheet" type="text/css">
</head>
<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div class="card-body">
        <!--<form> -->			
        <form:form action="login1.html" method="post" commandName="loginForm">
          <div class="form-group">
            <label for="exampleInputEmail1">UserName</label>
            <!--<input class="form-control" id="exampleInputEmail1" type="UserName" aria-describedby="emailHelp" placeholder="UserName">-->
            <form:input path="userName" class="form-control" id="userName" type="text" aria-describedby="userName" placeholder="UserName"/><span id="nameErr"></span>
          </div>
           <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <!--<input class="form-control" id="exampleInputEmail1" type="UserName" aria-describedby="emailHelp" placeholder="UserName">-->
            <form:input path="userPassword" class="form-control"  id="Password" type="text" aria-describedby="Password" placeholder="Password"/><span id="pasErr"></span>
          </div>
          
          <!--  <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input class="form-control" id="exampleInputPassword1" type="password" placeholder="Password">
           <form:input path="userPassword" class="control" id="userPassword" type="password" aria-describedby="Password" placeholder="Password"/>
          </div>-->
          <div style="color:red"><c:out value="${userMessage}"></c:out></div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Remember Password</label>
            </div>
          </div>
         <!--<a class="btn btn-primary btn-block" href="index.html">Login</a> -->
           <input type="submit" class="btn btn-primary btn-block" value="Login"/>
          </form:form>
       <!--  </form>--> 
        <div class="text-center">
          <a class="d-block small mt-3" href="userregister.html">Register an Account</a>
          <a class="d-block small" href="forgotpass.html">Forgot Password?</a>
        </div>
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
  
     <c:set var="saveFlag" value="${actionMessage}"></c:set>
   <c:if test="${not empty saveFlag}">
   <div id="div3" style="width:975px; position:absolute;top:110px;left:261px;height:60px;display:none;background-color:Teal; text-align:center"><c:out value="${saveFlag}"></c:out></div>
</c:if>
</body>
</html>
