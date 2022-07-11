package br.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.fiap.conexao.Conexao;
import br.fiap.entidades.EyeTransport;
                 

public class EyeTransportDAO {
	
	private Connection connection;
	private PreparedStatement ps;
	private String sql;
	private ResultSet rs;
	
	public EyeTransportDAO() {
		connection = Conexao.conectar();
	}

	public void inserir(EyeTransport app) {
		sql = "insert into eye_transport(id_app,categoria,nm_app,versao,valor) values(?,?,?,?,?)"; 
		try {
			ps = connection.prepareStatement(sql); 
			ps.setInt(1, app.getId_app() ); 
			ps.setString(2, app.getCategoria()); 
			ps.setString(3, app.getNm_app()); 
			ps.setString(4, app.getVersao()); 
			ps.setDouble(5, app.getValor());
			ps.execute(); 
		}catch(SQLException e) {
			System.out.println("Erro ao inserir no banco de dados \n"+ e);
		}
	}
	
	public boolean pesquisar(int id_app) {
		boolean aux = false;
		sql = "select * from eye_transport where id_app = ?";
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id_app);
			rs = ps.executeQuery(); 
			aux = rs.next();
		}catch(SQLException e) {
			System.out.println("Erro ao pesquisar aluno no banco de dados \n"+ e);
		}
		return aux;
	}
	
	public void alterar (EyeTransport app) {
		sql = "update eye_transport set categoria = ?, nm_app = ? , versao = ? , valor = ?  where id_app = ?";
		
		try {
			ps = connection.prepareStatement(sql); 
			ps.setString(1,app.getCategoria());
			ps.setString(2,app.getNm_app());
			ps.setString(3,app.getVersao());
			ps.setDouble(4,app.getValor());
			ps.setInt(5, app.getId_app());
			ps.execute();
		}catch(SQLException e) {
			System.out.println("Erro ao atualizar dados no banco de dados \n"+ e);
		}
	}
	
	

}
