package com.example.MovieTicketAPI.entitites.cocrates;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Entity
@Table(name = "movieincinema")
@AllArgsConstructor
@NoArgsConstructor
public class MovieInCinema {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private  int id;

        @Column(name = "imageurl")
        private  String imageUrl;

         @Column(name = "name")
        private  String name;

          @Column(name = "genres")
        private List<String> genres;

         @Column(name = "year")
        private Integer year;


          @Column(name = "director")
        private  String director;
        

        @Column(name = "runtime")
        private  String runtime;

         @Column(name = "movieinfo")
        private  String movieInfo;
        
         
          
}