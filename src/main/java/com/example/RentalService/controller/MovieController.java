package com.example.RentalService.controller;

import com.example.RentalService.Model.MovieModel;
import com.example.RentalService.RestTemplateClass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final RestTemplateClass restTemplateClass;

    public MovieController(RestTemplateClass restTemplateClass) {
        this.restTemplateClass = restTemplateClass;
    }


    @GetMapping("/rental")
    public MovieModel returnMovieById(Integer id){
        final String url = "http://localhost:8080/movie";
        return restTemplateClass.restTemplate().getForObject(url + "/5", MovieModel.class);
    }
}
