package com.example.Movie.Info.Service.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Movie.Info.Service.Model.Movie;
import com.example.Movie.Info.Service.Model.MovieRepo;

@Component
public class DAO {
	@Autowired
	MovieRepo repo;
	
	public String insertMovie(Movie movie) {
		Movie mv = repo.save(movie);
		return "Movie " + mv + " saved";
	}
}
