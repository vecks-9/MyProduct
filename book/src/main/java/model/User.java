package model;

public class User {
	private String userid;
	private String pass;

	public User() {
	}
	public User(String userid, String pass) {
		this.userid = userid;
		this.pass = pass;
	}

	public void setUserId(String userid) {
		this.userid = userid;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUserId() {
		return userid;
	}
	public String getPass() {
		return pass;
	}
}
