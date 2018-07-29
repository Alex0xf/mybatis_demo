package com.javasm.user.model;

import java.util.Date;
import java.util.List;

/**
 * 
 * ClassName: AdminRoleModel 
 * @Description: 角色类
 * @author Alex
 * @date 2018年7月28日
 */
public class AdminRoleModel {
	private int rid;
	private String rname;
	private Date ctime;
	
	//角色下 有一堆用户 一个角色对应多个用户 一对多
	private List<AdminUserModel> userList;
	//菜单集合
	private List<AdminMenuModel> menuList;	
	
	@Override
	public String toString() {
		return "AdminRoleModel [rid=" + rid + ", rname=" + rname + ", ctime=" + ctime + ", userList=" + userList
				+ ", menuList=" + menuList + "]";
	}
	public List<AdminUserModel> getUserList() {
		return userList;
	}
	public void setUserList(List<AdminUserModel> userList) {
		this.userList = userList;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public List<AdminMenuModel> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<AdminMenuModel> menuList) {
		this.menuList = menuList;
	}
	
	
}
