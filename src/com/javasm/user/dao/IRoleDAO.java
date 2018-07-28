package com.javasm.user.dao;

import java.util.List;

import com.javasm.user.model.AdminRoleModel;

public interface IRoleDAO {
	List<AdminRoleModel> selectAdminRoleWitcUser();
}
