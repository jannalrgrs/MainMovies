package Lab10;
//Tommy Thurman and Janna Rogers
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainMovie {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";

		System.out.println("Welcome to the Movie List App! ");

		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("There are 10 movies in this list, what genre are you interested in?");

			ArrayList<Movies> list = new ArrayList();
			// list.add(new Movies ("movieTitle", "movieGenre")); - Generate the ArrayList

			list.add(new Movies("Batman", "scifi"));
			list.add(new Movies("Harry Potter", "drama"));
			list.add(new Movies("Tarzan", "drama"));
			list.add(new Movies("It", "horror"));
			list.add(new Movies("Girl On A Train", "drama"));
			list.add(new Movies("Ice Age", "animated"));
			list.add(new Movies("The Lion King", "animated"));
			list.add(new Movies("Star Wars", "scifi"));
			list.add(new Movies("Rat Race", "horror"));
			list.add(new Movies("Star Trek", "scifi"));
			list.add(new Movies("The Notebook", "drama"));
	
		
			String movieChoice = scan1.nextLine();

	

			for (int i = 0; i < list.size(); i++) {

				if (movieChoice.equalsIgnoreCase(list.get(i).getMovieGenre())) {
					System.out.println(list.get(i).getMovieTitle());

				}
	
			}

			System.out.println("Excellent choice! Would you like to choose another? (Yes/no)");
			choice = scan1.nextLine();
		}
}
	}


