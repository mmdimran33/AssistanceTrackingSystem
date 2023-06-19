<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%-- <%@include file="footer.jsp"%> --%>
<%@include file="menu.jsp"%>
<%-- <%@include file="layout.jsp"%> --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.assistancetrack.model.Reciever"%>
<%@ page import="com.assistancetrack.model.AddMember"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Display</title>
<!-- Bootstrap core CSS-->
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.css"
	type="text/css">
<!-- Custom fonts for this template-->
<link
	href="${pageContext.servletContext.contextPath}/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- Custom styles for this template-->
<link href="${pageContext.servletContext.contextPath}/css/sb-admin.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.servletContext.contextPath}/css/sb.css"
	rel="stylesheet" type="text/css">
<!-- For DataTable configuration -->
<!--  <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>-->

<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/css/buttons.dataTables.min.css"
	type="text/css">
<!--<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/table.css" type="text/css">
-->
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/css/jquery.dataTables.min.css"
	type="text/css">

<style>
.form-control1 {
	
}

.dataTables_filter input {
	margin-bottom: 1px;
	!
	important;
}
.dataTables_filter {
     top: 1px !
	important;
}
</style>
</head>
<body>
<div class= "container">
<div>
<div class="card-header" style="width:98%">
          <a class="nav-link" href="addMember.html">
            <i class="fa fa-fw fa-area-chart"></i>
            <span class="#">Add Member</span>
          </a>
</div>
<div class="card-body">
<form:form method="post" action="displayMember1.html"
	commandName="memberForm">
<p class="h4">Member List</p>
	<table id="example" class="display nowrap" style="width:100%">
		<thead>
			<tr>
				<th>More Information</th>
				<th>Nick Name</th>
				<th>First Name</th>
				<th>Mobile No</th>
				<th>Received</th>
				<th>Profession</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="memberObj" items="${memberLists}">		
				<tr>
					<%-- <td><a href="<c:url value='editMember1/${memberObj.memberFirstContact}' />">More Info</a></td> --%>
					
					<td>
						<%--<a class="nav-link" href="addMember.html">More Info</a>--%>
						 <a href="${pageContext.request.contextPath}/editMember/${memberObj.memberId}/edit.html">More Info</a> 
					</td>
					<td><c:out value="${memberObj.memberNikeName}"></c:out></td>
					<td><c:out value="${memberObj.memberFName}"></c:out></td>
					<td><c:out value="${memberObj.memberFirstContact}"></c:out></td>
					<td><c:out value="${memberObj.reciever.ramount}"></c:out></td>
					<td><c:out value="${memberObj.memberProfession}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</form:form></div>
</div>
</div>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/dataTables.buttons.min.js"
	type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/jquery.dataTables.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function() {
	 $('#example').DataTable( {
	        "scrollX": true
	    } );
} );
</script>
<%-- <c:set var="saveFlag" value="${actionMessage}"></c:set>
<c:if test="${not empty saveFlag}">
   <div id="div3" style="width:975px; position:absolute;top:75px;left:261px;height:60px;display:none;background-color:Teal; text-align:center"><c:out value="${saveFlag}"></c:out></div>
</c:if> --%>
</body>
</html>
