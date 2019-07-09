package com.huawei.test;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.MyDataSoure;

public class MyTest {
	public static void main(String[] args) {

		MyDataSoure ds = new MyDataSoure();
		try {
			Connection conn = ds.getConnection();
			java.sql.Statement st = conn.createStatement();
			st.execute("create database wuqihui2");
			/*
			 * while (rs.next()) { System.out.println("rs:"); }
			 */
			// rs.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
