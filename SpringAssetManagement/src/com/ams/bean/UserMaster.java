package com.ams.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_master")
public class UserMaster {

	@Id
	@GeneratedValue
	@Column(name="UserId")
	private int userId;
	@Column(name="UserName")
	private String userName;
	@Column(name="UserPassword")
	private String password;
	@Column(name="UserType")
	private String userType;
	
	public UserMaster() {
		// TODO Auto-generated constructor stub
	}
	
	
	public UserMaster(int userId, String userName, String password,
			String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}


	@Override
	public String toString() {
		return "UserMaster [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", userType=" + userType + "]";
	}
	
	
}
