package com.javasm.book.dao;

import java.util.List;

import com.javasm.book.model.BookModel;
/**
 * 
 * ClassName: IBookDAO 
 * @Description: 数据库交互的接口
 * @author Alex
 * @date 2018年7月28日
 */
public interface IBookDAO {
   List<BookModel> selectBookList();
   void insertBookModel(BookModel book);
   void deleteBookModel(long id);
   void updateBookModel(BookModel book);
   List<BookModel> selectBookListByBidList(List<Long> bidlist);
}
