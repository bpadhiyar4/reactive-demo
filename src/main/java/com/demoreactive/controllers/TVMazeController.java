package com.demoreactive.controllers;

import com.demoreactive.modals.Movie;
import com.demoreactive.services.TVMazeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/tvmaze")
public class TVMazeController {

    @Autowired
    private TVMazeService tvMazeService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Movie> getMovieById(@RequestParam("name") String name) {
        return tvMazeService.getMovieByName(name);
    }
}
