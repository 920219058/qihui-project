package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SigleConJdbc {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/mytest?verifyServerCertificate=false&useSSL=false&serverTimezone=UTC";
	private static final String NAME = "root";
	private static final String PWD = "root";
	private static Connection con;
	static {
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL, NAME, PWD);
		} catch (Exception e) {
			System.out.println("has somting error.");
		}
	}

	public static Connection getCon() {
		return con;
	}

	public static void main(String[] args) throws Exception {
		// 加载数据库的驱动
		Class.forName(JDBC_DRIVER);
		// 获取数据库链接
		Connection con = DriverManager.getConnection(DB_URL, NAME, PWD);
		if (con != null) {
			System.out.println("链接成功！");
		}
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from gril");
		while (rs.next()) {
			System.out.println(rs.getString("id") + ":" + rs.getString("user_name"));
		}
	}
}
