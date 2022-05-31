package com.gabriel.disney.controller;

import com.gabriel.disney.entities.Movie;
import com.gabriel.disney.entities.dto.MovieDTO;
import com.gabriel.disney.services.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> addMovie(@RequestBody MovieDTO movieDTO){
        return new ResponseEntity<>(service.addMovie(movieDTO), HttpStatus.CREATED);
    }
}
