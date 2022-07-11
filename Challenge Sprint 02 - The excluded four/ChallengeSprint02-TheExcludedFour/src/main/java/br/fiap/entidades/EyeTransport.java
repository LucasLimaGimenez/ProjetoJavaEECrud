package br.fiap.entidades;

public class EyeTransport {
	
	private int id_app = 0;
	private String categoria;
	private String nm_app;
	private String versao;
	private double valor;
	
	public EyeTransport(int id_app, String categoria, String nm_app, String versao, double valor) {
		this.id_app = id_app;
		this.categoria = categoria;
		this.nm_app = nm_app;
		this.versao = versao;
		this.valor = valor;
	}

	public int getId_app() {
		return id_app;
	}

	public void setId_app(int id_app) {
		this.id_app = id_app;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNm_app() {
		return nm_app;
	}

	public void setNm_app(String nm_app) {
		this.nm_app = nm_app;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
