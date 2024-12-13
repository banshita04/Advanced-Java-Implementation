
package com.cg.SpringHibernateRestApi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.dao.MovieDao;
import com.cg.model.Movie;
import com.cg.service.MovieService;
@SpringBootTest
public class MovieServiceTest {
	@Autowired
	private MovieService movieService;
	@MockBean 
	private MovieDao movieDao;   
	static  List<Movie>  mockMovies;
	@BeforeAll
	public static void initMockMovies() {
		Movie m1= new Movie(1,"Inception","SciFi","ENG",LocalDate.now());
		Movie m2= new Movie(2,"Fast And Furious","Action","ENG",LocalDate.now());
		Movie m3= new Movie(3,"Jurasic World","SCIFI","ENG",LocalDate.now());
		Movie m4= new Movie(4,"Harry Potter","Fantancy","ENG",LocalDate.now());
		Movie m5= new Movie(5,"Money Heist","Action","ENG",LocalDate.now());
		Movie m6= new Movie(6,"John Wick","Action","ENG",LocalDate.now());
		mockMovies=Arrays.asList(m1,m2,m3,m4,m5,m6);    	
	}
	@Test
	public void testAllMoviesService() {
		when(movieDao.findAll()).thenReturn(mockMovies);
		List<Movie> movies =  movieService.allmoviesService();
		assertEquals(movies.size(),mockMovies.size());

	}
}