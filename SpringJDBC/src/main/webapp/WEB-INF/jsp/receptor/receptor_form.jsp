<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Form</title>
</head>
<body>
	<spring:url value="/receptor/save" var="saveURL" />
	<form:form modelAttribute="receptorForm" method="POST" action="${saveURL}">
		<form:hidden path='idclientes' />
		<table>
			<tr>
				<td>razonsocial</td>
				<td><form:input path='razonsocial' /></td>
				<td>rfc</td>
				<td><form:input path='rfc' /></td>
				<td>estado</td>
				<td><form:input path='estado' /></td>
				<td>website</td>
				<td><form:input path='website' /></td>
				<td>telefonos</td>
				<td><form:input path='telefonos' /></td>
				<td>rfcEmpresa</td>
				<td><form:input path='rfcEmpresa' /></td>
				<td>tipo</td>
				<td><form:input path='tipo' /></td>
				<td>calle</td>
				<td><form:input path='calle' /></td>
				<td>numeroe</td>
				<td><form:input path='numeroe' /></td>
				<td>colonia</td>
				<td><form:input path='colonia' /></td>
				<td>municipio</td>
				<td><form:input path='municipio' /></td>
				<td>cp</td>
				<td><form:input path='cp' /></td>
				<td>email</td>
				<td><form:input path='email' /></td>
				<td>cc</td>
				<td><form:input path='cc' /></td>
				<td>numeroi</td>
				<td><form:input path='numeroi' /></td>
				<td>respresentantelegal</td>
				<td><form:input path='respresentantelegal' /></td>
				<td>regimenfiscal</td>
				<td><form:input path='regimenfiscal' /></td>
				<td>numctapago</td>
				<td><form:input path='numctapago' /></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">Save</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>