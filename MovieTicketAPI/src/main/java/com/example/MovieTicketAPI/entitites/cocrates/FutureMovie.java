

package com.example.MovieTicketAPI.entitites.cocrates;

import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "futuremovie")
@AllArgsConstructor
@NoArgsConstructor
public class FutureMovie {
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