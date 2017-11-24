<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
</head>
<body>
<spring:url value="/receptor/add" var="addURL" />
<a href="${addURL}">Agregar Receptor</a>
	<h1>Lista Receptores</h1>
	<table border="1" width="100%">
		<tr>
			<th>idclientes</th>
			<th>razonsocial</th>
			<th>rfc</th>
			<th>estado</th>
			<th>website</th>
			<th>telefonos</th>
			<th>rfcEmpresa</th>
			<th>tipo</th>
			<th>calle</th>
			<th>numeroe</th>
			<th>colonia</th>
			<th>municipio</th>
			<th>cp</th>
			<th>email</th>
			<th>cc</th>
			<th>numeroi</th>
			<th>respresentantelegal</th>
			<th>regimenfiscal</th>
			<th>numctapago</th>
			<th colspan="2">Actions</th>
		</tr>
		<c:forEach items="${listReceptor}" var="receptor">
			<tr>
				<td>${receptor.idclientes}</td>
				<td>${receptor.razonsocial}</td>
				<td>${receptor.rfc}</td>
				<td>${receptor.estado}</td>
				<td>${receptor.website}</td>
				<td>${receptor.telefonos}</td>
				<td>${receptor.rfcEmpresa}</td>
				<td>${receptor.tipo}</td>
				<td>${receptor.calle}</td>
				<td>${receptor.numeroe}</td>
				<td>${receptor.colonia}</td>
				<td>${receptor.municipio}</td>
				<td>${receptor.cp}</td>
				<td>${receptor.email}</td>
				<td>${receptor.cc}</td>
				<td>${receptor.numeroi}</td>
				<td>${receptor.respresentantelegal}</td>
				<td>${receptor.regimenfiscal}</td>
				<td>${receptor.numctapago}</td>
				<td>
					<spring:url value="/update/${receptor.idclientes}" var="updateUrl" />
					<a href="${updateUrl}">Update</a>
				</td>
				<td>
					<spring:url value="/delete/${receptor.idclientes}" var="deleteUrl" />
					<a href="${deleteUrl}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>