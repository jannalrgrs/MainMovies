package Lab10;

import java.util.ArrayList;

public class Movies {

	
	
	private String movieTitle;
	private String movieGenre;
	
public Movies(String movieTitle, String movieGenre) {//source - generate constructor
		
		super();
		this.movieTitle = movieTitle; 
		this.movieGenre = movieGenre;
	
	}

public String getMovieTitle() { //source generate getters and setters
	return movieTitle;
}
public void setMovieTitle(String movieTitle) {
	this.movieTitle = movieTitle;
}
public String getMovieGenre() {
	return movieGenre;
}
public void setMovieGenre(String movieGenre) {
	this.movieGenre = movieGenre;
}
//public void printMovie {

public int compareTo(Movies movies) {
	// TODO Auto-generated method stub
	return 0;
}

	
}



