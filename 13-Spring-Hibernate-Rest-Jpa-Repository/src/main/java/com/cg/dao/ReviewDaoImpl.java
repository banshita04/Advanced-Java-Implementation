package com.cg.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Component;

import com.cg.exception.ApplicationException;
import com.cg.model.Movie;
import com.cg.model.Review;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
@Component
public class ReviewDaoImpl implements ReviewDao{
	@PersistenceContext
	private EntityManager em;
	public List<Review> searchReviewByMovie(int movieId) throws ApplicationException {
		Movie m = em.find(Movie.class, movieId);
		if(m==null)
		{
			throw new ApplicationException("movie not found for code "+movieId);
		}
		else
		{
			String s = "select r from Review r where r.movie=:me";
			Query q = em.createQuery(s);
			q.setParameter("me", m);
			return q.getResultList();
		}
		
	}

	public Review addReview(int movieId, Review r) throws ApplicationException {
		Movie m = em.find(Movie.class, movieId);
		if(m==null)
		{
			throw new ApplicationException("movie for code="+movieId+" not found");
		}
		else
		{
			r.setMovie(m);
			em.persist(r);
			return r;
		}
	}

	public Review readReview(int movieId, int reviewId) throws ApplicationException {
		Movie m = em.find(Movie.class, movieId);
		if(m!=null)
		{
			Review r = em.find(Review.class, reviewId);
			if(r==null)
			{
				throw new ApplicationException("Review not found for code "+reviewId);
			}
			else
				return r;
		}
		else
		{
			throw new ApplicationException("Movie not found for code "+movieId);
		}
	}

	
	public void deleteReview(int movieId, int reviewId) throws ApplicationException {
		Movie m = em.find(Movie.class, movieId);
		if(m!=null)
		{
			Review r = em.find(Review.class, reviewId);
			if(r==null)
			{
				throw new ApplicationException("Review not found for code "+reviewId);
			}
			else
			{
				em.remove(r);
			}
		}
		else
		{
			throw new ApplicationException("Movie not found for code "+movieId);
		}
	}

	
	public Review updateReview(int movieId, int reviewId, Review ur) throws ApplicationException {
		
		Movie m = em.find(Movie.class, movieId);
		if(m!=null)
		{
			Review r = em.find(Review.class, reviewId);
			if(r==null)
			{
				throw new ApplicationException("Review not found for code "+reviewId);
			}
			else
			{
			    r.setReviewerName(ur.getReviewerName());
			    r.setReview(ur.getReview());
			    r.setRating(ur.getRating());
			    r.setMovie(m);
			    return r;
			}
		}
		else
		{
			throw new ApplicationException("Movie not found for code "+movieId);
		}
	}

	
	public List<Review> searchmovieByRating(int movieId, int rate)throws ApplicationException {
		Movie m = em.find(Movie.class, movieId);
		if(m==null)
		{
			throw new ApplicationException("Movie not found for code "+movieId);
		}
		else
		{
			String s = "select r from Review r where r.movie=:mo and r.rating>:rate";
			Query q = em.createQuery(s);
			q.setParameter("mo", m);
			q.setParameter("rate", rate);
			return q.getResultList();
		}
	}

	public List<Review> allReview() {
		// TODO Auto-generated method stub
		String s = "select r from Review r";
		Query q = em.createQuery(s);
		
		return q.getResultList();
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Review> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Review> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Review> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Review getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Review> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Review> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Review> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Review> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Review> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Review entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Review> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Review> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Review> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Review> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Review> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Review> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Review> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Review, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
