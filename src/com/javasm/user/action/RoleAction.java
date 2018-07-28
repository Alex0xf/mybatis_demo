package com.javasm.user.action;

import java.util.List;

import com.javasm.user.model.AdminRoleModel;
import com.javasm.user.service.IRoleService;
import com.javasm.user.service.impl.RoleServiceImpl;

public class RoleAction {
	private static IRoleService roleService=new  RoleServiceImpl();
	//测试表与表之间 一对多 多对多的情况
	public static void main(String[] args) {
		//List<AdminRoleModel> list=roleService.selectAdminRoleWitcUser();
		List<AdminRoleModel> list=roleService.selectUserListMybatis();
		System.out.println(list);
	}
}
