package com.moviedb.movieinfoservice;

import io.dekorate.kubernetes.annotation.KubernetesApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@KubernetesApplication
public class MovieInfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieInfoServiceApplication.class, args);
    }
}
