//package com.lmansfield.bookwebheroku.user;
//
//import java.util.Objects;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//
//@Entity
//public class Role {
//	@Id
//	Long id;
//	//generate id
//	@SequenceGenerator(
//		name ="user_sequence",
//		sequenceName = "user_sequence",
//		allocationSize = 1
//	)
//	@GeneratedValue(
//		strategy = GenerationType.SEQUENCE, //recommended for postgres
//		generator = "user_sequence"	
//	)
//	String name;
//	
//	//constructors
//	public Role() {};
//	
//	public Role(Long id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	
//	//getters and setters
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	
//	//Override methods
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Role other = (Role) obj;
//		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
//	}
//	
//	
//	
//}
