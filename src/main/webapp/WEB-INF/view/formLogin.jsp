<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkServletEmpresa"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="${linkServletEmpresa}?acao=Login" method="post">
			<label for="login">Login:</label>
			<input type="text" name="login" id="login">
			<br>
			<label for="senha">Senha:</label>
			<input type="password" name="senha" id="senha">
			<br>
			<button type="submit">Entrar</button>
		</form>
	</body>
</html>