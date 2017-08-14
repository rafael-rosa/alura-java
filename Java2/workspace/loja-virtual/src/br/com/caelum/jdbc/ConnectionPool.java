package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

public class ConnectionPool {
	
	private DataSource dataSource;

	ConnectionPool(){
		MysqlConnectionPoolDataSource pool = new MysqlConnectionPoolDataSource();
		pool.setUrl("jdbc:mysql://localhost/loja-virtual");
		pool.setUser("root");
		pool.setPassword("root");
		this.dataSource = pool;
	}
	
	public Connection getConnection() throws SQLException {
	//	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/loja-virtual","root","root");
		Connection connection = dataSource.getConnection();
		return connection;
	}
}
