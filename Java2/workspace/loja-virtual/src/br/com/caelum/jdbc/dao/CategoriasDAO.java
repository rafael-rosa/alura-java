package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.modelo.Categoria;
import br.com.caelum.jdbc.modelo.Produto;

public class CategoriasDAO {

	private final Connection conn;

	public CategoriasDAO(Connection conn) {
		this.conn = conn;
	}

	public List<Categoria> lista() throws SQLException {
		String sql = "select * from categoria";
		List<Categoria> categorias = new ArrayList<>();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.execute();

			try (ResultSet resultSet = stmt.getResultSet()) {
				while (resultSet.next()) {
					Categoria categoria = new Categoria(resultSet.getInt("id"), resultSet.getString("nome"));
					categorias.add(categoria);
				}
			}
		}

		return categorias;
	}
	
	public List<Categoria> listaComProdutos() throws SQLException{
	
		List<Categoria> categorias = new ArrayList<>();
		Categoria ultima = null;
		String sql = "select c.id as c_id, c.nome as c_nome, p.id as p_id, p.nome as p_nome, p.descricao as p_descricao from categoria c inner join produto p on (p.categoria_id = c.id) order by c.id";
		
		try(PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.execute();
			System.out.println("query");
			
			try(ResultSet resultSet = stmt.getResultSet()){
				
				while (resultSet.next()) {
										
					if (ultima == null || !ultima.getNome().equals(resultSet.getString("c_nome"))) {
					
						Categoria categoria = new Categoria(resultSet.getInt("c_id"), resultSet.getString("c_nome")); 	
						categorias.add(categoria);
						ultima = categoria; //Ultima aponta para o mesmo objeto que foi adicionado na lista
					}
					
					Produto produto = new Produto(resultSet.getString("p_nome"), resultSet.getString("p_descricao"));
					produto.setId(resultSet.getInt("p_id"));
					ultima.adiciona(produto); //Por isto ao adicionar o produto depois de inserido na lista funciona					
				}
			}
		}
		
		return categorias ;
	}

}
