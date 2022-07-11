<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ChallengeSprint02 - The Excluded Four</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

	<%
		String usuario = (String) session.getAttribute("usuario");
		if(usuario == null){
			response.sendRedirect("login.jsp");
		}
	%>

	<header class="cabecalho">
		<h1 class="titulo-cabecalho">Challenge Sprint 02 - CRUD WEB</h1>
		<h1 class="subtitulo">The Excluded Four</h1>
	</header>

	<main>

		<h1 class="titulo-pagina">Selecione uma opção!</h1>

		<div class="container">

			<div class="container-padrao">
				<h1 class="titulo-container">Cadastrar dados</h1>
				<img class="imagem" src="cadastro.png"
					alt="Papel e lapis com fundo azul">
				<p class="texto-container">Selecione essa opção caso deseja
					cadastrar na base de dados.</p>
				<p class="texto-box">
					<a href="cadastrar.html" class="link-container">Cadastrar</a>
				</p>


			</div>

			<div class="container-padrao">
				<h1 class="titulo-container">Pesquisar dados</h1>
				<img class="imagem" src="pesquisar.png" alt="Lupa com fundo azul">
				<p class="texto-container">Selecione essa opção caso deseja
					pesquisar na base de dados.</p>
				<p class="texto-box">
					<a href="pesquisar.html" class="link-container">Pesquisar</a>
				</p>
			</div>

			<div class="container-padrao">
				<h1 class="titulo-container">Alterar dados</h1>
				<img class="imagem" src="alterar.png" alt="lapis com fundo azul">
				<p class="texto-container">Selecione essa opção caso deseja
					alterar na base de dados.</p>
				<p class="texto-box">
					<a href="alterar.html" class="link-container">Alterar</a>
				</p>
			</div>


		</div>
		
		<div class="centralizando">
		<p class="texto-box">
			<a href="deslogar.jsp" class="link-container">Deslogar</a>
		</p>


	</main>

</body>
</html>