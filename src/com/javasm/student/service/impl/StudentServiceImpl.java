package com.javasm.student.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.javasm.student.Utills.MyBatisUtil;
import com.javasm.student.dao.StudentDAO;
import com.javasm.student.model.StudentModel;
import com.javasm.student.service.IStudentService;
/**
 * 
 * ClassName: StudentServiceImpl 
 * @Description: 接口的实现类
 * @author Alex
 * @date 2018年7月27日
 */
public class StudentServiceImpl implements IStudentService{
    static StudentDAO studentDao;
    static{
    	//静态代码块只在第一次程序加载时执行一次 且整个当前类只有这一个session和studentDao
    	SqlSession session = MyBatisUtil.getSqlSession();
    	//从session中获取dao
    	studentDao = session.getMapper(StudentDAO.class);
    }
	 
	@Override
	public List<StudentModel> selectStudentList() {
		return studentDao.selectStudentList() ;
	}

	@Override
	public StudentModel selectStudentById(Integer id) {
		return studentDao.selectStudentById(id);
	}

	@Override
	public StudentModel selectStudentByObject(StudentModel student) {
		
		return studentDao.selectStudentByObject(student);
	}

}
