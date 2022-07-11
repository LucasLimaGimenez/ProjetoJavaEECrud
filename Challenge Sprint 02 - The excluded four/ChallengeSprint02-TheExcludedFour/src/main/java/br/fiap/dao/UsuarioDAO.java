package br.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.fiap.conexao.Conexao;
import br.fiap.entidades.Usuario;

public class UsuarioDAO {
	
	private Connection connection;
	private PreparedStatement ps;
	private String sql;
	private ResultSet rs;
	
	public UsuarioDAO() {
		connection = Conexao.conectar();
	}
	
	public void inserir(Usuario usuario) {
		sql = "insert into usuario (id_app,id_usuario,nm_usuario,nr_celular,cpf,sexo,grau_deficiencia_visual) values(?,?,?,?,?,?,?)"; 
		
		try {
			ps = connection.prepareStatement(sql); 
			ps.setInt(1, usuario.getId_app()); 
			ps.setInt(2, usuario.getId_usuario()); 
			ps.setString(3, usuario.getNm_usuario()); 
			ps.setInt(4, usuario.getNr_celular()); 
			ps.setString(5, usuario.getCpf());
			ps.setString(6, usuario.getSexo());
			ps.setInt(7, usuario.getGrau_deficiencia_visual());	
			ps.execute(); 
		}catch(SQLException e) {
			System.out.println("Erro ao inserir no banco de dados \n"+ e);
		}
	}
	
	public boolean pesquisar(int id_usuario) {
		boolean aux = false;
		
		sql = "select * from usuario where id_usuario = ?";
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id_usuario);
			rs = ps.executeQuery(); 
			aux = rs.next();
		}catch(SQLException e) {
			System.out.println("Erro ao pesquisar aluno no banco de dados \n"+ e);
		}
		return aux;
	}
	
	public void alterar(Usuario usuario) {
		sql = "update usuario set id_app = ?, nm_usuario = ? , nr_celular = ? , cpf = ? , sexo = ? , grau_deficiencia_visual = ? where id_usuario = ?";
		
		try {
			ps = connection.prepareStatement(sql); 
			ps.setInt(1, usuario.getId_app()); 
			ps.setString(2, usuario.getNm_usuario()); 
			ps.setInt(3, usuario.getNr_celular()); 
			ps.setString(4, usuario.getCpf());
			ps.setString(5, usuario.getSexo());
			ps.setInt(6, usuario.getGrau_deficiencia_visual());	
			ps.setInt(7, usuario.getId_usuario()); 
			ps.execute();
		}catch(SQLException e) {
			System.out.println("Erro ao atualizar dados no banco de dados \n"+ e);
		}
	}

}
