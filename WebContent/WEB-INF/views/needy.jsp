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
<title>Needy Pages</title>
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
<div class="card-header">Needy Information</div>
<div class="card-body">
 <form:form method="post" action="needy1.html" commandName="needyForm">
<div class="form-group">
<div class="form-row">
 <div class="col-md-6"><label for="exampleInputName">Name</label>
 <form:input path="needyName" class="form-control2" id="needyName" type="text" aria-describedby="Name" placeholder="Name"/></div>
    <div class="col-md-6"><label for="exampleInputLastName">Last Name</label>
	<form:input path="needyLastName" class="form-control2" id="needyLastName" type="text" aria-describedby="LastName" placeholder="LastName"/></div>
	 </div>
</div>
<div class="form-group">
<div class="form-row">
 	<div class="col-md-6"><label for="exampleInputEmail1">Mobile First</label>
     <form:input path="needyMobileNoFirst" class="form-control2" id="needyMobileNoFirst" type="text" aria-describedby="NickName" placeholder="Mobile First"/></div>
    <div class="col-md-6"><label for="exampleInputEmail1">Mobile Second</label>
    <form:input path="needyMobileNoSecond" class="form-control2" id="needyMobileNoSecond" type="text" aria-describedby="NickName" placeholder="Mobile Second optional"/></div>
</div>
</div>

<div class="form-group">
<div class="form-row">
<div class="col-md-6"><label for="exampleConfirmPassword">Profession</label>
	<form:input path="needyProfession" class="form-control2" id="needyProfession" type="text" placeholder="Profession"/></div>
	<%-- <div class="col-md-4"><label for="exampleInputPassword1">Registered Date</label>
	<form:input path="needyRegisteredDate" class="form-control2" id="needyRegisteredDate" type="text" placeholder="Registered Date"/></div>--%>
	
</div>
</div>

<div class="form-row">
<div class="col-md-6">
<div class="form-group"><label for="exampleFormControlTextarea1">Address</label>
<form:textarea path="needyAddress" class="form-control2" id="needyAddress" rows="3"/></div>
</div>
</div>

<div class="form-group">
<div class="form-row">
<div class="col-md-6"><label for="exampleConfirmPassword">Reason/Problem</label>
<form:select path="needyReasonProblem">
    <%-- <form:option value="NONE" label="<--Select the Reason-->" cssStyle="3"></form:option> --%>
    <form:option value="Medical">Medical</form:option>
    <form:option value="Widows">Widows</form:option>
    <form:option value="Fees">Fees</form:option>
    <form:option value="Other">Other</form:option>
  </form:select>
  
<br><br>
<div class="form-group"><label for="exampleFormControlTextarea1">Reason In Details</label>
<form:textarea path="needyReasonDetails" class="form-control2" id="needyReasonDetails" rows="2"/></div>
  
<%-- 	<form:input path="needyReasonProblem" class="form-control2" id="needyReasonProblem" type="text" placeholder="Reason/Problem"/> --%>
	</div>
<div class="col-md-4"> <label for="exampleConfirmPassword">Amount Alloted</label>
	<form:input path="needyAmountAlotted" class="form-control2" id="needyAmountAlotted" type="text" placeholder="Amount Alloted"/></div>
</div>
</div>

<%-- <div class="form-row">
<div class="col-md-6">
<div class="form-group"><label for="exampleConfirmPassword">Amount Dispatch Date</label>
	<form:input path="needyAmountDispatchDate" class="form-control1" id="needyAmountDispatchDate" type="text" rows="3"/></div>
	</div>
	</div>--%>
	
<div class="form-row">
<div class="col-md-6">
<div class="form-group"><label for="exampleConfirmPassword"><b>Needy Reffered By:</label></b>
	</div>
	</div>
	</div>
	
	
<div class="form-group">
<div class="form-row">
<div class="col-md-6"><label for="exampleConfirmPassword">Name</label>
	<form:input path="needyRefName" class="form-control2" id="needyRefName" type="text" placeholder="Refferd Name"/></div>
<div class="col-md-4"> <label for="exampleConfirmPassword">Mobile First</label>
	<form:input path="needyRefMobileNoFirst" class="form-control2" id="needyRefMobileNoFirst" type="text" placeholder="Refferd Mobile"/></div>
</div>
</div>

<div class="form-row">
<div class="col-md-6">
<label for="exampleConfirmPassword">Relation With Needy</label>
<select name="needyRelationWithNeedy">
<!-- 	 <option value="">Select the Relationship</option> -->
    <option value="Sister">Sister</option>
    <option value="Father">Father</option>
    <option value="Cousin">Cousin</option>
    <option value="Friend">Friend</option>
     <option value="Relative">Relative</option>
  </select>
	<%-- <form:input path="needyRelationWithNeedy" class="form-control1" id="needyRelationWithNeedy" type="text" rows="3" placeholder="Relation With Needy"/> --%>
	</div>
</div>
<br>
<div class="form-group">
<div class="form-row">
<input type="submit" class="btn btn-success" value="Save"/>
<a class="btn btn-primary" href="displayNeedy.html">Cancel</a>
<!-- <input type="submit" class="btn btn-primary" href="displayMember.html" value="Cancel"/> -->
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
