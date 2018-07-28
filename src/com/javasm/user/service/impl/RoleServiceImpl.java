package com.javasm.user.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.javasm.user.dao.IRoleDAO;
import com.javasm.user.model.AdminRoleModel;
import com.javasm.user.service.IRoleService;
import com.javasm.utills.MyBatisUtil;

/**
 * 
 * ClassName: RoleServiceImpl 
 * @Description: 角色逻辑操作的实现
 * @author Alex
 * @date 2018年7月28日
 */
public class RoleServiceImpl implements IRoleService{
	static IRoleDAO roleDao;
	static {
		// 静态代码块只在第一次程序加载时执行一次 且整个当前类只有这一个session和studentDao
		SqlSession session = MyBatisUtil.getSqlSession();
		// 从session中获取dao
		roleDao = session.getMapper(IRoleDAO.class);
	}
	@Override
	public List<AdminRoleModel> selectAdminRoleWitcUser() {
		//查询角色列表 每个角色下都有用户列表
		
		return null;
	}

}
