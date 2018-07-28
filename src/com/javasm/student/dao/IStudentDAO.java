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
public interface IStudentDAO {

	//写一些方法
	//如查询学生列表
	List<StudentModel> selectStudentList();
	//查询学生信息
	StudentModel selectStudentById(Integer id);
	StudentModel selectStudentById(StudentModel student);
	StudentModel selectStudentById2(StudentModel student);
	StudentModel selectStudentByObject(StudentModel student);
}
