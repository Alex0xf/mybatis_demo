package com.javasm.user.model;
/**
 * 
 * ClassName: AdminUserModel 
 * @Description: 对应用户
 * @author Alex
 * @date 2018年7月28日
 */
public class AdminUserModel {
	private int uid;
	private String name;
	private String password;
	private Integer rid;
	
	@Override
	public String toString() {
		return "AdminUserModel [uid=" + uid + ", name=" + name + ", password=" + password + ", rid=" + rid + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	
	
}
