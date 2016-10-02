package com.github.alejopj.ws.rest.jersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.alejopj.ws.rest.entities.Book;
import com.github.alejopj.ws.rest.services.BookService;
import com.github.alejopj.ws.rest.services.impl.BookServiceImpl;

@Path("/books")
public class BookController {
	
	private BookService service = new BookServiceImpl();
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getBooks() {
		return service.getBooks();
	}
	
	@GET
	@Path("/{bookId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook(@PathParam("bookId") long bookId) {
		return service.getBook(bookId);
	}
	
	@POST
	@Path("/{bookId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean publishBook(Book book) {
		return service.publishBook(book);
	}
	
	@PUT
	@Path("/{bookId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean updateBook(@PathParam("bookId") long bookId, Book book) {
		return service.updateBook(bookId, book);
	}
	
	@DELETE
	@Path("/{bookId}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean unpublishBook(@PathParam("bookId") long bookId) {
		return service.unpublishBook(bookId);
	}
	
}