package com.moviedb.moviecatalogservice;

import io.dekorate.kubernetes.annotation.KubernetesApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@KubernetesApplication
public class MovieCatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieCatalogServiceApplication.class, args);
    }

}
