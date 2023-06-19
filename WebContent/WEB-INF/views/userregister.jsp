<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%--  <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <%@include file="menu.jsp"%>
    <%@include file="layout.jsp"%>--%> 
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
        $("#div1").fadeIn();
        $("#div2").fadeIn("slow");
        $("#div3").fadeIn(200);
		$("#div3").fadeOut(12000);
});
</script>
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.css" type="text/css">
<!-- Custom fonts for this template-->
<link
	href="${pageContext.servletContext.contextPath}/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- Custom styles for this template-->
<link href="${pageContext.servletContext.contextPath}/css/sb-admin.css"
	rel="stylesheet" type="text/css">
<style > 
.form-control2 {
  display: block;
  width: 300px;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  line-height: 1.5;
  color: #495057;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px solid #ced4da;
  border-radius: 0.25rem;
  transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}
 </style>
 
</head>
<body>
<body class="bg-dark">
  <div class="container">
<div class="card card-register mx-auto mt-5" >
<div class="card-header">Add User</div>
<div class="card-body">
<!--<form> -->
<form:form method="post" action="addUser.html" commandName="userForm">
<div class="form-group">
<div class="form-row">
<div class="col-md-6"><label for="exampleInputName">User Name</label>
 <form:input path="userName" class="form-control2" id="exampleInputName" type="text"
	aria-describedby="userName" placeholder="UserName"/></div>
    <div class="col-md-6"><label for="exampleInputLastName">User Password</label>
	<form:input path="userPassword" class="form-control2" id="exampleInputName" type="text"
	aria-describedby="userPass" placeholder="UserPassword"/></div>
	</div> 
</div>
<div class="form-group">
<div class="form-row">
 	<div class="col-md-6"><label for="exampleInputEmail1">User First Name</label>
     <form:input path="userFirstName" class="form-control2" id="exampleInputEmail1" type="text"
	aria-describedby="userFirstName" placeholder="UserFirstName"/></div>
<div class="col-md-6"><label for="exampleInputEmail1">User Last Name</label>
    <form:input path="userLastName" class="form-control2" id="exampleInputEmail1" type="text"
	aria-describedby="userLastName" placeholder="UserLastName"/></div>
</div>
</div>
<div class="form-group">
<div class="form-row">
<div class="col-md-6"><label for="exampleConfirmPassword">First Mobile NO</label>
	<form:input path="userFirstMobileNo" class="form-control2" id="exampleConfirmPassword"
	type="text" placeholder="First Mobile No"/></div>
	<div class="col-md-4"><label for="exampleInputPassword1">Alternate Mobile NO</label>
	<form:input path="userAlternateMoNo" class="form-control2" id="exampleInputPassword1" type="text"
	placeholder="AlterNateMobileNo"  /></div>
</div>
</div>

<div class="form-row">
<div class="col-md-6">
<div class="form-group"><label for="exampleFormControlTextarea1">Email Id</label>
<form:textarea path="userEmailId" class="form-control2" id="exampleFormControlTextarea1" rows="3"/></div>
</div>
</div>
<div class="form-group">
<div class="form-row">
<input type="submit" class="btn btn-success" value="Save"/>
<%-- <input type="submit" class="btn btn-primary" onclick="${pageContext.request.contextPath}/login.html" value="Cancel"/> --%>
<a class="btn btn-primary" href="${pageContext.request.contextPath}/login.html" >Cancel</a>
</div>
</div>
</form:form>
</div>
</div>
</div>
 <%-- <c:set var="saveFlag" value="${actionMessage}"></c:set>
<c:if test="${not empty saveFlag}">
   <div id="div3" style="width:975px; position:absolute;top:75px;left:261px;height:60px;display:none;background-color:Teal; text-align:center"><c:out value="${saveFlag}"></c:out></div>
</c:if>--%>
</body>
</html>