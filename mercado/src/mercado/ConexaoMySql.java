package mercado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql {

	String url = "jdbc:mysql://localhost:3306/mercado";
	String usuario = "root";
	String senha = "";

	public Connection conectar() {
		
	    try {

            Connection conn = DriverManager.getConnection(
                url, usuario, senha
            );

            System.out.println("Conexão realizada com sucesso!");

            return conn;

        } catch (SQLException e) {

            System.out.println("Erro ao realizar conexão com banco de dados!");

            e.printStackTrace();

            return null;
        }
		
		
	}

}
