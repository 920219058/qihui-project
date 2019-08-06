package dao;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userNameString;
	private String passwrdString;
	private String phone;

	public String getUserNameString() {
		return userNameString;
	}

	public void setUserNameString(String userNameString) {
		this.userNameString = userNameString;
	}

	public String getPasswrdString() {
		return passwrdString;
	}

	public void setPasswrdString(String passwrdString) {
		this.passwrdString = passwrdString;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User() {
		super();
	}

	public User(String userNameString, String passwrdString, String phone) {
		super();
		this.userNameString = userNameString;
		this.passwrdString = passwrdString;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [userNameString=" + userNameString + ", passwrdString=" + passwrdString + ", phone=" + phone + "]";
	}

}
