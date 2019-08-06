package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;

import org.junit.jupiter.api.Test;

import jdbc.SigleConJdbc;

public class ProduceDao {

	// 无参的存储过程
	public static void main(String[] args) throws Exception {
		Connection con = SigleConJdbc.getCon();
		CallableStatement cs = con.prepareCall("call selectAll()");
		cs.execute();
		ResultSet rs = cs.getResultSet();
		while (rs.next()) {
			System.out.println(rs.getString("user_name"));
		}
	}

	@Test // c存储过程的入参
	public void queryWithFilter() throws Exception {
		Connection con = SigleConJdbc.getCon();
		CallableStatement cs = con.prepareCall("call select_filter(?)");
		cs.setString(1, "13457659811");
		cs.execute();
		ResultSet rs = cs.getResultSet();
		while (rs.next()) {
			System.out.println(rs.getString("user_name"));
		}
	}

	@Test // 存储过程的 出参
	public void select_count() throws Exception {
		Connection con = SigleConJdbc.getCon();
		CallableStatement cs = con.prepareCall("call select_count(?)");
		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		System.out.println("select_count:" + cs.getInt(1));
	}
}
