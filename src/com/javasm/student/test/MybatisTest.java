package com.javasm.student.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.javasm.student.dao.StudentDAO;
import com.javasm.student.model.StudentModel;
/**
 * 
 * ClassName: MybatisTest 
 * @Description: Mybatis的测试类 
 * @author Alex
 * @date 2018年7月27日
 */
public class MybatisTest {

	public static void main(String[] args) {
		//获得配置文件的地址是哪一个
		String mybatisxml="mybatis-config.xml";
        try {
        	//以流的形式读取 已经读取到配置文件 记得引3包
			Reader reader=Resources.getResourceAsReader(mybatisxml);
			//创建session工厂
			SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
            //openSession 打开session true是表示自动提交事物false不自动提交
			//事物防止失误
			//添加一批数据 其中还一条数据出现错误 剩下的要不要提交 还是成功的信息回滚
			SqlSession session=sessionFactory.openSession(true);
			//从session中获取dao
			StudentDAO studentDAO=session.getMapper(StudentDAO.class);
			//调用dao的方法
			List<StudentModel> list=studentDAO.SelectStudentList();
			System.out.println(list);
        } catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
