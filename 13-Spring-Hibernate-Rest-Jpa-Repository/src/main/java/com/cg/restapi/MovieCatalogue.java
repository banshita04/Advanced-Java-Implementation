package com.cg.restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Movie;
import com.cg.service.MovieService;

@RestController
@RequestMapping("/movies")
//CrossOrigin -> enables api to be accessed by external domains
@CrossOrigin
public class MovieCatalogue {
	
	@Autowired
	private MovieService movieService;
	@PostMapping
	public Movie addMovie(@RequestBody Movie m) {
		return movieService.addNewMovieService(m);
	}
	@GetMapping//XML production does not work in arrays
	public List<Movie> listAllMovies(){
		//call service
		return movieService.allmoviesService();
	}
	
	//produces both xml and json form
	@GetMapping(value="/{movieId}",produces = {"application/json","application/xml"})
	public Movie searchById(@PathVariable("movieId")int mid){
		//call service
		
		return movieService.searchMovieService(mid);
	}
	@GetMapping("/searchbygenre/{genre}")
	public List<Movie> searchByGenre(@PathVariable("genre") String genre){
		return movieService.searchByGenreService(genre);
	}
	@GetMapping("/searchbylanguage/{language}")
	public List<Movie> searchByLanguage(@PathVariable("language") String lang){
		return movieService.searchByLanguageService(lang);
	}
	@PostMapping("/updatemovie/{movieId}")
	public Movie updatemovie(@RequestBody Movie m, @PathVariable("movieId") int movieId) {
		return movieService.updateMovieService(m, movieId);
	}
	@DeleteMapping("/removemovie/{movieId}")
	public void removeMovie(@PathVariable("movieId") int movieId){
		movieService.deleteMovieService(movieId);
	}
}
