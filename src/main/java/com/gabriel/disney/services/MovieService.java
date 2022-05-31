package com.gabriel.disney.services;

import com.gabriel.disney.entities.Movie;
import com.gabriel.disney.entities.dto.MovieDTO;
import com.gabriel.disney.repository.MovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepository repository;
    private final ModelMapper modelMapper;

    public MovieService(MovieRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public Movie addMovie(MovieDTO movieDto){
        Movie movie = modelMapper.map(movieDto, Movie.class);
        return repository.save(movie);
    }
}
