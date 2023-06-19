<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SB Admin - Start Bootstrap Template</title>
  <!-- Bootstrap core CSS-->
 <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.min.css" type="text/css">
<!--  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.css" type="text/css">-->
  <!-- Custom fonts for this template-->	
  <link href="${pageContext.servletContext.contextPath}/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="${pageContext.servletContext.contextPath}/css/sb-admin.css" rel="stylesheet" type="text/css">



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Assistance Home</title>
<style>
	.login-form {
		width: 340px;
    	margin: 50px auto;
		margin-right:40px;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
		 
    }
    .login-form h2 {
        margin: 0 0 15px;
     }
</style>
 </head>
<body class="bg-dark">
 <div class="login-form">
     <form action="/index1" method="post" action="displayDashBorad1.html"> 
     <c:forEach var="dashBoardListObj" items="${dashBoardList}">
         <div class="form-group"><label for="exampleInputName">Receive</label> 
        <input type="text" class="form-control" name="recievedAmount" id="recievedAmount" value="${dashBoardListObj[0]}" readonly="readonly"> 
        </div>
       <div class="form-group"><label for="exampleInputName">Deliver</label>
        <input type="text" class="form-control" name="deliveredAmount" id="deliveredAmount" value="${dashBoardListObj[1]}" readonly="readonly">
        </div>
        <div class="form-group"><label for="exampleInputName">In Hand</label>
            <input type="text" class="form-control" name="inHandAmount" id="inHandAmount" readonly="readonly">  
        </div>
        <script>
        var recieveAmount=document.getElementById("recievedAmount").value;
        var deliverAmount=document.getElementById("deliveredAmount").value;
        document.getElementById("inHandAmount").value=parseFloat(recieveAmount)- parseFloat(deliverAmount);
        </script>
      </c:forEach>
    </form> 
</div>
  </body>
</html>