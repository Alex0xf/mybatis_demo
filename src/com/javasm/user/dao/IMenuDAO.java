package com.javasm.user.dao;

import java.util.List;

import com.javasm.user.model.AdminMenuModel;

public interface IMenuDAO {
	List<AdminMenuModel> selectMenuListByRid();
}
