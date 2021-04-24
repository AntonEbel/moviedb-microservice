package com.moviedb.movieinfoservice;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {
    @NonNull private String id;
    @NonNull private String name;
    @NonNull private String poster;
}
