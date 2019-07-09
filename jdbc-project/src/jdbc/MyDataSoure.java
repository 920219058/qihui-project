package jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class MyDataSoure implements DataSource {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {

		}
	}

	private String url = "jdbc:mysql://localhost:3306/?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private String user = "root";
	private String passWord = "root";

	public MyDataSoure() {
		initPool();
	}

	// 初始化放10个
	private void initPool() {
		try {
			for (int i = 0; i < ConnectionPool.MAX; i++) {
				Connection conn = DriverManager.getConnection(url, user, passWord);
				pool.addConnection(new MyConnectionWrapper(conn, pool));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private ConnectionPool pool = new ConnectionPool();

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}

	@Override
	public Connection getConnection() throws SQLException {
		return pool.getConnection();
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return pool.getConnection();
	}

}
