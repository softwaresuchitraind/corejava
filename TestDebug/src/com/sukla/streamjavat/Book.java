package com.sukla.streamjavat;

public class Book
{
	private String bookId;
	private String bookName;
	private double bookPrice;
	
	public Book()
	{
		// TODO Auto-generated constructor stub
	}

	public Book(String bookId, String bookName, double bookPrice)
	{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public String getBookId()
	{
		return bookId;
	}

	public void setBookId(String bookId)
	{
		this.bookId = bookId;
	}

	public String getBookName()
	{
		return bookName;
	}

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public double getBookPrice()
	{
		return bookPrice;
	}

	public void setBookPrice(double bookPrice)
	{
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString()
	{
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	

}
