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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Deliever Payments</title>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Add Deliever Payments</title>
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
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
  
  <style>.card-registers {
    max-width: 40rem;
    top:-22px;
}
.btn-primarys {
    color: #fff;
    background-color: #007bff;
    border-color: #007bff;
    margin-left: 20px;
}

</style>
</head>
<body>
  <div class="container">
    <div class="card card-registers mx-auto mt-5">
      <div class="card-header">Add Deliver</div>
      <div class="card-body">
       <form:form action="deliver1.html" method="post" commandName="deliverPaymentsForm">
       <div class="form-group">
      <div class="form-row">
       <div class="col-md-6"><label for="NeedyID">Needy ID</label>
                <form:select path="needyID" class="form-control" id="needyID" type="text"  aria-describedby="NeedyID">
              <form:option value="" label="Select Needy ID"></form:option>
              <form:options items="${needyIdList}"/> 
                </form:select>
                </div>
              </div>
              </div>
           <div class="form-group">
         <div class="form-row">
 	<div class="col-md-6"><label for="DeliverName">Name</label>
     <form:input path="delieverName" class="form-control" id="delieverName" type="text" aria-describedby="Name" placeholder="Name"/></div>
    <div class="col-md-6"><label for="DelieverNoOftimepaid">No.of time paid</label>
    <form:input path="delieverNoOfTimePaid" class="form-control" id="delieverNoOfTimePaid" type="text" aria-describedby="No of time paid" placeholder="No of time paid"/></div>
</div>
</div>              
       <div class="form-group">
      <div class="form-row">
       <div class="col-md-6"><label for="DelieverAmount">Amount</label>
                <form:input path="delieverAmount" class="form-control" id="delieverAmount" type="text"  aria-describedby="Amount" placeholder="Amount"/></div>
              </div>
              </div>
		  <div class="form-group">
		  <div class="form-row">
	      <input type="submit" value="Save" class="btn btn-success">
	      <input type="submit" value="Cancle" class="btn btn-primarys">
		  </div>
		  </div>
         </form:form>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
   <c:set var="saveFlag" value="${actionMessage}"></c:set>
<c:if test="${not empty saveFlag}">
   <div id="div3" style="width:975px; position:absolute;top:75px;left:261px;height:60px;display:none;background-color:Teal; text-align:center"><c:out value="${saveFlag}"></c:out></div>
</c:if>
</body>
</html>