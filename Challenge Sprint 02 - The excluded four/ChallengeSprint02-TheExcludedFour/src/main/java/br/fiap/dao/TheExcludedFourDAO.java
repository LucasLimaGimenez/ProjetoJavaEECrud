package br.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.fiap.conexao.Conexao;
import br.fiap.entidades.TheExcludedFour;

public class TheExcludedFourDAO {
	
	private Connection connection;
	private PreparedStatement ps;
	private String sql;
	private ResultSet rs;
	
	public TheExcludedFourDAO() {
		connection = Conexao.conectar();
	}
	
	public void inserir(TheExcludedFour empresa) {
		sql = "insert into THE_EXCLUDED_FOUR(id_empresa,id_app,nm_empresa,cnpj,telefone) values(?,?,?,?,?)"; 
		
		try {
			ps = connection.prepareStatement(sql); 
			ps.setInt(1, empresa.getId_empresa() ); 
			ps.setInt(2, empresa.getId_app()); 
			ps.setString(3, empresa.getNm_empresa()); 
			ps.setString(4, empresa.getCnpj()); 
			ps.setInt(5, empresa.getTelefone());
			ps.execute(); 
		}catch(SQLException e) {
			System.out.println("Erro ao inserir no banco de dados \n"+ e);
		}
	}
	
	public boolean pesquisar(int id_empresa) {
		boolean aux = false;
		sql = "select * from THE_EXCLUDED_FOUR where id_empresa = ?";
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id_empresa);
			rs = ps.executeQuery(); 
			aux = rs.next();
		}catch(SQLException e) {
			System.out.println("Erro ao pesquisar aluno no banco de dados \n"+ e);
		}
		return aux;
	}
	
	public void alterar(TheExcludedFour empresa) {
		sql = "update THE_EXCLUDED_FOUR set id_app = ?, nm_empresa = ? , cnpj = ? , telefone = ?  where id_empresa = ?";
		
		try {
			ps = connection.prepareStatement(sql); 
			ps.setInt(1,empresa.getId_app());
			ps.setString(2,empresa.getNm_empresa());
			ps.setString(3,empresa.getCnpj());
			ps.setInt(4,empresa.getTelefone());
			ps.setInt(5, empresa.getId_empresa());
			ps.execute();
		}catch(SQLException e) {
			System.out.println("Erro ao atualizar dados no banco de dados \n"+ e);
		}
	}

}
