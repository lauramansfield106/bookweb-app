package com.lmansfield.bookwebheroku.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity 
@Table
public class AppUser {
	@Id
	//generate id
	@SequenceGenerator(
		name ="user_sequence",
		sequenceName = "user_sequence",
		allocationSize = 1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE, //recommended for postgres
		generator = "user_sequence"	
	)
	private Long id;
	
//	@ManyToMany(fetch = FetchType.EAGER) //load all of the roles whenever loading users
//	private Collection<Role> roles = new ArrayList<>();
//	
	
	//other instance vars
	private String userName;
	private String password;
	private boolean active;
	
	
	//Constructors 
	public AppUser() {};
	
	public AppUser(Long id, String userName, String password, boolean active) {

		this.id = id;
		//this.roles = roles;
		this.userName = userName;
		this.password = password;
		this.active = active;
	}
	
	
	//Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
//	public Collection<Role> getRoles() {
//		return roles;
//	}
//	public void setRoles(Collection<Role> roles) {
//		this.roles = roles;
//	}


	//Override methods
	@Override
	public int hashCode() {
		return Objects.hash(active, id, password, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppUser other = (AppUser) obj;
		return active == other.active && Objects.equals(id, other.id) && Objects.equals(password, other.password)
				//&& Objects.equals(roles, other.roles) 
				&& Objects.equals(userName, other.userName);
	}

	
}
