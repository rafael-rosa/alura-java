package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.modelo.Categoria;
import br.com.caelum.jdbc.modelo.Produto;

public class ProdutosDAO {

	private final Connection conn;

	public ProdutosDAO(Connection conn) {
		this.conn = conn;
	}

	public void salva(Produto produto) throws SQLException {
		String sql = "insert into Produto (nome,descricao) values(?,?)";
		
		try(PreparedStatement stmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			
			stmt.execute();
			
			try(ResultSet resultSet = stmt.getGeneratedKeys()){
				
				while(resultSet.next()){
					produto.setId(resultSet.getInt(1));
				}					
			}
		}
	}

	public List<Produto> busca(Categoria categoria) throws SQLException{
		String sql = "select * from Produto where categoria_id = ?";
		List<Produto> produtos = new ArrayList<>();
		
		try(PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setInt(1, categoria.getId());
			stmt.execute();
			
			transformaResultadoEmProdutos(produtos, stmt);
		}
		return produtos;
		
		
	}
	
	public List<Produto> lista() throws SQLException{
		String sql = "select * from Produto";
		List<Produto> produtos = new ArrayList<>();
		
		try(PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.execute();
			
			transformaResultadoEmProdutos(produtos, stmt);
		}
		return produtos;
		
		
	}

	private void transformaResultadoEmProdutos(List<Produto> produtos, PreparedStatement stmt) throws SQLException {
		try(ResultSet resultSet = stmt.getResultSet()){
			
			while(resultSet.next()){
				Produto produto = new Produto(resultSet.getString("nome"), resultSet.getString("descricao"));
				produto.setId(resultSet.getInt("id"));
				produtos.add(produto);
			}					
		}
	}


}