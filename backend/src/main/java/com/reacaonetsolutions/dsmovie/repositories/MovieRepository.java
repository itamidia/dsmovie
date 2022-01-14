package com.reacaonetsolutions.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reacaonetsolutions.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
