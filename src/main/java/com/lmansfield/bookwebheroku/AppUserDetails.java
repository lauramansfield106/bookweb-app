//package com.lmansfield.bookwebheroku;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.lmansfield.bookwebheroku.user.AppUser;
//
//public class AppUserDetails implements UserDetails {
//
//	private String userName;
//	private String password;
//	private boolean active;
//	private List<GrantedAuthority> authorities;
//	
//	//constructors
//	public AppUserDetails() {};
//	
//	public AppUserDetails(String userName){
//		this.userName = userName;
//	}
//	
//	public AppUserDetails(AppUser user) {
//		this.userName = user.getUserName();
//		this.password = user.getPassword();
//		this.active = user.isActive();
//		//TODO
////		this.authorities = Arrays.stream(user.getRoles().split(","))
////				.map(SimpleGrantedAuthority::new)
////				.collect(Collectors.toList());
//	}
//	
//	//Methods
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return authorities;
//	}
//
//	@Override
//	public String getPassword() {
//		return password;
//	}
//
//	@Override
//	public String getUsername() {
//		return userName;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return active;
//	}
//
//}
