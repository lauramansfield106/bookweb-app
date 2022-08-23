package com.lmansfield.bookwebheroku.user.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmansfield.bookwebheroku.user.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
	
	//spring will recognize this method to find the user by username
	//AppUser findByUserName(String userName); 
}
