package com.javasm.user.service;

import java.util.List;

import com.javasm.user.model.AdminRoleModel;

/**
 * 
 * ClassName: IRoleService 
 * @Description: 角色逻辑操作的接口
 * @author Alex
 * @date 2018年7月28日
 */
public interface IRoleService {
	List<AdminRoleModel> selectAdminRoleWitcUser();
	
	List<AdminRoleModel> selectUserListMybatis();
}
