package br.fiap.servlet;

import static java.lang.Integer.parseInt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.dao.UsuarioDAO;
import br.fiap.entidades.Usuario;

/**
 * Servlet implementation class cadastrarUsuario
 */
@WebServlet("/cadastrarUsuario")
public class cadastrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id_app = parseInt(request.getParameter("id_app"));
		int id_usuario = parseInt(request.getParameter("id_usuario"));
		String nm_usuario = request.getParameter("nm_usuario");
		int nr_celular = parseInt(request.getParameter("nr_celular"));
		String cpf = request.getParameter("cpf");
		String sexo = request.getParameter("sexo");
		int grau_deficiencia_visual = parseInt(request.getParameter("grau_deficiencia_visual"));
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.inserir(new Usuario(id_app,id_usuario ,nm_usuario,nr_celular, cpf,sexo, grau_deficiencia_visual));
		
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<head>"
				+ "<title>ChallengeSprint02 - The Excluded Four</title>"
				+ "<link rel='stylesheet' type='text/css' href='style.css'>"
				+ "</head>"
				+ "<body>"
				+ "<header class='cabecalho'>"
				+ "<h1 class='titulo-cabecalho'>Challenge Sprint 02 - CRUD WEB</h1>"
				+ "<h1 class='subtitulo'>The Excluded Four</h1>"
				+ "</header>"
				+ "<h1 class=\"titulo-pagina\">Dados cadastrados com sucesso na base de dados !</h1>"
				+ "<div class=\"centralizando\">"
				+ "<p class=\"texto-box\">"
				+ "<a href=\"cadastrar.html\" class=\"link-container\">Voltar</a>"
				+ "</p>"
				+ "</div>");
	}
	
}


