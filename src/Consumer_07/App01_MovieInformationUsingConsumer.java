package Consumer_07;

import java.util.ArrayList;

import java.util.function.Consumer;


class Movie{
	String name;
	String hero;
	String heroine;
	
	public Movie(String name,String  hero,String heroine) {
		this.name=name;
		this.hero=hero;
		this.heroine = heroine;
	}
}
public class App01_MovieInformationUsingConsumer {
	
	static void addMovie(ArrayList<Movie> al) {
		al.add(new Movie("Bahubali","Prabhas","Anushka"));
		al.add(new Movie("Rayees","Sharukh","Sunny"));
		al.add(new Movie("Dangal","Ameer","Ritu"));
		al.add(new Movie("Sultan","Salman","Anushka"));
	}
	
	public static void main(String[] args) {
		ArrayList<Movie> al = new ArrayList<Movie>();
		addMovie(al);
			
		Consumer<Movie> C = c->{
			System.out.println("Movie Name : "+c.name);
			System.out.println("Movie Hero : "+c.hero);
			System.out.println("Movie Heroine : "+c.heroine);
			System.out.println();
		};
		
		for(Movie m : al) {
			C.accept(m);
		}
	}
}
