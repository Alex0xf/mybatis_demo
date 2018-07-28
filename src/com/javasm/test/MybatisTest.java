package com.javasm.test;

import java.util.List;

import com.javasm.book.model.BookModel;
import com.javasm.book.service.IBookService;
import com.javasm.book.service.impl.BookServiceImpl;
import com.javasm.student.model.StudentModel;
import com.javasm.student.service.IStudentService;
import com.javasm.student.service.impl.StudentServiceImpl;
/**
 * 
 * ClassName: MybatisTest 
 * @Description: Mybatis的测试类 
 * @author Alex
 * @date 2018年7月28日
 */
public class MybatisTest {

	static IStudentService studentService = new StudentServiceImpl();
	static IBookService bookService = new BookServiceImpl();
	public static void main(String[] args) {
		//test01();
		test02();
		
	}
	public static void test02(){
		List<BookModel> bookList=bookService.selectBookList();
		System.out.println("----------"+bookList);
		BookModel book=new BookModel();
		book.setBookId(555550001);
		book.setBookName("PHP基础");
		book.setBid(1001053);
		bookService.updateBookModel(book);
		System.out.println("----------");
		bookService.deleteBookModel(1001003);
		System.out.println("----------");
		bookService.insertBookModel(book);;
		
		
	}
	public static void test01(){
		List<StudentModel> studentList = studentService.selectStudentList();
		StudentModel student2 = studentService.selectStudentById(226);
		StudentModel student3 = studentService.selectStudentByObject(student2);
		StudentModel student4= studentService.selectStudentById2(student2);
		StudentModel student5= studentService.selectStudentById(student2);
		System.out.println("#selectStudentList()-------------");
		System.out.println(studentList);
		System.out.println("#selectStudentById(226)-------------");
		System.out.println(student2);
		System.out.println("$selectStudentByObject(student2)-------------");
		System.out.println(student3);
		System.out.println("#selectStudentById2(student2)-------------");
		System.out.println(student4);
		System.out.println("#selectStudentById(student2)-------------");
		System.out.println(student5);
	}
}
