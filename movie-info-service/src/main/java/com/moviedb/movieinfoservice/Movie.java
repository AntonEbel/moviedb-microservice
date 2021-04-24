package com.moviedb.movieinfoservice;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {
    @NonNull private String id;
    @NonNull private String name;
}
