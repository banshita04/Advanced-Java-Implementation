package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.exception.ApplicationException;
import com.cg.model.Review;

@Repository
public interface ReviewDao extends JpaRepository<Review, Integer> {
	public List<Review>searchReviewByMovie(int movieId)throws ApplicationException ;
	public Review addReview(int movieId,Review r)throws ApplicationException ;
	public Review readReview(int movieId, int reviewId)throws ApplicationException ;
	public void deleteReview(int movieId, int reviewId)throws ApplicationException ;
	public Review updateReview(int movieId, int reviewId,Review r)throws ApplicationException ;
	public List<Review> searchmovieByRating(int movieId, int rate)throws ApplicationException ;
	public List<Review> allReview();
}
