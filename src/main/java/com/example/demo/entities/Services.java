package com.example.demo.entities;
import javax.persistence.*;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
@Entity
public class Services implements Serializable {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titre;
	private String description;
	private String price;
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(int id, String titre, String description, String price) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Services [id=" + id + ", titre=" + titre + ", description=" + description + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
