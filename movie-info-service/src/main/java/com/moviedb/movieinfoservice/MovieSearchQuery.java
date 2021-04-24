package com.moviedb.movieinfoservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieSearchQuery {
    @NonNull private List<String> movieIds;
}
