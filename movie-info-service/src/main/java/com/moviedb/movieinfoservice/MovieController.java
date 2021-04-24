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
                    .poster("https://upload.wikimedia.org/wikipedia/en/0/00/Iron_Man_poster.jpg")
                    .build(),
            Movie.builder()
                    .id("2")
                    .name("Iron Man II")
                    .poster("https://upload.wikimedia.org/wikipedia/en/e/ed/Iron_Man_2_poster.jpg")
                    .build(),
            Movie.builder()
                    .id("3")
                    .name("Iron Man III")
                    .poster("https://upload.wikimedia.org/wikipedia/en/1/19/Iron_Man_3_poster.jpg")
                    .build(),
            Movie.builder()
                    .id("4")
                    .name("Thor")
                    .poster("https://upload.wikimedia.org/wikipedia/en/f/fc/Thor_poster.jpg")
                    .build(),
            Movie.builder()
                    .id("5")
                    .name("Thor: The Dark World")
                    .poster("https://upload.wikimedia.org/wikipedia/en/7/7f/Thor_The_Dark_World_poster.jpg")
                    .build(),
            Movie.builder()
                    .id("6")
                    .name("Thor: Ragnarok")
                    .poster("https://upload.wikimedia.org/wikipedia/en/7/7d/Thor_Ragnarok_poster.jpg")
                    .build(),
            Movie.builder()
                    .id("7")
                    .name("The Avengers")
                    .poster("https://upload.wikimedia.org/wikipedia/en/8/8a/The_Avengers_%282012_film%29_poster.jpg")
                    .build(),
            Movie.builder()
                    .id("8")
                    .name("Avengers: Age of Ultron")
                    .poster("https://upload.wikimedia.org/wikipedia/en/f/ff/Avengers_Age_of_Ultron_poster.jpg")
                    .build(),
            Movie.builder()
                    .id("9")
                    .name("Avengers: Infinity War")
                    .poster("https://upload.wikimedia.org/wikipedia/en/4/4d/Avengers_Infinity_War_poster.jpg")
                    .build(),
            Movie.builder()
                    .id("10")
                    .name("Avengers: Endgame")
                    .poster("https://upload.wikimedia.org/wikipedia/en/0/0d/Avengers_Endgame_poster.jpg")
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
