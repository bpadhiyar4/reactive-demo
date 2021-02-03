package com.demoreactive.services;

import com.demoreactive.modals.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service()
@Slf4j
public class TVMazeService implements ITVMazeService {

    @Value("${movie.api}")
    private String apiValue;

    @Override
    public Mono<Movie> getMovieByName(String name) {
        return WebClient.create(apiValue).get().uri(uriBuilder -> uriBuilder.path("singlesearch/shows").queryParam("q", name).build())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Movie.class)
                .doOnSuccess(movie -> log.info("Object fetched : " + movie.toString()))
                .doOnError(throwable -> log.error("Movie : " + name + " Not found" , throwable))
                .onErrorReturn(new Movie())
                .retry(2);
    }
}
