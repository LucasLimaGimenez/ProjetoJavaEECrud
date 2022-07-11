<%@page import="javax.websocket.Session"%>
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

	<header class="cabecalho">
		<h1 class="titulo-cabecalho">Challenge Sprint 02 - CRUD WEB</h1>
		<h1 class="subtitulo">The Excluded Four</h1>
	</header>

	<main>

		<h1 class="titulo-pagina">Tela de login</h1>

		<form class="formulario" action="login.jsp" method="post">
		<div class="dados">
            <label for="usuario">Usuário:</label>
            <input type="text" class="input-text" id="usuario" name="usuario" placeholder="Digite o nome de usuário">
        </div>
        
        <div class="dados">
            <label for="senha">Senha:</label>
            <input type="password" class="input-text" id="senha" name="senha" placeholder="Digite a senha do usuário">
        </div>
        
        <input type="submit" class="input-enviar" value="Logar">
		
		</form>
		
		<%
			String usuario = request.getParameter("usuario");
			String senha = request.getParameter("senha");
			
			if(usuario!=null && senha!=null && !usuario.isEmpty() && !senha.isEmpty()){
				if(usuario.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("1234")){
				session.setAttribute("usuario", usuario);
				response.sendRedirect("index.jsp");
				}else{
					response.sendRedirect("login.jsp");
				}
			}
		%>
		


	</main>

</body>
</html>