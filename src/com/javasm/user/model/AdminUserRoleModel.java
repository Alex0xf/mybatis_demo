package com.javasm.user.model;
/**
 * 
 * ClassName: AdminUserRoleModel 
 * @Description: 用户拥有角色
 * @author Alex
 * @date 2018年7月28日
 */
public class AdminUserRoleModel extends AdminUserModel {
	//一个用户拥有一个角色 多个用户对应一个角色
	private AdminRoleModel role;

	public AdminRoleModel getRole() {
		return role;
	}

	public void setRole(AdminRoleModel role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AdminUserRoleModel [role=" + role + ", getUid()=" + getUid() + ", getName()=" + getName()
				+ ", getPassword()=" + getPassword() + ", getRid()=" + getRid() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
