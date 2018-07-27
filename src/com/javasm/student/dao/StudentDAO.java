package com.javasm.student.dao;

import java.util.List;

import com.javasm.student.model.StudentModel;
/**
 * 
 * ClassName: StudentDAO 
 * @Description: 数据库交互类的接口
 * @author Alex
 * @date 2018年7月27日
 */
public interface StudentDAO {

	//写一些方法
	//如查询学生列表
	List<StudentModel> SelectStudentList();
	//查询学生信息
	StudentModel SelectStudentById(Integer id);
}
