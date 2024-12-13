package com.cg.service;

import java.util.List;

import com.cg.exception.ApplicationException;
import com.cg.model.Review;

public interface ReviewService {
	Review addNewReviewService(Review r,int movieCode) throws ApplicationException;
	Review searchReview(int reviewCode) throws ApplicationException;
	List<Review> allReviewsById(int movieCode) throws ApplicationException;
	List<Review> searchByRatings(float rating) throws ApplicationException;
	List<Review> searchByReviewerName(String name) throws ApplicationException;
	Review updateReview(Review r, int reviewId) throws ApplicationException;
	void deleteReview(int reviewId) throws ApplicationException;
	List<Review> allReviewService();
}
