function myFunction1()
{
	var fname = document.getElementById("txtname");
	if(fname.value ==="")
	{
       	
	alert("enter first name");
	fname.focus();
        exit(0);	
	}
	else{
		fname.value=fname.value.toUpperCase();
	}
	
var funname = document.getElementById("name");
	if(funname.value ==="")
	{
       	
	alert("enter last name");
	funname.focus();
exit(0);        	
	}
	else{
		funname.value=funname.value.toUpperCase();
	}
	
var sname = document.getElementById("sname");
	if(sname.value ==="")
	{
       	
	alert("enter user name");
	sname.focus();
        	exit(0);
	}

var mon=document.getElementById("month");
	if(mon.value==="empty")
	{		
		alert("select month");
		mon.focus();
		exit(0);
	}


var day=document.getElementById("day");
	if(day.value==="empty")
	{		
		alert("select day");
		day.focus();
		exit(0);
	}

var year=document.getElementById("year");
	if(year.value==="empty")
	{		
		alert("select year");
		year.focus();
		exit(0);
	}






 //radio validation
                
      var radios = document.getElementsByName("gender");
      selected=false; 
     
       var i=0;

       while (!selected && i < radios.length) 
        {
        if (radios[i].checked)
          {
           selected = true;
          }
        i++;        
        }


         if (!selected) alert("Must select gender");
exit(0);


var cname = document.getElementById("cname");
	if(cname.value ==="")
	{
       	
	alert("enter country name");
	cname.focus();
        exit(0);	
	}
	
var ename = document.getElementById("ename");
	if(ename.value ==="")
	{
       	
	alert("enter e-mail id");
	ename.focus();
        exit(0);	
	}
	
	
var pswd = document.getElementById("pswd");
var cpswd = document.getElementById("cpswd");
	if(pswd.value !==cpswd.value)
	{
       	
	alert("password not matching");
	pswd.focus();
        exit(0);	
	}

var phnum= document.getElementById("pnum");
	if( phnum.value.length!==10)
	{
		alert("invalid phone number");
		phnum.focus();
exit(0);		
	}

var psw= document.getElementById("pswd");
	if(psw.value.length<6)
	{
		alert("invalid length of password");
		psw.focus();
exit(0);		
	}
	
var chk=document.getElementById("chck");
	if(chk.checked){}
	else
	{
		alert("Accept terms and conditions");
		chk.focus();
exit(0);		
	}


}
function myFunction2()
{exit(0);}