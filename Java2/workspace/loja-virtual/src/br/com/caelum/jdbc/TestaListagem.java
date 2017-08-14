package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {

		long inicio = System.currentTimeMillis();
				
		for (int i = 0; i < 10000; i++) {
		
			Connection connection = new ConnectionPool().getConnection();
			Statement statement = connection.createStatement();
			
			statement.executeQuery("select * from produto");
			ResultSet resultSet = statement.getResultSet();
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String descricao = resultSet.getString("descricao");
				
				System.out.println(id + " - " + nome + " - " + descricao);
				
			}
			
			resultSet.close();
			statement.close();
			connection.close();
			
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		
	}


}
