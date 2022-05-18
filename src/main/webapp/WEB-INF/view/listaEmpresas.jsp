<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"%>
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
	<h1>Bem-vindo ${usuarioLogado.login }</h1><c:import url="logout-parcial.jsp" />
	<c:if test="${not empty empresa}">
		<p>Empresa ${empresa} cadastrada com sucesso</p>
	</c:if>
	<h2>Lista de Empresas:</h2>	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="${linkServletEmpresa}?acao=MostraDetalhesEmpresa&id=${empresa.id}">Editar</a> |
				<a href="${linkServletEmpresa}?acao=RemoveEmpresa&id=${empresa.id}">Remover</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>