<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@include file="footer.jsp"%>
<%@include file="menu.jsp"%>
<%@include file="layout.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.assistancetrack.model.Reciever"%>
<%@ page import="com.assistancetrack.model.AddMember"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="header.jsp"%>
<%@include file="menu.jsp"%>
<%@include file="layout.jsp"%>
<html>
<body >
<c:set var="saveFlag" value="${actionMessage}"></c:set>
<form action="receiverMessage.html" commandName="recieverForm" method="post">


<table border="1" style="width:975px; position:absolute;top:75px;left:261px;height:60px;background-color:lightblue; text-align:center">
	<tr>
		<td colspan="2"><b>
		<c:if test="${not empty saveFlag}">
   			<c:out value="${saveFlag}"></c:out></c:if>
		<c:if test="${empty saveFlag}">
			<c:out value="${saveFlag}"></c:out></c:if>
		</b></td>
	</tr>
	<tr>
		<td>Nick Name</td>
		<td><c:out value="${recieverForm.nickName}"></c:out></td>
	</tr>
	<tr>
		
		<td>Amount</td>
		<td><c:out value="${recieverForm.amount}"></c:out></td>
	</tr>
	<tr>
		
		<td>Payment Date</td>
		<td><c:out value="${recieverForm.createdDate}"></c:out></td>
	</tr>
	
   	<tr>
   		<td colspan="2">
	    	<a class="btn btn-primary" href="${pageContext.request.contextPath}/displayReciever.html" >OK</a>
   		</td>
   	</tr>
   </table>

</form>

</body>
</html>