package com.javasm.user.dao;

import java.util.List;

import com.javasm.user.model.AdminUserModel;
import com.javasm.user.model.AdminUserRoleModel;

public interface IUserDAO {
	List<AdminUserRoleModel> selectUserListWithRole();
	List<AdminUserModel> selectUserListByRid(Integer rid);
	
}
