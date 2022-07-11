package br.fiap.servlet;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.dao.TheExcludedFourDAO;

/**
 * Servlet implementation class pesquisarEmpresa
 */
@WebServlet("/pesquisarEmpresa")
public class pesquisarEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id_empresa = parseInt(request.getParameter("id_empresa"));
		TheExcludedFourDAO dao = new TheExcludedFourDAO();
		PrintWriter out = response.getWriter();

		if (dao.pesquisar(id_empresa)) {
			out.println("<html>" + "<head>" + "<title>ChallengeSprint02 - The Excluded Four</title>"
					+ "<link rel='stylesheet' type='text/css' href='style.css'>" + "</head>" + "<body>"
					+ "<header class='cabecalho'>" + "<h1 class='titulo-cabecalho'>Challenge Sprint 02 - CRUD WEB</h1>"
					+ "<h1 class='subtitulo'>The Excluded Four</h1>" + "</header>"
					+ "<h1 class=\"titulo-pagina\">Empresa possui cadastro!</h1>" + "<div class=\"centralizando\">"
					+ "<p class=\"texto-box\">" + "<a href=\"pesquisar.html\" class=\"link-container\">Voltar</a>"
					+ "</p>" + "</div>");
		} else {
			out.println("<html>" + "<head>" + "<title>ChallengeSprint02 - The Excluded Four</title>"
					+ "<link rel='stylesheet' type='text/css' href='style.css'>" + "</head>" + "<body>"
					+ "<header class='cabecalho'>" + "<h1 class='titulo-cabecalho'>Challenge Sprint 02 - CRUD WEB</h1>"
					+ "<h1 class='subtitulo'>The Excluded Four</h1>" + "</header>"
					+ "<h1 class=\"titulo-pagina\">Empresa não possui cadastro!</h1>"
					+ "<div class=\"centralizando\">" + "<p class=\"texto-box\">"
					+ "<a href=\"pesquisar.html\" class=\"link-container\">Voltar</a>" + "</p>" + "</div>");
		}
		
	}

}
