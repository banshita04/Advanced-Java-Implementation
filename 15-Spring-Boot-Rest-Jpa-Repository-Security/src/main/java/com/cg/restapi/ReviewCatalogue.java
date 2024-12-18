package com.cg.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.ApplicationException;
import com.cg.model.Review;
import com.cg.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewCatalogue {
	@Autowired
	public ReviewService reviewService;
	
	@PostMapping("/addreview/{movieId}")
	public Review addNewReview(@PathVariable("movieId") int movieCode,
			@RequestBody Review r)throws ApplicationException {
		return reviewService.addNewReviewService(r, movieCode);
	}
	
	@GetMapping("/searchbymovieid/{movieId}")
	public List<Review> allReviewsById(@PathVariable int movieId) throws ApplicationException{
		return reviewService.allReviewsById(movieId); 
	}
	
	@GetMapping("/searchbyreviewid/{reviewId}")
	public Review searchByReviewId(@PathVariable("reviewId") int reviewId) {
		return null;
	}
	
	@GetMapping("/allreviews")
	public List<Review> allReviews(){
		return reviewService.allReviewService();
	}
	
}
