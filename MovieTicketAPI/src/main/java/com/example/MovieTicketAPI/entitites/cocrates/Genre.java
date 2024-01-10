package com.example.MovieTicketAPI.entitites.cocrates;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "genres")
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "name")
    private  String name;
}
