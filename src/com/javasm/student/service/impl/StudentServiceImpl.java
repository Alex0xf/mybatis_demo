package com.javasm.student.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.javasm.student.dao.IStudentDAO;
import com.javasm.student.model.StudentModel;
import com.javasm.student.service.IStudentService;
import com.javasm.utills.MyBatisUtil;
/**
 * 
 * ClassName: StudentServiceImpl 
 * @Description: 接口的实现类
 * @author Alex
 * @date 2018年7月27日
 */
public class StudentServiceImpl implements IStudentService{
    static IStudentDAO studentDao;
    static{
    	//静态代码块只在第一次程序加载时执行一次 且整个当前类只有这一个session和studentDao
    	SqlSession session = MyBatisUtil.getSqlSession();
    	//从session中获取dao
    	studentDao = session.getMapper(IStudentDAO.class);
    }
	 
	@Override
	public List<StudentModel> selectStudentList() {
		return studentDao.selectStudentList() ;
	}

	@Override
	public StudentModel selectStudentById(Integer id) {
		return studentDao.selectStudentById(id);
	}
	public StudentModel selectStudentById(StudentModel student) {
		return studentDao.selectStudentById(student);
	}
	@Override
	public StudentModel selectStudentById2(StudentModel student) {
		return studentDao.selectStudentById2(student);
	}

	@Override
	public StudentModel selectStudentByObject(StudentModel student) {
		
		return studentDao.selectStudentByObject(student);
	}

}
