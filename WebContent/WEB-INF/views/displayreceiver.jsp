<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@include file="footer.jsp"%>
<%@include file="menu.jsp"%>
<%@include file="layout.jsp"%>
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
<!-- For DataTable configuration -->
<!--  <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>-->

<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/css/buttons.dataTables.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/css/jquery.dataTables.min.css"
	type="text/css">
<style>
.form-control1 {
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

.form-control2 {
	display: block;
	width: 200px;
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
<div class="container">
<div class="card card-register mx-auto mt-5" style="height:420px;overflow:auto;margin-top:26px !important;">
<div class="card-header"><a class="nav-link"
	href="addReciever.html"> <i class="fa fa-fw fa-area-chart"></i> <span
	class="#">Add Receiver</span> </a></div>
<div class="card-body"><!--<form> --> <form:form method="post"
	action="displayReciever1.html" commandName="recieverForm">
	<h2>Receiver List</h2>
	<table align="left" border="1" id="DataTableID">
		<thead>
			<tr>
			<th>More Information</th>
				<th>Nick Name</th>
				<th>Amount</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="recieverListObj" items="${recieverList}">
			<tr>
			<td><a href="${pageContext.request.contextPath}/receiverlist/${recieverListObj[0]}/receiverlist.html">More Info</a></td>
				<%-- <td><c:out value="${recieverListObj.rnickName}"></c:out></td>
				<td><c:out value="${recieverListObj.ramount}"></c:out></td> --%>
				<td><c:out value="${recieverListObj[0]}"></c:out></td>
				<td><c:out value="${recieverListObj[1]}"></c:out></td>
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
		$("#DataTableID").DataTable();
	});
</script>
</body>
</html>
