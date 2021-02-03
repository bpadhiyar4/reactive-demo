/**
 * Creator : Bharat Padhiyar
 */

package com.demoreactive.services;

import com.demoreactive.modals.Movie;
import reactor.core.publisher.Mono;

public interface ITVMazeService {

    /**
     * Fetch the movie by name
     * @param name {@link String} movie name which you want to search for.
     * @return {@link Movie}
     */
    Mono<Movie> getMovieByName(String name);
}
