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
	// C - CREATE - INSERT
	// R - READ - SELECT
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
	
	
	
}
