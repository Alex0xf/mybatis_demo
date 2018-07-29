package com.javasm.book.action;

import java.util.ArrayList;
import java.util.List;

import com.javasm.book.model.BookModel;
import com.javasm.book.service.IBookService;
import com.javasm.book.service.impl.BookServiceImpl;

/**
 * 
 * ClassName: BookAction 
 * @Description:测试类
 * @author Alex
 * @date 2018年7月29日
 */
public class BookAction {
	static IBookService bookService = new BookServiceImpl();
	
	public static void main(String[] args) {
		List<Long> bidlist=new ArrayList<>();
		bidlist.add(1001001l);
		bidlist.add(1001004l);
		bidlist.add(1001005l);
		//测试缓存
		for(int i=0;i<10;i++){
			List<BookModel> blist=bookService.selectBookListByBidList(bidlist);
			System.out.println(blist);
		}
	}
}
