package com.lmansfield.bookwebheroku.book.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmansfield.bookwebheroku.book.Book;

@Repository //data access layer
public interface BookRepository extends JpaRepository<Book, Long>{
	

}
