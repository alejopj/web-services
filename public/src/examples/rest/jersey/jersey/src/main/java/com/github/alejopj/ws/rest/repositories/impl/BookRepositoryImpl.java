package com.github.alejopj.ws.rest.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import com.github.alejopj.ws.rest.entities.Book;
import com.github.alejopj.ws.rest.repositories.BookRepository;

public class BookRepositoryImpl implements BookRepository {

	private static List<Book> books = new ArrayList<Book>();
	
	@Override
	public List<Book> getBooks() {
		return books;
	}

	@Override
	public Book getBook(long bookId) {
		for (Book book : books) {
			if (book.getId() == bookId) {
				return book;
			}
		}
		return null;
	}

	@Override
	public boolean publishBook(Book book) {
		return books.add(book);
	}

	@Override
	public boolean updateBook(long bookId, Book book) {
		Book removedBook = null;
		for (Book b : books) {
			if (b.getId() == bookId) {
				removedBook = b;
				break;
			}
		}
		if (removedBook == null) {
			return false;
		}
		boolean removed = books.remove(removedBook);
		boolean added = books.add(book);
		return removed && added;
	}

	@Override
	public boolean unpublishBook(long bookId) {
		Book removedBook = null;
		for (Book b : books) {
			if (b.getId() == bookId) {
				removedBook = b;
				break;
			}
		}
		if (removedBook == null) {
			return false;
		}
		return books.remove(removedBook);
	}

}
