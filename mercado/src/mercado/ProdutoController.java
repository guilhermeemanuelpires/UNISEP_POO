package mercado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoController {
	
	ConexaoMySql conexaoMysql;
	
	public ProdutoController(ConexaoMySql conexaoMysql) {
		this.conexaoMysql = conexaoMysql;
	}
	
	// CONCEITO DO CRUD
	// C - CREATE - INSERT - OK  
	// R - READ - SELECT - OK 
	// U - UPDATE - UPDATE 
	// D - DELETE - DELETE
	
	public void listarProdutos() {
		String sql = "SELECT * FROM produto";
		
		try {
			
			Connection conn = this.conexaoMysql.conectar();
			PreparedStatement qry = conn.prepareStatement(sql);
			ResultSet dados = qry.executeQuery();
			
			while(dados.next()) {
		
				System.out.println(
						dados.getInt("ID") + " | " +
						dados.getString("NOME") + " | " +
						dados.getDouble("PRECO"));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(""
					+ "Erro ao consultar dados do banco de dados");
			
		}
		
	}
	

	public void cadastrarProduto(Produto produto) {
		
		String sql = "INSERT INTO produto(NOME, PRECO) VALUES(?, ?)";
		
		try {
			
			Connection conn = this.conexaoMysql.conectar();
			PreparedStatement qry = conn .prepareStatement(sql);
			
			qry.setString(1, produto.NOME);
			qry.setDouble(2, produto.PRECO);
			
			qry.executeUpdate();
			
			System.out.println("Produto cadastrado cum sucesso!");
			
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("Erro ao cadastrar um novo produto");
		}
		
	}
	
	
	public void atualizarProduto(Produto produto) {
		String sql = "UPDATE produto "
				+ "SET NOME = ?, "
				+ "PRECO = ? "
				+ "WHERE ID = ?";
		try {
			Connection conn = this.conexaoMysql.conectar();
			PreparedStatement qry = conn .prepareStatement(sql);
			
			qry.setString(1, produto.NOME);
			qry.setDouble(2, produto.PRECO);
			qry.setInt(3, produto.ID);
			
			qry.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar produto!");
		}
	}
	
	public void deletarProdutos(int id) {
		String sql = "DELETE FROM produto WHERE id = ?";
			//...
	}
	
	
}
