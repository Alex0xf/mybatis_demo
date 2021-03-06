package com.javasm.book.service;

import java.util.List;

import com.javasm.book.model.BookModel;
/**
 * 
 * ClassName: IBookService 
 * @Description: 接口
 * @author Alex
 * @date 2018年7月28日
 */
public interface IBookService {
	List<BookModel> selectBookList();

	void insertBookModel(BookModel book);

	void deleteBookModel(long id);

	void updateBookModel(BookModel book);
	//参数是bookid的集合 测试foreach标签
	List<BookModel> selectBookListByBidList(List<Long> bidlist);
}
