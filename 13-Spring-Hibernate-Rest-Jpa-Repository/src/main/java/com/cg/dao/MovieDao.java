package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.model.Movie;

@Repository
//interface to interface extends
public interface MovieDao extends JpaRepository<Movie,Integer> {
	//Movie addNewMovie(Movie m);
	//Movie searchMovie(int movieCode);
	//List<Movie> searchAllMovies();
	@Query(name="Select m from Movie m where m.genre=:addr")
	List<Movie> searchByGenre(@Param("addr") String genre);
	List<Movie> findByLanguage(String language);
//	Movie updateMovie(Movie m, int movieId);
	//void deleteMovie(int movieId);
}
