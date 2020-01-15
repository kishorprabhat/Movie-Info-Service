package com.example.Movie.Info.Service.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MovieRepo extends CrudRepository<Movie, String>{

}
