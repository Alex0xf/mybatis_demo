package com.javasm.user.model;
/**
 * 
 * ClassName: AdminMenuModel 
 * @Description: 用户菜单实体类
 * @author Alex
 * @date 2018年7月29日
 */
public class AdminMenuModel {
	private int mid;
	private String menuName;
	private String menuIcon;

	@Override
	public String toString() {
		return "AdminMenuModel [mid=" + mid + ", menuName=" + menuName + ", menuIcon=" + menuIcon + "]";
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuIcon() {
		return menuIcon;
	}
	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}
	
}
