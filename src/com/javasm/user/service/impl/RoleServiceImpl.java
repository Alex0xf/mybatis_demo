package com.javasm.user.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.javasm.user.dao.IRoleDAO;
import com.javasm.user.dao.IUserDAO;
import com.javasm.user.model.AdminRoleModel;
import com.javasm.user.model.AdminUserModel;
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
	static IUserDAO userDao;
	static {
		// 静态代码块只在第一次程序加载时执行一次 且整个当前类只有这一个session和studentDao
		SqlSession session = MyBatisUtil.getSqlSession();
		// 从session中获取dao
		roleDao = session.getMapper(IRoleDAO.class);
		userDao = session.getMapper(IUserDAO.class);
	}
	@Override
	public List<AdminRoleModel> selectAdminRoleWitcUser() {
		//查询角色列表 每个角色下都有用户列表
		List<AdminRoleModel> list=roleDao.selectAdminRoleWitcUser();
		//不建议用循环的方式查 消耗资源 每次都会去数据库查
		for(AdminRoleModel role:list){
			int rid=role.getRid();//角色id
			List<AdminUserModel> userList=userDao.selectUserListByRid(rid);
			role.setUserList(userList);
		}
	    return list;
	}
	@Override
	public List<AdminRoleModel> selectUserListMybatis() {
		
		return roleDao.selectUserListMybatis();
	}

}
