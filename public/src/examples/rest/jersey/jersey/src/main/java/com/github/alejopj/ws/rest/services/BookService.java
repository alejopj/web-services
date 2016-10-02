package com.github.alejopj.ws.rest.services;

import java.util.List;

import com.github.alejopj.ws.rest.entities.Book;

public interface BookService {

	public List<Book> getBooks();
	
	public Book getBook(long bookId);
	
	public boolean publishBook(Book book);
	
	public boolean updateBook(long bookId, Book book);
	
	public boolean unpublishBook(long bookId);
}
