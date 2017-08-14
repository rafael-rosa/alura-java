package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.dao.ProdutosDAO;
import br.com.caelum.jdbc.modelo.Produto;

public class TestaProdutoDAO{
	
	public static void main(String[] args) throws SQLException {
	
		try (Connection conn = new ConnectionPool().getConnection()){
			
			Produto produto = new Produto("Mesa Azul","Mesa com 4 pés");
						
			ProdutosDAO produtosDAO = new ProdutosDAO(conn);
			produtosDAO.salva(produto);
			List<Produto> lista = produtosDAO.lista();
			
			for (Produto item : lista) {
				System.out.println(item);
			}								
			
		}
		
	}
	
}
