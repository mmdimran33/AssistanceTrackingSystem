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
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Edit Member</title>
<!-- For display Action message return from controller to set in div -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
        $("#div1").fadeIn();
        $("#div2").fadeIn("slow");
        $("#div3").fadeIn(200);
		$("#div3").fadeOut(12000);
});
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
</head>
<body>
<div class="container">
<div class="card card-register mx-auto mt-19">
<div class="card-header">Edit Member</div>
<div class="card-body">
<form:form method="post" action="${pageContext.request.contextPath}/editMember1/update.html" commandName="memberForm">
<div class="form-group">
<div class="form-row">
			<div class="col-md-6">
				<form:hidden path="memberId"/>
				<label for="exampleInputName">NickName</label> 
				<form:input path="nikeName" class="form-control2" id="exampleInputName" type="text"
					aria-describedby="NickName" placeholder="NickName"/>
			</div>
			<div class="col-md-6">
				<label for="exampleInputLastName">FirstName</label> 
				<form:input path="fName" class="form-control2" id="exampleInputName" type="text"
				aria-describedby="NickName" placeholder="Name"/>
			</div>
</div>
</div>

<div class="form-group">
	<div class="form-row">
	 	<div class="col-md-6">
	 		<label for="exampleInputEmail1">LastName</label>
	     	<form:input path="lName" class="form-control2" id="exampleInputEmail1" type="text"
				aria-describedby="NickName" placeholder="LastName"/>
	     </div>
	<div class="col-md-6">
			<label for="exampleInputEmail1">Contact1</label>
	   	 	<form:input path="firstContact" class="form-control2" id="exampleInputEmail1" type="text"
				aria-describedby="NickName" placeholder="Contact1"/>
	   	 </div>
	</div>
</div>

<div class="form-group">
	<div class="form-row">
		<div class="col-md-6">
			<label for="exampleConfirmPassword">Profession</label>
			<form:input path="profession" class="form-control2" id="exampleConfirmPassword"
				type="text" placeholder="Profession"/>
		</div>
		<div class="col-md-4">
				<label for="exampleInputPassword1">Contact2</label>
				<form:input path="secondContact" class="form-control2" id="exampleInputPassword1" type="text" placeholder="Contact2"  />
		</div>
	</div>
</div>
<div class="form-row">
<div class="col-md-6">
		<div class="form-group">
			<label for="exampleFormControlTextarea1">Address</label>
			<form:textarea path="address" class="form-control2" id="exampleFormControlTextarea1" rows="3"/>
		</div>
		</div> 
</div>
<div class="form-group">
<div class="form-row">
		<input type="submit" class="btn btn-success" value="Update"/>
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/displayMember.html">Cancel</a>
<!-- 			<input type="submit" onclick="/displayMember.html" class="btn btn-primary" value="Cancel" /> -->
</div>
</div>

</form:form>
</div>
</div>
</div>
<p>${actionMessage}</p>
<c:set var="editFlag" value="${actionMessage}"></c:set>
<c:if test="${not empty editFlag}">
   <div id="div3" style="width:975px; position:absolute;top:75px;left:261px;height:60px;display:none;background-color:Teal; text-align:center"><c:out value="${editFlag}"></c:out></div>
</c:if>
</body>
</html>