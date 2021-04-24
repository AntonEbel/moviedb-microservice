package com.moviedb.movieinfoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/v1/movies")
public class MovieController {

    List<Movie> movies = List.of(
            Movie.builder()
                    .id("1")
                    .name("Iron Man")
                    .images(List.of(
                            "https://film-grab.com/2014/12/08/iron-man/#bwg988/61135"
                    ))
                    .build(),
            Movie.builder()
                    .id("2")
                    .name("Iron Man II")
                    .images(List.of(
                            "https://film-grab.com/2014/12/22/iron-man-2/#bwg989/61241"
                    ))
                    .build()
    );

    @GetMapping("/top")
    private Flux<Movie> getAllMovies() {
        return Flux.fromIterable(movies);
    }

    @GetMapping("/search")
    private Flux<Movie> getMoviesByIds(@RequestBody MovieSearchQuery movieSearchQuery) {
        return Flux.fromStream(movies.stream()
                .filter(movie -> movieSearchQuery.getMovieIds().contains(movie.getId())));
    }
}
