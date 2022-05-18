<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkServletEmpresa"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<c:import url="logout-parcial.jsp" />
		<form action="${linkServletEmpresa}?acao=AlteraEmpresa&id=${empresa.id}" method="post">
			<label for="nome">Nome:</label>
			<input type="text" name="nome" id="nome" value="${empresa.nome}">
			<label for="data">Data Abertura:</label>
			<input type="text" name="data" id="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>">
			<button type="submit">Salvar</button>
		</form>
	</body>
</html>