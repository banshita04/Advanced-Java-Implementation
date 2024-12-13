package com.cg.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.ApplicationException;
import com.cg.model.Review;
import com.cg.service.ReviewService;

@RestController
@RequestMapping("/movies/reviews")
public class ReviewCatalogue {
	@Autowired
	private ReviewService rv;

	@GetMapping
	public List<Review> allReviews(){
		return rv.allReviewService();
	}
	
	@GetMapping("/{movieId}")
	public List<Review> readAllReviews(@PathVariable("movieId") int mid) throws ApplicationException {
		return rv.searchReviewByMovieServive(mid);
	}

	@PostMapping("/{movieId}")
	public Review postReview(@PathVariable("movieId") int mid, @RequestBody Review r) throws ApplicationException {
		return rv.addReviewService(mid, r);
	}

//	@GetMapping("/{movieId}/{reviewId}")
//	public Review readReview(@PathVariable("movieId") int mid, @PathVariable("reviewId") int rid)
//			throws ApplicationException {
//		return rv.readReviewService(mid, rid);
//	}

	@DeleteMapping("/deletereview/{reviewId}")
	public void deleteReview(@PathVariable("movieId") int mid, @PathVariable("reviewId") int rid)
			throws ApplicationException {
		rv.deleteReviewService(mid, rid);
	}

	@PutMapping("/updatereview/{reviewId}")
	public Review updateReview(@PathVariable("movieId") int mid, @PathVariable("reviewId") int rid,
			@RequestBody Review ur) throws ApplicationException {
		return rv.updateReviewService(mid, rid, ur);
	}

	// url : /search?rate=4
	
//	@GetMapping("/search")
//	public List<Review> searchByRating(@RequestParam("rate") int rate, @PathVariable("movieId") int id)
//			throws ApplicationException {
//		return rv.searchmovieByRatingService(id, rate);
//	}
}
