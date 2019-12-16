<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar Novo Ticket de Suporte</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>
	<div class="container">
		<h2>Formulário de Suporte</h2>

		<c:if test="${not empty error}">
			<div class="alert alert-danger" role="alert">${error}</div>
		</c:if>
		<hr />
		<form:form method="POST" modelAttribute="support"
			cssClass="form-horizontal">
			<form:input type="hidden" path="id" id="id" />

			<div class="form-group">
				<label for="company">Empresa</label>
				<form:input path="company" id="company" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="user">Usuário</label>
				<form:input path="user" id="user" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="phone">Telefone</label>
				<form:input path="phone" id="phone" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="email">Email</label>
				<form:input path="email" id="email" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="classification">Classificação</label>
				<form:input path="classification" id="classification"
					cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="description">Descrição</label>
				<form:input path="description" id="description"
					cssClass="form-control" rows="5" />
			</div>

			<div class="form-group">
				<label for="anyDesk">AnyDesk</label>
				<form:input path="anyDesk" id="anyDesk" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="answered">Respondido</label>
				<form:input path="answered" id="answered" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="suppportAttendant">Atendente Suporte</label>
				<form:input path="supportAttendant" id="supportAttendant"
					cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="result">Retorno</label>
				<form:input path="result" id="result" cssClass="form-control"
					 rows="5" />
			</div>

			<hr />
			<c:choose>
				<c:when test="${edit}">
					<button type="submit" class="btn btn-primary">Atualizar</button>
				</c:when>
				<c:otherwise>
					<button type="submit" class="btn btn-primary">Salvar</button>
				</c:otherwise>
			</c:choose>

			<a class="btn btn-secondary" href="<c:url value='/list' />">Listar
				todos os Tickets</a>
				
			<a class="btn btn-secondary"
				href="<c:url value='http://www.psiinformatica.inf.br/Atualiza.PSi/AnyDesk.exe' />">Download
				do Aplicativo de Suporte</a>

		</form:form>
	</div>
</body>
</html>