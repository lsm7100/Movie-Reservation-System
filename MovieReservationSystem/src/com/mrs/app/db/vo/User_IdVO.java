package com.mrs.app.db.vo;

import java.util.Date;


public class User_IdVO {
	

private String userId;
private String userName;
private String passWord;
private Date create_Date;
private Date update_Date;


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Date getCreate_Date() {
		return create_Date;
	}
	public void setCreate_Date(Date create_Date) {
		this.create_Date = create_Date;
	}
	public Date getUpdate_Date() {
		return update_Date;
	}
	public void setUpdate_Date(Date update_Date) {
		this.update_Date = update_Date;
	}
	@Override
	public String toString() {
		return "User_IdVO [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", create_Date="
				+ create_Date + ", update_Date=" + update_Date + "]";
	}


}

