package com.example.MovieTicketAPI.dataAccess;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.MovieTicketAPI.entitites.cocrates.FutureMovie;
import com.example.MovieTicketAPI.entitites.cocrates.MovieInCinema;
import com.example.MovieTicketAPI.entitites.dtos.MovieDto;

/**
 * MovieInCinemaDao
 */
public interface MovieInCinemaDao extends JpaRepository<MovieInCinema,Integer>  {
@Query(value = "Select new com.example.MovieTicketAPI.entitites.dtos.MovieDto(m.id,m.imageUrl,m.name,m.genres) From MovieInCinema as m")
List<MovieDto> getMoviewInCinema();


@Query(value = "Select new com.example.MovieTicketAPI.entitites.dtos.MovieDto(fm.id,fm.imageUrl,fm.name,fm.genres) From FutureMovie as fm")
List<MovieDto> getFutureCinema();
          
}
