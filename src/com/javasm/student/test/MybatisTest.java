package com.javasm.student.test;

import java.util.List;
import com.javasm.student.model.StudentModel;
import com.javasm.student.service.IStudentService;
import com.javasm.student.service.impl.StudentServiceImpl;
/**
 * 
 * ClassName: MybatisTest 
 * @Description: Mybatis的测试类 
 * @author Alex
 * @date 2018年7月27日
 */
public class MybatisTest {

	static IStudentService studentService = new StudentServiceImpl();
	public static void main(String[] args) {
		List<StudentModel> student1 = studentService.selectStudentList();
		StudentModel student2 = studentService.selectStudentById(226);
		StudentModel student3 = studentService.selectStudentByObject(student2);
		System.out.println(student1);
		System.out.println("-------------");
		System.out.println(student2);
		System.out.println("-------------");
		System.out.println(student3);
	}
}
