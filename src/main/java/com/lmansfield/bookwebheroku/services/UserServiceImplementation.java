//package com.lmansfield.bookwebheroku.services;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.lmansfield.bookwebheroku.user.AppUser;
////import com.lmansfield.bookwebheroku.user.Role;
//import com.lmansfield.bookwebheroku.user.repo.UserRepository;
//
//@Service 
//@Transactional //changes to the DB don't persist unless the method executes without exception. transaction = all or nothing
//public class UserServiceImplementation implements UserService{
//	
//	@Autowired //it's important to autowire the repos in the service. 
//	private final UserRepository userRepo = null;
////	@Autowired 
////	private final RoleRepository roleRepo = null;
////	
//	
//	@Override
//	public AppUser saveUser(AppUser user) {
//		return userRepo.save(user);
//	}
//
////	@Override
////	public Role saveRole(Role role) {
////		return roleRepo.save(role); 
////	}
////
////	@Override
////	public void addRoleToUser(String username, String rolename) {
////		AppUser user = userRepo.findByUserName(username);
////		Role role = roleRepo.findByName(rolename);
////		user.getRoles().add(role); // the transactional annotation will save this information in the database
////	}
//
////	@Override
////	public AppUser getUser(String username) {
////		return userRepo.findByUserName(username);
////	}
//
//	@Override
//	public List<AppUser> getUsers() {
//		return userRepo.findAll();
//	}
//
//}
