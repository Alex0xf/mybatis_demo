package com.javasm.user.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.javasm.user.dao.IUserDAO;
import com.javasm.user.model.AdminUserRoleModel;
import com.javasm.user.service.IUserService;
import com.javasm.utills.MyBatisUtil;
/**
 * 
 * ClassName: UserServiceImpl 
 * @Description: 用户逻辑操作的实现
 * @author Alex
 * @date 2018年7月28日
 */
public class UserServiceImpl implements IUserService{
	static IUserDAO userDao;
	static {
		// 静态代码块只在第一次程序加载时执行一次 且整个当前类只有这一个session和studentDao
		SqlSession session = MyBatisUtil.getSqlSession();
		// 从session中获取dao
		userDao = session.getMapper(IUserDAO.class);
	}
	
	@Override
	public List<AdminUserRoleModel> selectUserListWithRole() {
	
		return userDao.selectUserListWithRole();
	}

}
