<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>AppApolice</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">App de Gestão de Apolice</a></li>
				<li class="nav-item"><a class="nav-link" href="/seguradora/listagem">Seguradora</a></li>
				<li class="nav-item"><a class="nav-link" href="/apolice/listagem">Apólice</a></li>
				<li class="nav-item"><a class="nav-link" href="/apoliceAuto/listagem">Apólice de Automovel</a></li>
				<li class="nav-item"><a class="nav-link" href="/apoliceVida/listagem">Apólice de Vida</a></li>
			</ul>
		</div>
	</nav>

	<div class="container mt-3">

		<span class="badge rounded-pill bg-primary">Seguradora:
			${qtdeSegurado}</span> <span class="badge rounded-pill bg-secondary">Apólice:
			${qtdeApolice}</span> <span class="badge rounded-pill bg-success">Apólice de Automovel:
			${qtdeApoliceAuto}</span> <span class="badge rounded-pill bg-danger">Apólice de Vida:
			${qtdeApoliceVida}</span>

		<c:if test="${not empty listagem}">
			<h2>AppVenda</h2>
			<p>GestÃ£o de vendas de Apólice:</p>
			<table class="table">
				<thead class="table-dark">
					<tr>
						<th>${titulo}</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${listagem}">
						<tr>
							<td>${item}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty listagem}">
			<div class="container mt-5">
		        <div class="card mx-auto" style="width: 18rem;">
		            <img src="https://www.learntek.org/blog/wp-content/uploads/2018/05/java2.jpg" class="card-img-top" alt="Foto do Desenvolvedor">
		            <div class="card-body">
		                <h5 class="card-title">JONES</h5>
		                <p class="card-text"><strong>Telefone:</strong> (21) 999999-2222</p>
		                <p class="card-text">Futuro Desenvolvedor</p>
		                <a href="https://github.com/JonesAugusto1989/GestaoApolice/" class="btn btn-primary">GitHub do Projeto</a>
		                <a href="https://www.linkedin.com/in/jones-augusto-santos-da-silva-paranhos-b79816100/" class="btn btn-secondary">LinkedIn</a>
		            </div>
		        </div>
		    </div>
	    </c:if>
		
	</div>
    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.min.js"></script>		
</body>
</html>