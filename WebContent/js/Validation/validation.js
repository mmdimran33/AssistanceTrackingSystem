function validation(frm){
	
	//set styles to error measaage
	document.getElementById("nameErr").innerHTML="";
	document.getElementById("pasErr").innerHTML="";
	document.getElementById("nameErr").style="color:red";
	document.getElementById("pasErr").style="color:red";
	//read form data
	var name=frm.pname.value;
	var paswd=frm.pasErr.value;
	//perform client side validation
	if(name=="")
		{
		alert()
		document.getElementById("nameErr").inner.HTML="Person name is mandatory";
		frm.pname.focus();
		return false;
			}//if
	if(paswd=""){
		document.getElementById("pasErr").innerHTML="password is mandatory";
		frm.page.focus();
		return false;
	}//if
	else
		{
		if(isNan(paswd)){
			document.getElementById("pasErr").innerHTML="Password must be numeric value ";
			frm.page.focus();
			frm.page.value="";
			return false;
		}//if
		}//else
	return true;
	}//
