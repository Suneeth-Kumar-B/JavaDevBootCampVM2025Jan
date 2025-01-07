package TopMovies;
import java.util.Scanner;
public class Store {
    Movie movies[];

    public Store(){
        movies = new Movie[10];
        populate();
    }

    public void populate(){
        int index=0;
        this.setMovie(index++, new Movie("The Shawshank Redemption", "BlueRay", 9.2));
        this.setMovie(index++, new Movie("The Godfather", "BlueRay", 9.1));
        this.setMovie(index++, new Movie("The Godfather: Part II", "DVD", 9.0));
        this.setMovie(index++, new Movie("The Dark Knight", "BlueRay", 9.0));
        this.setMovie(index++, new Movie("Schindler's List", "DVD", 8.9));
        this.setMovie(index++, new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9));
        this.setMovie(index++, new Movie("Pulp Fiction", "DVD", 8.8));
        this.setMovie(index++, new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8));
    }

    public Movie getMovie(int index) {
        return movies[index];
    }

    public void setMovie(int index, Movie movie) {
        movies[index]=movie;
    }

    public static void main(String[] args) {

        Store newStore = new Store();
        newStore.populate();
        
        Scanner in = new Scanner(System.in);

        String choice = "continue";

        while(choice.equalsIgnoreCase("continue")){
            for(Movie movie:newStore.movies){
                if(movie!=null)
                System.out.println(movie);
            }
            System.out.println("\nPlease choose an integer between 0 - 9: ");
            int num = in.nextInt();
            Movie movie = newStore.movies[num];
            System.out.print("Set a new rating for " + movie.getName() + ": ");
            double rating = in.nextDouble();
            movie.setRating(rating);
            System.out.print("To edit another rating, type conintue: ");
            choice = in.next();
        }

        in.close();
    }   
    
}