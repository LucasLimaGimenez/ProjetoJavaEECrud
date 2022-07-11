package br.fiap.servlet;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.dao.EyeTransportDAO;
import br.fiap.entidades.EyeTransport;

/**
 * Servlet implementation class alterarAplicativo
 */
@WebServlet("/alterarAplicativo")
public class alterarAplicativo extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id_app = parseInt(request.getParameter("id_app"));
		String nm_app = request.getParameter("nm_app");
		String categoria = request.getParameter("categoria");
		String versao = request.getParameter("versao");
		double valor = parseDouble(request.getParameter("valor"));
		
		EyeTransportDAO dao = new EyeTransportDAO();
		dao.alterar(new EyeTransport(id_app, categoria, nm_app, versao, valor));
		
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
