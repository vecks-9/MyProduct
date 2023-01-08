package model;

import java.io.Serializable;

public class User implements Serializable{
	private int id;
	private String userid;
	private String password;
	
	public User() {
	}
	public User(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}
	public User(int id, String userid, String password) {
		this.id = id;
		this.userid = userid;
		this.password = password;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public String getUserid() {
		return userid;
	}
	public String getPassword() {
		return password;
	}
	
}
