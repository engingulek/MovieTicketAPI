package com.example.MovieTicketAPI.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieTicketAPI.business.abstracts.MovieService;
import com.example.MovieTicketAPI.core.DataResult;
import com.example.MovieTicketAPI.core.SuccessDataResult;
import com.example.MovieTicketAPI.dataAccess.GenresDao;
import com.example.MovieTicketAPI.dataAccess.MovieInCinemaDao;
import com.example.MovieTicketAPI.entitites.dtos.MovieDto;

@Service
public class MovieManager implements MovieService {
   public MovieInCinemaDao movieInCinemaDao;

   @Autowired
    public  MovieManager (MovieInCinemaDao movieInCinemaDao){
        super();
        this.movieInCinemaDao = movieInCinemaDao;
    }

@Override
public DataResult<List<MovieDto>> getMovieInCinema() {
  return new SuccessDataResult<List<MovieDto>>(this.movieInCinemaDao.getMoviewInCinema(),"Data Listed");
}


public DataResult<List<MovieDto>> getFutureMovie() {
return new SuccessDataResult<List<MovieDto>>(this.movieInCinemaDao.getFutureCinema(),"Data Listed");

}
}
