package database;

import java.awt.Color;

public class Movie {
	
	public int id;
	public String color;
	public String title;
	public int duration;
	public String director_name;
	public String act1;
	public String act2;
	public String act3;
	public String movie_imdb_link;
	public String language;
	public String country;
	public String content_rating;
	public Long title_year;
	public float imdb_score;
	
	public Movie(int id, String color, String title, int duration, String director_name, String act1, String act2
			,String act3, String movie_imdb_link, String language, String country, String content_rating, Long title_year,
			float imdb_score) {
		
		this.id = id;
		this.color = color;
		this.title = title;
		this.duration = duration;
		this.director_name = director_name;
		this.act1 = act1;
		this.act2 = act2;
		this.act3 = act3;
		this.movie_imdb_link = movie_imdb_link;
		this.language = language;
		this.country = country;
		this.content_rating = content_rating;
		this.title_year = title_year;
		this.imdb_score = imdb_score;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public String getAct1() {
		return act1;
	}

	public void setAct1(String act1) {
		this.act1 = act1;
	}

	public String getAct2() {
		return act2;
	}

	public void setAct2(String act2) {
		this.act2 = act2;
	}

	public String getAct3() {
		return act3;
	}

	public void setAct3(String act3) {
		this.act3 = act3;
	}

	public String getMovie_imdb_link() {
		return movie_imdb_link;
	}

	public void setMovie_imdb_link(String movie_imdb_link) {
		this.movie_imdb_link = movie_imdb_link;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContent_rating() {
		return content_rating;
	}

	public void setContent_rating(String content_rating) {
		this.content_rating = content_rating;
	}

	public Long getTitle_year() {
		return title_year;
	}

	public void setTitle_year(Long title_year) {
		this.title_year = title_year;
	}

	public double getImdb_score() {
		return imdb_score;
	}

	public void setImdb_score(float imdb_score) {
		this.imdb_score = imdb_score;
	}
	
	@Override
	public String toString() {
		return id + " " + color + " " + title + " " + duration + " " + director_name + " " + act1 + " "
				+ act2 + " " + act3 + " " + movie_imdb_link + " " + language + " " + country + " " + 
				content_rating + " " + title_year + " " + imdb_score;
		
	}
	

}
