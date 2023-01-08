package model;

public class User {
	private String userid;
	private String password;
	
	public User() {
	}
	
	public User(String id, String pass) {
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserid() {
		return userid;
	}
	public String getPassword() {
		return password;
	}
}