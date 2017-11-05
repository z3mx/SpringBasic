<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div id="login">
  <form class="login">
	<div class="title_form">Login</div>
	<fieldset>
    	<legend>Ingrese Datos de Acceso</legend>
      <div>Username</div>
      <input id='username' name='username' type='text' placeholder='${usernamePh}' value=''/>
      <br />
      <br />
      <div>Password</div>
      <input id='password' name='password' type='password' placeholder='' value='${passwordPh}'/>
	  <br />
      <br />
      <button id="btnstart" name="btnstart">Start</button>
<!--       <a href="./login.d">hello</a> -->
    </fieldset>
</form>
</div>
<div id="ShConsola"></div>
<div id="Consola"></div>
</body>
</html>