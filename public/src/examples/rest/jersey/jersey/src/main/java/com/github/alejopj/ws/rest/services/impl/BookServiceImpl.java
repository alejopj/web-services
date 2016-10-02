package com.github.alejopj.ws.rest.services.impl;

import java.util.List;

import com.github.alejopj.ws.rest.entities.Book;
import com.github.alejopj.ws.rest.repositories.BookRepository;
import com.github.alejopj.ws.rest.repositories.impl.BookRepositoryImpl;
import com.github.alejopj.ws.rest.services.BookService;

public class BookServiceImpl implements BookService {

	private BookRepository repository = new BookRepositoryImpl();
	
	@Override
	public List<Book> getBooks() {
		return repository.getBooks();
	}

	@Override
	public Book getBook(long bookId) {
		return repository.getBook(bookId);
	}

	@Override
	public boolean publishBook(Book book) {
		return repository.publishBook(book);
	}

	@Override
	public boolean updateBook(long bookId, Book book) {
		return repository.updateBook(bookId, book);
	}

	@Override
	public boolean unpublishBook(long bookId) {
		return repository.unpublishBook(bookId);
	}

}
