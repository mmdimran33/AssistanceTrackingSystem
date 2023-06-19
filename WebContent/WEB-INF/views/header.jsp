<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 

 
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap1.min.css" />
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap.css" />
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/fullcalendar.css" />
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/matrix-style.css" />
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/matrix-media.css" />
<link href="${pageContext.servletContext.contextPath}font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" href="css/jquery.gritter.css" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

 
 
 <div id="header">
  <h1><a href="dashboard.html">Assistant Tracking System </a></h1>
</div>
<!--close-Header-part--> 


<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
        <li><a href="#"><i class="icon-user"></i><%="Current Login::"+session.getAttribute("creationTime")%></a></li>
        <li class="divider"></li>
        <li><a href="#"><i class="icon-check"></i><%="User::"+session.getAttribute("uName")%></a></li>
        <li class="divider"></li>
        <li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
    </li>
    <li class=""><a title="" href="#"><i class="icon icon-cog"></i><span class="text"><%="Last Login::"+session.getAttribute("lastAccessTime")%></span></a></li>
</div>
 <!-- Navigation--
   <nav class="navbar navbar-expand-lg navbar-dark bg-darks fixed-top" id="mainNav">
    <a class="navbar-brand" href="#">Assistant Track</a>
       <ul class="navbar-nav sidenav-toggler">
        <li class="nav-item">
          
        </li>
      </ul>
      <ul class="navbar-nav ml-auto">
           <div class="dropdown-menu" aria-labelledby="alertsDropdown">
                <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
           
            <div class="dropdown-divider"></div>
            <a class="dropdown-item small" href="#">View all alerts</a>
          </div>
        </li>
        <li class="nav-item">
          <form class="form-inline my-2 my-lg-0 mr-lg-2">
         <div class="input-group">
                 </button>
              </span>
              
            </div>
          </form>
        </li>
       <!--  <li class="nav-item">
          <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
            <i class="fa fa-fw fa-sign-out"></i>Logout</a>
        </li>--> 
        
      </ul>
     </nav>
    </body>
    
 
	
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

</form>
</body>
</html>