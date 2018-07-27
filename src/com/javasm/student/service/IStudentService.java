package com.javasm.student.service;

import java.util.List;

import com.javasm.student.model.StudentModel;

/**
 * 
 * ClassName: IStudentService 
 * @Description: 学生类接口
 * @author Alex
 * @date 2018年7月27日
 */
public interface IStudentService {

	// 查询学生列表
	List<StudentModel> selectStudentList();

	// 查询学生信息
	StudentModel selectStudentById(Integer id);
	
	StudentModel selectStudentByObject(StudentModel student);
	
	
}
