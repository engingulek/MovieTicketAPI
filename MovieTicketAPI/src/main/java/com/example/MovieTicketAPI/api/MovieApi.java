package com.example.MovieTicketAPI.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicketAPI.business.abstracts.GenresService;
import com.example.MovieTicketAPI.business.abstracts.MovieService;
import com.example.MovieTicketAPI.core.DataResult;
import com.example.MovieTicketAPI.entitites.dtos.MovieDto;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/movie")
public class MovieApi {
   private MovieService movieService;

     @Autowired
    public  MovieApi(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/movieInCinema")
    public DataResult<List<MovieDto>> getMovieInCinema(){
          return this.movieService.getMovieInCinema();
    }

    @GetMapping("/futureMovie")
    public DataResult<List<MovieDto>> futureMovie(){
          return this.movieService.getFutureMovie();
    }
}
