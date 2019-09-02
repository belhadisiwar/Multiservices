package com.example.demo.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Comments implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
	private List<User> users = new ArrayList<User>();



	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comments(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Comments [id=" + id + ", users=" + users + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Comments(int id, List<User> users) {
		super();
		this.id = id;
		this.users = users;
	}
	
}
