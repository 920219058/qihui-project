package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import jdbc.SigleConJdbc;
import model.Gril;

public class GrilDao {
	public void addGril(Gril gril) throws Exception {
		Connection con = SigleConJdbc.getCon();
		String sql = "insert into Gril(user_name,sex,age,birthday,email,mobile,create_User,"
				+ "create_date,update_User,update_date,isdel)value(?,?,?,?,?,?,?,current_date(),?,current_date(),?)";
		PreparedStatement ptmt = con.prepareStatement(sql);
		ptmt.setString(1, gril.getUser_name());
		ptmt.setInt(2, gril.getSet());
		ptmt.setInt(3, gril.getAge());
		ptmt.setDate(4, new Date(gril.getBirthday().getTime()));
		ptmt.setString(5, gril.getEmail());
		ptmt.setString(6, gril.getMonile());
		ptmt.setString(7, gril.getCreate_user());
		ptmt.setString(8, gril.getUpdate_User());
		ptmt.setInt(9, gril.getIsdel());
		ptmt.execute();
	}

	public void updateGril(Gril g) throws Exception {
		Connection con = SigleConJdbc.getCon();
		String updaSql = "update gril set user_name=?,sex=?,age=?,birthday=?,email=?, "
				+ "mobile=?,update_User=?,update_date=current_date,isdel=? where id=?";
		PreparedStatement ptmt = con.prepareStatement(updaSql);
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSet());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthday().getTime()));
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMonile());
		ptmt.setString(7, g.getUpdate_User());
		ptmt.setInt(8, g.getIsdel());
		ptmt.setInt(9, g.getId());
		ptmt.execute();

	}

	public void delGril(Integer id) throws SQLException {
		Connection conn = SigleConJdbc.getCon();
		String delString = "delete from gril where id = ? ";
		PreparedStatement ptmt = conn.prepareStatement(delString);
		ptmt.setInt(1, id);
		ptmt.execute();
	}

	public List<Gril> queryGrils() {
		return null;
	}

	public Gril getGril(Integer id) throws SQLException {
		Gril g = null;
		Connection con = SigleConJdbc.getCon();
		String sql = "select * from gril where id = ?";
		PreparedStatement ptmt = con.prepareStatement(sql);
		ptmt.setInt(1, id);
		ResultSet rs = ptmt.executeQuery();
		while (rs.next()) {
			g = new Gril();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			g.setSet(rs.getInt("sex"));
			g.setBirthday(rs.getDate("birthday"));
			g.setEmail(rs.getString("email"));
			g.setMonile(rs.getString("mobile"));
			g.setCreate_date(rs.getDate("create_date"));
			g.setCreate_user(rs.getString("create_User"));
			g.setUpdate_User(rs.getString("update_date"));
			g.setUpdate_date(rs.getString("update_user"));
			g.setIsdel(rs.getInt(rs.getInt("isdel")));
		}
		return g;
	}

	public void createAccount() throws Exception {
		Connection con = SigleConJdbc.getCon();
		String sql = "CREATE TABLE account_info (id INT NOT NULL PRIMARY KEY auto_increment,"
				+ "	account VARCHAR ( 20 ) NOT NULL, amount DOUBLE ( 18, 2 ) NOT NULL DEFAULT 0,"
				+ "create_at datetime NOT NULL default NOW())";
		PreparedStatement ptmt = con.prepareStatement(sql);
		if (ptmt.execute()) {
			System.out.println("创建成功。");
		}
	}

	public void createTransInfo() throws Exception {
		Connection con = SigleConJdbc.getCon();
		String sql = "CREATE TABLE trans_info ( id INT NOT NULL PRIMARY KEY auto_increment,"
				+ "	source_id int not null, aource_account varchar(20) not null,"
				+ "	destination_id int not null, destination_acount varchar(20) not null,"
				+ "	amount double(18,2) not null default 0, create_at datetime NOT NULL default NOW())";
		PreparedStatement ptmt = con.prepareStatement(sql);
		if (ptmt.execute()) {
			System.out.println("创建成功。");
		}
	}
}
