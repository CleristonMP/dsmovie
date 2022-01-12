package com.cleristonpereira.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleristonpereira.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
