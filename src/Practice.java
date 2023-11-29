import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Movie {
    int movieId;
    String movieName;

    Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }
}

public class Practice {
    public static void main(String[] args) {
        // predicate - predicate used to check condition and it will return boolean value
        // predicate provide test method which can take arguments and it have boolean data type
        Predicate<String> p = (name) -> name.length() > 5;
        System.out.println(p.test("ram"));

        // consumer - consumer used to consume provided data it doesn't have any return type and can accept
        // any type of data
        List<Movie> moviesList = Arrays.asList(new Movie(101, "abc"), new Movie(102, "pqr"), new Movie(103, "poi"));
        Consumer<Movie> c = (movie) -> {
            System.out.println(movie.movieId);
            System.out.println(movie.movieName);
            System.out.println();
        };

        for (Movie m : moviesList) {
            c.accept(m);
        }

        // function - function is used to perform some operation it has two data types in it generic one is for
        // the type of data you're providing and second is the type of data you're accepting in response
        Function<String, Integer> fun = (name) -> name.length();
        System.out.println(fun.apply("shubham"));

        // supplier - supplier is used to supply some value it can not take any parameter but can provide any
        // type of data in response
        Supplier<String> sup = () -> {
            String[] s1 = {"ram", "laxman", "bharath", "shatrughan"};
            int idx = (int) (Math.random() * 4);
            return s1[idx];
        };

        // supplier to generate random otp
        Supplier<String> sup1 = ()->{
          String otp = "";
          for(int i=0 ; i<6 ; i++){
              otp += (int)(Math.random() * 10);
          }
          return otp;
        };

        System.out.println(sup.get());
        System.out.println(sup1.get());
        Set<Integer> set = new HashSet<>();

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            
            System.out.println(iterator.next());

        }    }
}
