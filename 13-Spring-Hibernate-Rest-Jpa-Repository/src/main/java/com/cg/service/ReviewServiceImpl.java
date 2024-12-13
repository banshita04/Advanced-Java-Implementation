package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.ReviewDao;
import com.cg.exception.ApplicationException;
import com.cg.model.Movie;
import com.cg.model.Review;

import jakarta.transaction.Transactional;
@Component
@Transactional
public class ReviewServiceImpl implements ReviewService {
	@Autowired
private ReviewDao reviewDao;

	
	public List<Review> searchReviewByMovieServive(int movieId) throws ApplicationException {
		
		return reviewDao.searchReviewByMovie(movieId);
	}
	
	public List<Review> allReviewService() {
		return reviewDao.allReview();
	}

	
	public Review addReviewService(int movieId, Review r) throws ApplicationException {
		
		return reviewDao.addReview(movieId, r);
	}

	
	public Review readReviewService(int movieId, int reviewId)throws ApplicationException  {
		
		return reviewDao.readReview(movieId, reviewId);
	}

	
	public void deleteReviewService(int movieId, int reviewId)throws ApplicationException  {
		
		reviewDao.deleteReview(movieId, reviewId);
	}

	
	public Review updateReviewService(int movieId, int reviewId,Review ur) throws ApplicationException {
		
		return reviewDao.updateReview(movieId, reviewId,ur);
	}

	
	public List<Review> searchmovieByRatingService(int movieId, int rate) throws ApplicationException {
		
		return reviewDao.searchmovieByRating(movieId,rate);
	}
	
	
}
