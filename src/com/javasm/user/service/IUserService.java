package com.javasm.user.service;

import java.util.List;

import com.javasm.user.model.AdminUserRoleModel;
/**
 * 
 * ClassName: IUserService 
 * @Description: 用户逻辑接口
 * @author Alex
 * @date 2018年7月28日
 */
public interface IUserService {
	List<AdminUserRoleModel> selectUserListWithRole();

}
