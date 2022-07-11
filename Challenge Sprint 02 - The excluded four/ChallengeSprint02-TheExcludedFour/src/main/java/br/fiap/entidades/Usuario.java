package br.fiap.entidades;

public class Usuario {
	
	private int id_app;
	private int id_usuario;
	private String nm_usuario;
	private int nr_celular;
	private String cpf;
	private String sexo;
	private int grau_deficiencia_visual;
	
	public Usuario(int id_app, int id_usuario, String nm_usuario, int nr_celular, String cpf, String sexo,int grau_deficiencia_visual) {
		this.id_app = id_app;
		this.id_usuario = id_usuario;
		this.nm_usuario = nm_usuario;
		this.nr_celular = nr_celular;
		this.cpf = cpf;
		this.sexo = sexo;
		this.grau_deficiencia_visual = grau_deficiencia_visual;
	}

	public int getId_app() {
		return id_app;
	}

	public void setId_app(int id_app) {
		this.id_app = id_app;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public int getNr_celular() {
		return nr_celular;
	}

	public void setNr_celular(int nr_celular) {
		this.nr_celular = nr_celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getGrau_deficiencia_visual() {
		return grau_deficiencia_visual;
	}

	public void setGrau_deficiencia_visual(int grau_deficiencia_visual) {
		this.grau_deficiencia_visual = grau_deficiencia_visual;
	}

}
