package br.fiap.servlet;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.dao.EyeTransportDAO;

/**
 * Servlet implementation class pesquisarAplicativo
 */
@WebServlet("/pesquisarAplicativo")
public class pesquisarAplicativo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id_app = parseInt(request.getParameter("id_app"));

		EyeTransportDAO dao = new EyeTransportDAO();
		PrintWriter out = response.getWriter();

		if (dao.pesquisar(id_app)) {
			out.println("<html>" + "<head>" + "<title>ChallengeSprint02 - The Excluded Four</title>"
					+ "<link rel='stylesheet' type='text/css' href='style.css'>" + "</head>" + "<body>"
					+ "<header class='cabecalho'>" + "<h1 class='titulo-cabecalho'>Challenge Sprint 02 - CRUD WEB</h1>"
					+ "<h1 class='subtitulo'>The Excluded Four</h1>" + "</header>"
					+ "<h1 class=\"titulo-pagina\">Aplicativo possui cadastro!</h1>" + "<div class=\"centralizando\">"
					+ "<p class=\"texto-box\">" + "<a href=\"pesquisar.html\" class=\"link-container\">Voltar</a>"
					+ "</p>" + "</div>");
		} else {
			out.println("<html>" + "<head>" + "<title>ChallengeSprint02 - The Excluded Four</title>"
					+ "<link rel='stylesheet' type='text/css' href='style.css'>" + "</head>" + "<body>"
					+ "<header class='cabecalho'>" + "<h1 class='titulo-cabecalho'>Challenge Sprint 02 - CRUD WEB</h1>"
					+ "<h1 class='subtitulo'>The Excluded Four</h1>" + "</header>"
					+ "<h1 class=\"titulo-pagina\">Aplicativo n?o possui cadastro!</h1>"
					+ "<div class=\"centralizando\">" + "<p class=\"texto-box\">"
					+ "<a href=\"pesquisar.html\" class=\"link-container\">Voltar</a>" + "</p>" + "</div>");
		}

	}

}
