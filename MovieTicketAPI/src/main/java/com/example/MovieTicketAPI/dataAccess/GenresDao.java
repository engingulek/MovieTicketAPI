package com.example.MovieTicketAPI.dataAccess;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.MovieTicketAPI.entitites.cocrates.Genre;
import com.example.MovieTicketAPI.entitites.dtos.GenresDto;

public interface GenresDao extends JpaRepository<Genre,Integer> {
    @Query(value = "Select new com.example.MovieTicketAPI.entitites.dtos.GenresDto(g.id,g.name) From Genre as g")
    List<GenresDto> getGenres();
          
}