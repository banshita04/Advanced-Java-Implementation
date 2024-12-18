package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.ReviewDao;
import com.cg.exception.ApplicationException;
import com.cg.model.Review;

import jakarta.transaction.Transactional;
@Transactional
@Component
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	public ReviewDao reviewdao;
	@Override
	public Review addNewReviewService(Review r, int movieCode)throws ApplicationException {
		// TODO Auto-generated method stub
		
		return reviewdao.addNewReview(r, movieCode);
	}

	@Override
	public Review searchReview(int movieId)throws ApplicationException {
		// TODO Auto-generated method stub
		return reviewdao.searchReview(movieId);
	}

	@Override
	public List<Review> allReviewsById(int movieCode) {
		// TODO Auto-generated method stub
		return reviewdao.allReviewsById(movieCode);
	}

	@Override
	public List<Review> searchByRatings(float rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> searchByReviewerName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review updateReview(Review r, int reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReview(int reviewId) {
		// TODO Auto-generated method stub
		
	}

	public List<Review> allReviewService(){
		return reviewdao.allReviewDao();
	}

	

}
