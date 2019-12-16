<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todos os Tickets de Suporte</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<style type="text/css">
tr:first-child {
	font-weignt: bold;
	background-color: #c6c9c4
}
</style>
</head>
<body>
	<div class="container">
		<h2>Todos os Tickets de Suporte Registrados</h2>
		<c:if test="${not empty success}">
			<div class="alert alert-success" role="alert">${success}</div>
		</c:if>

		<hr />
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<td>Suporte ID</td>
					<td>Empresa</td>
					<td>Usuário</td>
					<td>Telefone</td>
					<td>Classificação</td>
					<td>Alterar</td>
					<td>Remover</td>
				</tr>
				<c:forEach items="${allsupports}" var="support">
					<tr>
						<td>${support.id}</td>						
						<td>${support.company}</td>
						<td>${support.user}</td>
						<td>${support.phone}</td>
						<td>${support.classification}</td>
						<td><a href="<c:url value='/edit-${support.id}' />">Alterar</a></td>
						<td><a href="<c:url value='/delete-${support.id}' />">Remover</a></td>
					</tr>
				</c:forEach>
		</table>
		<hr />
		<div class="form-group">
			<a class="btn btn-secondary" href="<c:url value='/new' />">Adicionar Novo Suporte</a>
		</div>
	</div>
</body>
</html>