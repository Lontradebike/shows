package adiciona.Shows.Dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		  Connection connection = new ConnectionFactory().getConnection();
	      System.out.println("Conex�o aberta!");
	      connection.close();	}

}
