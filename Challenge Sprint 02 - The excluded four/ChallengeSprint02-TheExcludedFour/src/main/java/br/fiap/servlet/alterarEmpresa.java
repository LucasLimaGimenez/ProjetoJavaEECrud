package br.fiap.servlet;

import static java.lang.Integer.parseInt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.dao.TheExcludedFourDAO;
import br.fiap.entidades.TheExcludedFour;

/**
 * Servlet implementation class alterarEmpresa
 */
@WebServlet("/alterarEmpresa")
public class alterarEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id_empresa = parseInt(request.getParameter("id_empresa"));
		int id_app = parseInt(request.getParameter("id_app"));
		String nm_empresa = request.getParameter("nm_empresa");
		String cnpj = request.getParameter("cnpj");
		int telefone = parseInt(request.getParameter("telefone"));
		
		TheExcludedFourDAO dao = new TheExcludedFourDAO();
		dao.alterar(new TheExcludedFour(id_empresa, id_app, nm_empresa, cnpj,telefone));
		
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
				+ "<h1 class=\"titulo-pagina\">Dados alterados com sucesso na base de dados !</h1>"
				+ "<div class=\"centralizando\">"
				+ "<p class=\"texto-box\">"
				+ "<a href=\"alterar.html\" class=\"link-container\">Voltar</a>"
				+ "</p>"
				+ "</div>");
	}
		
	}


