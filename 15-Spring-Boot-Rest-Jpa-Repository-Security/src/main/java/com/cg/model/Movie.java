package com.cg.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Movie {
	@Id
	@Min(value = 1)
	@Max(value = 10000)
	private int movieId;
	@Column(length = 20)
	@NotBlank(message = "Please enter movie name")
	@NotNull(message = "Please enter movie name")
	private String movieName;
	@Column(length = 20)
	@NotBlank(message = "Please enter genre")
	private String genre;
	@Column(length = 20)
	private String language;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate releaseDate;
	
	public Movie(int movieId, String movieName, String genre, String language, LocalDate releasDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
		this.language = language;
		this.releaseDate = releasDate;
	}
	public Movie() {
		super();
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
