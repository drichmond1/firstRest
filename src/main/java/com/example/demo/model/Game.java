package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Games")
public class Game {
	@Id
	private int id;
	private String name;
	private double price;
	private int stars;
	
	public String getName() {
		return name;
	}
	public Game(){}
	
	public Game(int id,String name, double price,int star) {
		super();
		this.id=id;
		this.name = name;
		this.price = price;
		this.stars=star;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}

}
