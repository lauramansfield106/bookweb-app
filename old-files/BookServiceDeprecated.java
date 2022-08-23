package com.lmansfield.bookwebheroku;
//package com.lmansfield.bookwebheroku;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//
//@Service
//
//public class BookService {
//
//	private List<Book> books = new ArrayList<Book>();
//	private Long bookID = 1L;
//	
//
//	
//	public List<Book> getBooks() {
//		return books;
//	}
//
//	public void setBooks(List<Book> books) {
//		this.books = books;
//	}
//
//	//add book by info
//	public void addBook(String title, String author, int rating) {
//		books.add(new Book(title, author, rating, ++bookID));
//	}
//	
//	//add book as object
//	public void addBook(Book book) {
//		books.add(book);
//	}
//	
//	//delete book
//	public void deleteBook(Book book) {
//		books.remove(book);
//
//	}
//	
//	//get book by id
//	public Book getBookById(Long id) {
//		for (Book book : books) {
//			if (book.getId() == id) {
//				return book;
//			}
//		}
//		return null;
//	}
//	
//	//edit book
//	public void editBook(Book book) {
//		books.remove(book);
//		books.add(book);
//	}
//}
