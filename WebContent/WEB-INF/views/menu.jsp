	<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	 <html>
	 <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap1.min.css"/>
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap.css" />
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/bootstrap-responsive.min.css" />
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/fullcalendar.css" />
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/matrix-style.css" />
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/matrix-media.css" />
	<link href="${pageContext.servletContext.contextPath}font-awesome/css/font-awesome.css" rel="stylesheet" />
	<link rel="stylesheet" href="css/jquery.gritter.css" />
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
	<script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>
<style>
.dropbtn {
  background-color: #3498DB;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

.dropbtn:hover, .dropbtn:focus {
  background-color: #2980B9;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  overflow: auto;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown a:hover {background-color: #ddd;}

.show {display: block;}
</style>
	</head>
<body>
<!-- <div id="sidebar">
<div>
<a href="index.html"><i class="icon icon-home"></i><span>Dashboard</span></a>
</div>
<div class="dropdown">
<button onclick="myFunction()" class="dropbtn">Master</button>
  <div id="myDropdown" class="dropdown-content">
    	<a href="displayMember.html"><i class="icon icon-inbox"></i> <span>Member</span></a>
     	<a href="displayNeedy.html"><i class="icon icon-inbox"></i> <span>Needy</span></a>
  </div>
  <div>
  <a href="displayReciever.html"><i class="icon icon-th"></i> <span>Receive</span></a>
  </div>
  <div>
     <a href="deliver.html"><i class="icon icon-fullscreen"></i> <span>Deliver</span></a>
  </div>

</div>

</div>  -->









	<div id="sidebar">
  <ul>
    <li class="active"><a href="index.html"><i class="icon icon-home"></i><span>Dashboard</span></a> </li>
    <li> <a href="displayMember.html"><i class="icon icon-inbox"></i> <span>Member</span></a> </li>
        <li> <a href="displayNeedy.html"><i class="icon icon-inbox"></i> <span>Needy</span></a> </li>
    <li><a href="displayReciever.html"><i class="icon icon-th"></i> <span>Receive</span></a></li>
    <li><a href="deliver.html"><i class="icon icon-fullscreen"></i> <span>Deliver</span></a></li>
    <li class="submenu"> <a href="report.html"><i class="icon icon-th-list"></i> <span>Report	</span> <span class="label label-important">3</span></a>
      <ul>
        <li><a href="#">Setting</a></li>
        <li><a href="#">Profiles</a></li>
        <li><a href="form-wizard.html">Form with Wizard</a></li>
      </ul>
    </li>
    <li><a href="yearlySettlement.html"><i class="icon icon-tint"></i> <span>Yearly Settlement</span></a></li>
    <li><a href="interface.html"><i class="icon icon-pencil"></i> <span>Eelements</span></a></li>
    <li class="submenu"> <a href="#"><i class="icon icon-file"></i> <span>Addons</span> <span class="label label-important">5</span></a>
      <ul>
        <li><a href="index2.html">Dashboard2</a></li>
        <li><a href="gallery.html">Gallery</a></li>
        <li><a href="calendar.html">Calendar</a></li>
        <li><a href="invoice.html">Invoice</a></li>
        <li><a href="chat.html">Chat option</a></li>
      </ul>
    </li>
    <li class="submenu"> <a href="#"><i class="icon icon-info-sign"></i> <span>Error</span> <span class="label label-important">4</span></a>
      <ul>
        <li><a href="error403.html">Error 403</a></li>
        <li><a href="error404.html">Error 404</a></li>
        <li><a href="error405.html">Error 405</a></li>
        <li><a href="error500.html">Error 500</a></li>
      </ul>
    </li>
     
  </ul>
</div>
<!--sidebar-menu-->

<!--main-container-part-->
 
<!--end-Footer-part-->

<script src="js/excanvas.min.js"></script> 
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.flot.min.js"></script> 
<script src="js/jquery.flot.resize.min.js"></script> 
<script src="js/jquery.peity.min.js"></script> 
<script src="js/fullcalendar.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.dashboard.js"></script> 
<script src="js/jquery.gritter.min.js"></script> 
<script src="js/matrix.interface.js"></script> 
<script src="js/matrix.chat.js"></script> 
<script src="js/jquery.validate.js"></script> 
<script src="js/matrix.form_validation.js"></script> 
<script src="js/jquery.wizard.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/matrix.popover.js"></script> 
<script src="js/jquery.dataTables.min.js"></script> 
<script src="js/matrix.tables.js"></script> 

<script type="text/javascript">
  // This function is called from the pop-up menus to transfer to
  // a different page. Ignore if the value returned is a null string:
  function goPage (newURL) {

      // if url is empty, skip the menu dividers and reset the menu selection to default
      if (newURL != "") {
      
          // if url is "-", it is this page -- reset the menu:
          if (newURL == "-" ) {
              resetMenu();            
          } 
          // else, send page to designated URL            
          else {  
            document.location.href = newURL;
          }
      }
  }

// resets the menu selection upon entry to this page:
function resetMenu() {
   document.gomenu.selector.selectedIndex = 2;
}
</script>
</body>
</html>
