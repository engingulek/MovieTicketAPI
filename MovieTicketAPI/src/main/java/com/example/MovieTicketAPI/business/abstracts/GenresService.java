package com.example.MovieTicketAPI.business.abstracts;

import java.util.List;

import com.example.MovieTicketAPI.core.DataResult;
import com.example.MovieTicketAPI.entitites.dtos.GenresDto;

public interface GenresService {
   DataResult<List<GenresDto>> getGenres();
}