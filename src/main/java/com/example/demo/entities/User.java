package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String username;
	private String password;
	private String Adresse;
	private String Tel;
	

	@JoinColumn(name = "idcomments") 
	@JsonIgnore
	@OneToMany
	private Comments comments ;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String username, String password, String adresse, String tel, Comments comments) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		Adresse = adresse;
		Tel = tel;
		this.comments = comments;
	}

	public Comments getComments() {
		return comments;
	}

	public void setComments(Comments comments) {
		this.comments = comments;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", Adresse=" + Adresse
				+ ", Tel=" + Tel + ", comments=" + comments + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}
	
	}
