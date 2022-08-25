package com.lmansfield.bookwebheroku;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import com.lmansfield.bookwebheroku.book.Book;
import com.lmansfield.bookwebheroku.book.repo.BookRepository;
import com.lmansfield.bookwebheroku.user.AppUser;
import com.lmansfield.bookwebheroku.user.repo.UserRepository;


//import com.lmansfield.bookwebheroku.user.Role;


@SpringBootApplication
@RestController
public class BookwebHerokuApplication extends SpringBootServletInitializer{
	@Autowired
	private BookRepository bookRepo;
	@Autowired
	private UserRepository userRepo;
	
	@PostConstruct
	public void addDataToDataBase() {
		AppUser user1 = new AppUser(1L, "lollie1", "123", true);
		AppUser user2 = new AppUser(2L, "lollie2", "123", true);
		userRepo.save(user1);
		userRepo.save(user2);
		bookRepo.save(new Book("A Tree Grows in Brooklyn", "Betty Smith", 5, 0L));
	}

//	@Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(BookwebHerokuApplication.class);
//    }


	
	public static void main(String[] args) {
		SpringApplication.run(BookwebHerokuApplication.class, args);
	}
	
	
}

