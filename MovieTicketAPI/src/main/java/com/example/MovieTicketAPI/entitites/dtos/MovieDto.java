package com.example.MovieTicketAPI.entitites.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private int id;
    private  String imageUrl;
    private String name;
    private List<String> genres;
}
