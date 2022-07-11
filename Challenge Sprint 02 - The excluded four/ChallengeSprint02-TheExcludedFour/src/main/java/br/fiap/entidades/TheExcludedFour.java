package br.fiap.entidades;

public class TheExcludedFour {
	
	private int id_empresa;
	private int id_app;
	private String nm_empresa;
	private String cnpj;
	private int telefone;
	
	public TheExcludedFour(int id_empresa, int id_app, String nm_empresa, String cnpj, int telefone) {
		this.id_empresa = id_empresa;
		this.id_app = id_app;
		this.nm_empresa = nm_empresa;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

	public int getId_app() {
		return id_app;
	}

	public void setId_app(int id_app) {
		this.id_app = id_app;
	}

	public String getNm_empresa() {
		return nm_empresa;
	}

	public void setNm_empresa(String nm_empresa) {
		this.nm_empresa = nm_empresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
