<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <%@include file="menu.jsp"%>
    <%@include file="layout.jsp"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Receiver</title>
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
    top:30px;
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
    <div class="card card-registers mx-auto mt-5" style="margin-top: 0rem!important">
      <div class="card-header">Add Receiver</div>
      <div class="card-body">
        <!--<form>-->
        <form:form method="post"  action="addReciever1.html" commandName="recieverForm">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName">NickName</label> 
               <form:select path="nickName" class="form-control" id="nickName" type="text"  aria-describedby="nickName">
                <form:option value="" label="Select Nick Name"></form:option>
                 <form:options items="${nickNameList}"/> 
               </form:select>
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">Amount</label>
              <form:input path="amount" class="form-control" id="exampleInputLastName" type="text" aria-describedby="Amount" placeholder="Amount"/>
              </div>
            </div>
          </div>
          	 <div class="form-group">
		  		<div class="form-row">
	               <div class="col-md-6">
	                <label for="exampleConfirmPassword">Date</label>
	                <!--  <input class="form-control" id="exampleConfirmPassword" type="Date" placeholder="Date">-->
	                <form:input path="createdDate" class="form-control" id="exampleConfirmPassword" type="Date" placeholder="Date"/> 
	              </div>
             </div> 
          </div>
		  <div class="form-group">
		  <div class="form-row">
          <!--   <button type="button" class="btn btn-success">Save</button>
		  <button type="button" class="btn btn-primary">Cancel</button>-->
	      <input type="submit" value="Save" class="btn btn-success">
	      <a class="btn btn-primary" href="${pageContext.request.contextPath}/displayReciever.html">Cancel</a>
<!-- 	      <input type="submit" value="Cancle" class="btn btn-primarys"> -->
		  </div>
		  </div>
       <!--  </form> -->
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
