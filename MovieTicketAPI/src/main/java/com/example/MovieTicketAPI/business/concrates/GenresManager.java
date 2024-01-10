package com.example.MovieTicketAPI.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieTicketAPI.business.abstracts.GenresService;
import com.example.MovieTicketAPI.core.DataResult;
import com.example.MovieTicketAPI.core.SuccessDataResult;
import com.example.MovieTicketAPI.dataAccess.GenresDao;
import com.example.MovieTicketAPI.entitites.dtos.GenresDto;


@Service
public class GenresManager implements GenresService {
   private GenresDao genresDao;

   @Autowired
    public  GenresManager(GenresDao genresDao){
        super();
        this.genresDao = genresDao;
    }

          @Override
     public DataResult<List<GenresDto>> getGenres() {
          return new SuccessDataResult<List<GenresDto>>(this.genresDao.getGenres(),"Data Listed");
     }
          
}
