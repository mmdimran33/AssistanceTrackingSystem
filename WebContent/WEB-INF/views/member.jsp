<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="header.jsp"%>
<%--     <%@include file="footer.jsp"%> --%>
    <%@include file="menu.jsp"%>
<%--     <%@include file="layout.jsp"%> --%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

.error 
    {
        color: #ff0000;
        font-weight: bold;
    }
    
</style>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Menu</title>
<!-- For display Action message return from controller to set in div -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
        $("#div1").fadeIn();
        $("#div2").fadeIn("slow");
        $("#div3").fadeIn(200);
		$("#div3").fadeOut(12000);
});

function validMember(value){
	alert(123);
	return false
}  

</script>
<!-- Bootstrap core CSS-->
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
<script type="text/javascript">

 function validMember(val){
	 	window.location.href="displayMember.html";
		return true;
	/* alert(val.id);
	if(val.id=='sub'){
		window.location.href="displayMember.html";
		return true;
	}else{ 
		window.location.href="displayMember.html";
		return true;
	} */
} 
</script>
</head>
<body>
<div class="container">
<div class="card card-register mx-auto mt-19" >
<div class="card-header">Add Member</div>
<div class="card-body">
<!--<form> -->
<form:form method="post" action="addMember1.html" commandName="memberForm">
<div class="form-group">
<div class="form-row">
<div class="col-md-6"><label for="exampleInputName">NickName</label>
 	<form:input path="nikeName" class="form-control2" id="exampleInputName" type="text"
		aria-describedby="NickName" placeholder="NickName"/></div>
    <div class="col-md-6"><label for="exampleInputLastName">Name</label>
	<form:input path="fName" class="form-control2" id="exampleInputName" type="text" aria-describedby="NickName" placeholder="Name"/>
	</div>
	</div> 
</div>
<div class="form-group">
<div class="form-row">
 	<div class="col-md-6"><label for="exampleInputEmail1">LastName</label>
     <form:input path="lName" class="form-control2" id="exampleInputEmail1" type="text"
	aria-describedby="NickName" placeholder="LastName"/></div>
<div class="col-md-6"><label for="exampleInputEmail1">Contact1</label>
    <form:input path="firstContact" class="form-control2" id="exampleInputEmail1" type="text"
	aria-describedby="NickName" placeholder="Contact1"/></div>
</div>
</div>
<div class="form-group">
<div class="form-row">
<div class="col-md-6"><label for="exampleConfirmPassword">Profession</label>
	<form:input path="profession" class="form-control2" id="exampleConfirmPassword"
	type="text" placeholder="Profession"/></div>
	<div class="col-md-4"><label for="exampleInputPassword1">Contact2</label>
	<form:input path="secondContact" class="form-control2" id="exampleInputPassword1" type="text"
	placeholder="Contact2"  /></div>
</div>
</div>

<div class="form-row">
<div class="col-md-6">
<div class="form-group"><label for="exampleFormControlTextarea1">Address</label>
<form:textarea path="address" class="form-control2" id="exampleFormControlTextarea1" rows="3"/></div>
</div>
</div>
<div class="form-group">
<div class="form-row">
	<input id="sub" type="submit" class="btn btn-success"  value="Save" onclick="return validMember(this)"/>
  	<a class="btn btn-primary" id="can"  onclick="return validMember(this)">Cancel</a> 
	<!-- <input id="can" type="submit" class="btn btn-primary" value="Cancel"  onclick="return validMember(this)"/>-->
</div>
</div>
</form:form>
</div>
</div>
</div>
<c:set var="saveFlag" value="${actionMessage}"></c:set>
<c:if test="${not empty saveFlag}">
   <div id="div3" style="width:975px; position:absolute;top:75px;left:261px;height:60px;display:none;background-color:Teal; text-align:center"><c:out value="${saveFlag}"></c:out></div>
</c:if>
</body>
</html> 
