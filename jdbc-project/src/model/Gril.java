package model;

import java.sql.Date;

public class Gril {
	private Integer id;
	private String user_name;
	private Integer set;
	private Integer age;
	private java.util.Date birthday;
	private String email;
	private String monile;
	private String create_user;
	private Date create_date;
	private String update_User;
	private String update_date;
	private Integer isdel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Integer getSet() {
		return set;
	}

	public void setSet(Integer set) {
		this.set = set;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public java.util.Date getBirthday() {
		return birthday;
	}

	public void setBirthday(java.util.Date date) {
		this.birthday = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMonile() {
		return monile;
	}

	public void setMonile(String monile) {
		this.monile = monile;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getUpdate_User() {
		return update_User;
	}

	public void setUpdate_User(String update_User) {
		this.update_User = update_User;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public Integer getIsdel() {
		return isdel;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return "Gril [id=" + id + ", user_name=" + user_name + ", set=" + set + ", age=" + age + ", birthday="
				+ birthday + ", email=" + email + ", monile=" + monile + ", create_user=" + create_user
				+ ", create_date=" + create_date + ", update_User=" + update_User + ", update_date=" + update_date
				+ ", isdel=" + isdel + "]";
	}

}
