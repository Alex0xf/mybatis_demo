package com.javasm.utills;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * ClassName: MyBatisUtil 
 * @Description: 工具类
 * @author Alex
 * @date 2018年7月27日
 */
public class MyBatisUtil {
	/**
	 * 
	 * @Description:用来获取session
	 * @param @return   
	 * @return SqlSession  
	 * @throws
	 */
	public static SqlSession getSqlSession() {
		Reader reader=null;
		try {//通过流的方式获得配置文件
			reader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//获取sqlSessionFactory
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
		// openSession 打开session true是表示自动提交事务 false不自动提交 //事务 防止失误 添加失败可以回滚
		SqlSession session=sqlSessionFactory.openSession(true);
		return session;
	}
}
