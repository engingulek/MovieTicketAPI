package com.example.MovieTicketAPI.business.abstracts;

import java.util.List;

import com.example.MovieTicketAPI.core.DataResult;
import com.example.MovieTicketAPI.entitites.dtos.MovieDto;

public interface MovieService {
   DataResult<List<MovieDto>> getMovieInCinema();
    DataResult<List<MovieDto>> getFutureMovie();  
}
