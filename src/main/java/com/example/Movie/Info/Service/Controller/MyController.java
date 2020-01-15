package com.example.Movie.Info.Service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie.Info.Service.DAO.DAO;
import com.example.Movie.Info.Service.Model.Movie;

@RestController
@RequestMapping("/movies")
public class MyController {
	@Autowired
	DAO dao;
	@RequestMapping("/register")
	public String setMovieInfo(String name, String release, String category, String language) {
		Movie movie = new Movie();
		movie.setName(name);
		movie.setRelease(release);
		movie.setCategory(category);
		movie.setLanguage(language);
		
		return dao.insertMovie(movie);
	}
}
