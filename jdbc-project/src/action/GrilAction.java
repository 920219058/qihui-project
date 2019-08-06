package action;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import dao.GrilDao;
import model.Gril;

public class GrilAction {

	public static void main(String[] args) throws Exception {

		GrilDao grilDao = new GrilDao();
		Gril gril = new Gril();
		gril.setUser_name("wuqiquan");
		gril.setSet(0);
		gril.setAge(27);
		gril.setBirthday(new Date());
		gril.setEmail("870492850@qq.com");
		gril.setMonile("18188615121");
		gril.setCreate_user("admin");
		gril.setUpdate_date("admin");
		gril.setIsdel(1);
		// grilDao.addGril(gril);
		gril.setId(1);
		grilDao.updateGril(gril);
		grilDao.delGril(2);

		// 查询
		// gril = grilDao.getGril(3);
		System.out.println("end....:");
		// System.out.println(gril.toString());

	}

	public void add(Gril gril) throws Exception {
		GrilDao grilDao = new GrilDao();
		grilDao.addGril(gril);
	}

	public void del(Integer id) throws SQLException {
		GrilDao grilDao = new GrilDao();
		grilDao.delGril(id);
	}

	public void update(Gril gril) throws Exception {
		GrilDao grilDao = new GrilDao();
		grilDao.updateGril(gril);
	}

	public List<Gril> query(Integer id) {
		List<Gril> listGrils = null;
		return null;
	}

	public Gril get(Integer id) throws SQLException {
		GrilDao grilDao = new GrilDao();
		return grilDao.getGril(id);
	}
}
