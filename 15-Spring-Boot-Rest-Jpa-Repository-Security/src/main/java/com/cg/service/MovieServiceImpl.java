package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.dao.MovieDao;
import com.cg.model.Movie;

import jakarta.transaction.Transactional;
@Component
@Transactional
public class MovieServiceImpl implements MovieService{
	@Autowired
	public MovieDao movieDao;
	@Override
	public Movie addNewMovieService(Movie m) {
		
		return movieDao.save(m);
	}

	@Override
	public Movie searchMovieService(int movieCode) {
		// TODO Auto-generated method stub
		return movieDao.findById(movieCode).orElseThrow(()->new RuntimeException());
	}

	@Override
	public List<Movie> allmoviesService() {
		// TODO Auto-generated method stub
		return movieDao.findAll();
	}

	@Override
	public List<Movie> searchByGenreService(String genre) {
		// TODO Auto-generated method stub
		return movieDao.searchByGenre(genre);
	}

	@Override
	public List<Movie> searchByLanguageService(String language) {
		// TODO Auto-generated method stub
		return movieDao.findByLanguage(language);
	}

	@Override
	public Movie updateMovieService(Movie m, int movieId) {
		// TODO Auto-generated method stub
		return movieDao.save(m);
	}

	@Override
	public void deleteMovieService(int movieId) {
		// TODO Auto-generated method stub
		
		movieDao.deleteById(movieId);
	}

}
