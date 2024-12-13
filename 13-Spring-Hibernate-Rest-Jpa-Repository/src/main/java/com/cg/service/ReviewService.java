package com.cg.service;

import java.util.List;

import com.cg.exception.ApplicationException;
import com.cg.model.Review;

public interface ReviewService {
	public List<Review>searchReviewByMovieServive(int movieId)throws ApplicationException ;
	public Review addReviewService(int movieId,Review r)throws ApplicationException ;
	public Review readReviewService(int movieId, int reviewId)throws ApplicationException ;
	public void deleteReviewService(int movieId, int reviewId)throws ApplicationException ;
	public Review updateReviewService(int movieId, int reviewId,Review ur)throws ApplicationException ;
	public List<Review> searchmovieByRatingService(int movieId, int rate)throws ApplicationException ;
	public List<Review> allReviewService();
}
