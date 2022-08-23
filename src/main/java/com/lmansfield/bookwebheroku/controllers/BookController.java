package com.lmansfield.bookwebheroku.controllers;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lmansfield.bookwebheroku.book.Book;
import com.lmansfield.bookwebheroku.book.repo.BookRepository;



@Controller
public class BookController {

	@Autowired
	BookRepository repo;
	
	@GetMapping(value = "/")
	public String welcomePage(ModelMap model) {
		return "welcome";
	}

	
	@GetMapping(value="/show-books") 
	public String showBookst(ModelMap model) {
		model.addAttribute("books",repo.findAll()); //need to add books list as attribute to show list on welcome page as well
		return "show-books"; 
	}
	
			
	//addBook Get Req. Required to send "dummy" book to model to be edited by user.
	@GetMapping(value="/add-book") 
	public String addBookGet(ModelMap model) {
		model.addAttribute("book", new Book());
		model.addAttribute("books", repo.findAll()); //need to add books list as attribute to show list on welcome page as well
		return "books"; 
	}
	
	
	//addBook Post req. Gets information entered by user and adds it to the model.
	//The book variable has been set by the get request, and the instance variables are pulled form the form (jsp)
	@PostMapping(value = "/add-book")
	public String addBook(ModelMap model, Book book) {
		repo.save(book);
		model.addAttribute("book", book);
		model.addAttribute("books", repo.findAll()); 
		
		
		return "redirect:add-book";
	}
	

	
	//remove a book selected by user
	//in the jsp file, we pass the  href as "/remove-book?id=${book.id}" to get the parameter
	@GetMapping(value="/remove-book")
	public String removeBook(ModelMap model, @RequestParam Long id) {
		Optional<Book> book = repo.findById(id);
		repo.deleteById(id); //delete the book from the repository
		model.addAttribute("book", book); //add the given book to the model
		model.addAttribute("books", repo.findAll()); //add the list (now updated) to the model.
		return "redirect:add-book"; //here we want to redirect to the url \add-book so user can go back to the original view after removing a book
		
	}

	
	@GetMapping(value="/edit-book")
	public String editBookGet(ModelMap model,  @RequestParam Long id) {
		Optional<Book> book = repo.findById(id);
		model.addAttribute("book", book); //add the given book to the model
		model.addAttribute("books", repo.findAll());
		return "books";
	}
	
	@PostMapping(value="/edit-book")
	public String editBookPost(ModelMap model, Book book) {
		//Get the edited information from the user
		String title = book.getTitle();
		String author = book.getAuthor();
		int rating= book.getRating();
		Long id = book.getId();
		//Delete the old instance of the book
		repo.deleteById(book.getId());
		//Add the editted instance of the book to repo and model.
		Book editedBook = new Book(title, author, rating, id);
		repo.save(editedBook);
		model.addAttribute("book", editedBook); //add the given book to the model
		
		model.addAttribute("books", repo.findAll());
		return "redirect:add-book";
	}
	
	
	

}

