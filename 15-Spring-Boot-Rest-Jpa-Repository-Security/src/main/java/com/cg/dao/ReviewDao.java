package com.cg.dao;

import java.util.List;

import com.cg.exception.ApplicationException;
import com.cg.model.Review;

public interface ReviewDao {
	Review addNewReview(Review r,int movieCode) throws ApplicationException;
	Review searchReview(int reviewCode) throws ApplicationException;
	List<Review> allReviewsById(int movieCode);
	List<Review> searchByRatings(float rating);
	List<Review> searchByReviewerName(String name);
	Review updateReview(Review r, int reviewId);
	void deleteReview(int reviewId);
	List<Review> allReviewDao();
}
