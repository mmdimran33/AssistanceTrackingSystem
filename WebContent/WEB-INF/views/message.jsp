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
<%-- <body>
<p>Hi</p><p>Hi</p>
<form:form action="message.html" commandName="memberForm" method="post">
<p>Hi</p>
<c:set var="saveFlag" value="${actionMessage}"></c:set>
<c:if test="${not empty saveFlag}">
   <div id="div3" style="width:975px; position:absolute;top:75px;left:261px;height:60px;display:none;background-color:Teal; text-align:center"><c:out value="${saveFlag}"></c:out></div>
</c:if>
</form:form>
</body> --%>

<body >
<c:set var="saveFlag" value="${actionMessage}"></c:set>
<form action="message.html" commandName="memberForm" method="post">


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
		<td>Member Nik Name</td>
		<td><c:out value="${memberForm.nikeName}"></c:out></td>
	</tr>
	<tr>
		<td>Member First Name</td>
		<td><c:out value="${memberForm.fName}"></c:out></td>
	</tr>
	<tr>
		<td>Member Last Name</td>
		<td><c:out value="${memberForm.lName}"></c:out></td>
	</tr>	
		<tr>
		<td>Member First Contact</td>
		<td><c:out value="${memberForm.firstContact}"></c:out></td>
	</tr>
		<tr>
		<td>Member Second Contact</td>
		<td><c:out value="${memberForm.secondContact}"></c:out></td>
	</tr>
	</tr>
		<tr>
		<td>Member Profession</td>
		<td><c:out value="${memberForm.profession}"></c:out></td>
	</tr>
	<tr>
		<td>Member Address</td>
		<td><c:out value="${memberForm.address}"></c:out></td>
	</tr>
	
   <tr>
   <td colspan="2">
  <!--  	<input id="sub" type="submit" class="btn btn-success"  value="Confirm1" onclick="return validMember(this)" /> -->
    <a class="btn btn-primary" href="${pageContext.request.contextPath}/displayMember.html" >OK</a>
   <!--  <a class="btn btn-primary" href="addMember.html">&nbsp;&nbsp;Back&nbsp;&nbsp;</a> -->
   </td>
   </tr>
   </table>
   
   
<!-- <a href="sprin:url value="//////"></a> -->


</form>

</body>
</html>