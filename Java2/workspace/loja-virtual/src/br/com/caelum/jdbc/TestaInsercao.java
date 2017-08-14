package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {

		try (Connection conn = new ConnectionPool().getConnection();) { //Recursos fecháveis são fechados automat. com o try

			conn.setAutoCommit(false);
			String sql = "insert into produto(nome,descricao) values(?,?)";

			try (PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

				adiciona("TV LCD", "32 polegadas", statement);
				adiciona("Blueray", "32 polegadas", statement);
				conn.commit();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Rollback efetuado");
				conn.rollback();
			}

		} 
	}

	public static void adiciona(String nome, String desc, PreparedStatement statement) throws SQLException {

		if (nome.equals("Blueray")) {
			throw new IllegalArgumentException("Problema ocorrido");
		}

		statement.setString(1, nome);
		statement.setString(2, desc);

		boolean execute = statement.execute();
		System.out.println(execute);

		try (ResultSet results = statement.getGeneratedKeys()) {

			while (results.next()) {
				int id = results.getInt(1); // Como estou usando Mysql, passar "id" não estava funcionando
				System.out.println(id + " gerado.");
			}

		} 
	}
}
