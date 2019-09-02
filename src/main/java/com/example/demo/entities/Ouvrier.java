package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
@Entity
public class Ouvrier extends User implements Serializable{
 
	private float moyenne;
	public Ouvrier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ouvrier(int id, float moyenne) {
		super();
		
		this.moyenne = moyenne;
	}
	@Override
	public String toString() {
		return "profile [ moyenne=" + moyenne + "]";
	}
	
	public float getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	
}

