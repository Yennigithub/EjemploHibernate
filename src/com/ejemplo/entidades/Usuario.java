package com.ejemplo.entidades;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")

public class Usuario {
	
	@Id
	@Column(name ="userId")
	
	private int userID;
	
	@Column(name ="username")
	private String username;
	
	@Column(name ="password")
	private String password;
	
	public Usuario(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [userID=" + userID + ", username=" + username + ", password=" + password + "]";
	}}

	
	

