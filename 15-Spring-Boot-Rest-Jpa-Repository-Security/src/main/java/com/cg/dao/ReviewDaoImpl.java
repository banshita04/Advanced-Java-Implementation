package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.exception.ApplicationException;
import com.cg.model.Movie;
import com.cg.model.Review;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
@Component
public class ReviewDaoImpl implements ReviewDao {
	@PersistenceContext
	public EntityManager em;

	@Override
	public Review addNewReview(Review r, int movieCode)throws ApplicationException {
		// TODO Auto-generated method stub
		//Movie movie = em.find(Movie.class, movieCode);
		//if(movie!=null) {
			//System.out.println("Movie Object is there");
		    Movie movie = em.find(Movie.class, movieCode);
		    r.setMovie(movie);
		    //em.getTransaction().begin();
		    em.persist(r);
		   // em.getTransaction().commit();
		    //System.out.println(r.getReviewerName());
		    return r;
//			r.setMovie(movie);
//			em.persist(r);
//			System.out.println(r.getReviewerName());
//			return r;
//		}else
//			throw new ApplicationException("Invalid movie id");
	}

	@Override
	public Review searchReview(int reviewCode)throws ApplicationException {
		// TODO Auto-generated method stub
		Review review = em.find(Review.class, reviewCode);
		if(review!=null) {
			return review;
		}else 
			throw new ApplicationException("Invalid review code");
	}

	@Override
	public List<Review> allReviewsById(int movieCode) {
		// TODO Auto-generated method stub
		String jpql = "Select r from Review r where r.movie.movieId=:addr";
		TypedQuery<Review> q = em.createQuery(jpql,Review.class);
		q.setParameter("addr", movieCode);
		List<Review> reviewList = q.getResultList();
		return reviewList;
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

	@Override
	public List<Review> allReviewDao() {
		String jpql = "Select r from Review r";
		TypedQuery<Review> q = em.createQuery(jpql,Review.class);
		List<Review> reviewList = q.getResultList();
		return reviewList;
		
	}

}
