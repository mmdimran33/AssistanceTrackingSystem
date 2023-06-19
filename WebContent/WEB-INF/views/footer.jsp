<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <meta charset="utf-8">
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Assistance Track System</title>
  <!-- Bootstrap core CSS-->
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.min.css" type="text/css">
<!--  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap/bootstrap.css" type="text/css">-->
  <!-- Custom fonts for this template-->	
  <link href="${pageContext.servletContext.contextPath}/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="${pageContext.servletContext.contextPath}/css/sb-admin.css" rel="stylesheet" type="text/css">
</head>
<body>
     <footer class="sticky-footer">
      <div class="container">
        <div class="text-center">
          <small>Powered by Assistance Track</small>
        </div>
      </div>
    </footer>
	 <!-- Bootstrap core JavaScript-->
    <script src="<%=request.getContextPath()%>/js/jquery.min.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/js/boostrapjs/bootstrap.bundle.min.js" type="text/javascript"></script>
    <!-- Core plugin JavaScript-->
    <script src="<%=request.getContextPath()%>/js/jquery.easing.min.js" type="text/javascript"></script>
    <!-- Custom scripts for all pages-->
    <script src="<%=request.getContextPath()%>/js/sb-admin.min.js" type="text/javascript"></script>
    <!-- Custom scripts for this page-->
    <!-- Toggle between fixed and static navbar-->
    <script>
    $('#toggleNavPosition').click(function() {
      $('body').toggleClass('fixed-nav');
      $('nav').toggleClass('fixed-top static-top');
    });
    </script>
    <!-- Toggle between dark and light navbar-->
    <script>
    $('#toggleNavColor').click(function() {
      $('nav').toggleClass('navbar-dark navbar-light');
      $('nav').toggleClass('bg-dark bg-light');
      $('body').toggleClass('bg-dark bg-light');
    });
    </script>
</body>
</html>