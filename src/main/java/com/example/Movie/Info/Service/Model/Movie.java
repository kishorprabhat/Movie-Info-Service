package com.example.Movie.Info.Service.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private String name;
	private String release;
	private String category;
	private String language;
		
	public Movie() {
		super();
	}

	public Movie(String name, String release, String category, String language) {
		super();
		this.name = name;
		this.release = release;
		this.category = category;
		this.language = language;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
