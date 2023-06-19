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
<div class="card-header">Receiver Details</div>
<div class="card-body">
<form method="post" action="${pageContext.request.contextPath}/editMember1/update.html" commandName="rBean">



<table align="center" border="1" id="DataTableID">
		<thead>
			<tr>
			<th>More Information</th>
				<th>Nick Name</th>
				<th>Amount</th>
				<th>Date</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="recieverListObj" items="${recieverDetailsList}">
			<tr>
			<td><a href="${pageContext.request.contextPath}/receiveredit/${recieverListObj[3]}/receiveredit.html">More Info</a></td>
				<%-- <td><c:out value="${recieverListObj.rnickName}"></c:out></td>
				<td><c:out value="${recieverListObj.ramount}"></c:out></td> --%>
				<td><c:out value="${recieverListObj[0]}"></c:out></td>
				<td><c:out value="${recieverListObj[1]}"></c:out></td>
				<td><c:out value="${recieverListObj[2]}"></c:out></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<br>
	
<div align="center">
	<a  class="btn btn-primary" href="${pageContext.request.contextPath}/displayReciever.html">Back</a>

</div>

</form>

</div>
</div>
</div>

</body>
</html>