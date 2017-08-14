package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
	public static void main(String[] args) throws SQLException {
		
		Connection conn = new ConnectionPool().getConnection();
		Statement statement = conn.createStatement();
		boolean execute = statement.execute("delete from produto where id > 3");
		
		System.out.println(execute);
		
		int updateCount = statement.getUpdateCount();
		System.out.println(updateCount + " linhas atualizadas.");
		
		statement.close();
		conn.close();
	}
}
