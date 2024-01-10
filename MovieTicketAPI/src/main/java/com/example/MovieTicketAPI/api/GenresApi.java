package com.example.MovieTicketAPI.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicketAPI.business.abstracts.GenresService;
import com.example.MovieTicketAPI.core.DataResult;
import com.example.MovieTicketAPI.entitites.dtos.GenresDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("api/genres")
public class GenresApi  {
    private GenresService genresService;

    @Autowired
    public  GenresApi(GenresService genresService){
        this.genresService = genresService;
    }

    @GetMapping("/getGenres")
    public DataResult<List<GenresDto>> getGenres() {
          return this.genresService.getGenres();
    }
    

}
