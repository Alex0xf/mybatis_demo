package com.javasm.book.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.javasm.book.dao.IBookDAO;
import com.javasm.book.model.BookModel;
import com.javasm.book.service.IBookService;
import com.javasm.utills.MyBatisUtil;

/**
 * 
 * ClassName: BookServiceImpl
 * @Description: BookService的实现
 * @author Alex
 * @date 2018年7月28日
 */
public class BookServiceImpl implements IBookService {
	static IBookDAO bookDao;
	static {
		// 静态代码块只在第一次程序加载时执行一次 且整个当前类只有这一个session和studentDao
		SqlSession session = MyBatisUtil.getSqlSession();
		// 从session中获取dao
		bookDao = session.getMapper(IBookDAO.class);
	}

	@Override
	public List<BookModel> selectBookList() {

		return bookDao.selectBookList();
	}

	@Override
	public void updateBookModel(BookModel book) {
		if (book != null && book.getBid() > 0) {
			bookDao.updateBookModel(book);
		}

	}

	@Override
	public void insertBookModel(BookModel book) {
		if (book != null) {
			bookDao.insertBookModel(book);
		}

	}

	@Override
	public void deleteBookModel(long id) {
		if (id > 0) {
			bookDao.deleteBookModel(id);
		}

	}

}
