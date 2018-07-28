package com.javasm.user.dao;

import java.util.List;

import com.javasm.user.model.AdminUserRoleModel;

public interface IUserDAO {
	List<AdminUserRoleModel> selectUserListWithRole();
}
