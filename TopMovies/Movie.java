package TopMovies;

public class Movie {
    private String name;
    private String format;
    private double rating;

    public Movie(Movie movie){
        this.name=movie.name;
        this.format=movie.format;
        this.rating=movie.rating;
    }
    
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public String getFormat() {
        return format;
    }
    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }     
}
