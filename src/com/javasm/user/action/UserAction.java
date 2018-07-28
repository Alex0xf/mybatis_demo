package com.javasm.user.action;

import java.util.List;

import com.javasm.user.model.AdminUserRoleModel;
import com.javasm.user.service.IUserService;
import com.javasm.user.service.impl.UserServiceImpl;
/**
 * 
 * ClassName: UserAction 
 * @Description:
 * @author Alex
 * @date 2018年7月28日
 */
public class UserAction {
	
	private static IUserService userService=new UserServiceImpl();
	//测试不同的关系 一对一 多对
	public static void main(String[] args) {
		List<AdminUserRoleModel> list=userService.selectUserListWithRole();
		System.out.println(list);
	}
}
