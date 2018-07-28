package com.javasm.book.model;
/**
 * 
 * ClassName: BookModel 
 * @Description: 图书实体类
 * @author Alex
 * @date 2018年7月28日
 */
public class BookModel {
	private long bid;
	private long bookId;
	private String bookName;
	private int readCount;
	
	
	@Override
	public String toString() {
		return "BookModel [bid=" + bid + ", bookId=" + bookId + ", bookName=" + bookName + ", readCount=" + readCount
				+ "]";
	}
	
	public long getBid() {
		return bid;
	}
	public void setBid(long bid) {
		this.bid = bid;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	};
	
}
