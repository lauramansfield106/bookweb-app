//package com.lmansfield.bookwebheroku.controllers;
//
//import java.net.URI;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.lang.NonNull;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import com.lmansfield.bookwebheroku.services.UserService;
//import com.lmansfield.bookwebheroku.user.AppUser;
////import com.lmansfield.bookwebheroku.user.Role;
//import com.lmansfield.bookwebheroku.user.repo.UserRepository;
//
//@RestController
//@RequestMapping("/api")
//public class UserController {
//
//	//inject the user service
//	private final UserService userService;
//
//	
//	//constructor
//	public UserController(UserService userService) {
//		if(userService == null) throw new  NullPointerException("userService");
//		this.userService = userService;
//	}
//	
//	
//	//Methods 
//	//return list of all users
//	@GetMapping("/users")
//	public ResponseEntity<List<AppUser>> getUsers(){
//		return ResponseEntity.ok().body(userService.getUsers()); //assuming everything went well, calls 200 ok for getUsers
//	}
//	
//	//save a user
//	@PostMapping ("/user/save")
//	public ResponseEntity<AppUser> saveUser(@RequestBody AppUser user){
//		//want to send a 201 to indicate something was created on the server
//		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString()); //gets localhost:8080/api/user/save
//		return ResponseEntity.created(uri).body(userService.saveUser(user)); 
//	}
//	
//	//save a role
//	@PostMapping ("/role/save")
//	public ResponseEntity<String> saveRole(@RequestBody String role){
//		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString()); //gets localhost:8080/api/role/save
//		return ResponseEntity.created(uri).body(role); 
//	}
//	
////	//save a role
////	@PostMapping ("/user/addroll")
////	public ResponseEntity<?> saveRollToUser(@RequestBody AppUser user, @RequestBody String role){
////		//userService.addRoleToUser(form.username, form.rolename);
////		userService.addRoleToUser(user.getUserName(), role);
////		return ResponseEntity.ok().build();
////	}
//	
//	
//	//i dont really understand this //TODO
//	class AddRoleToUserForm {
//		private String username;
//		private String rolename;
//		public String getUsername() {
//			return username;
//		}
//		public void setUsername(String username) {
//			this.username = username;
//		}
//		public String getRolename() {
//			return rolename;
//		}
//		public void setRolename(String rolename) {
//			this.rolename = rolename;
//		}
//		
//	}
//	
//}
