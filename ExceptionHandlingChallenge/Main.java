package ExceptionHandlingChallenge;

public class Main {
    String name;
    double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.equals(""))
        throw new IllegalArgumentException("Name cannot be null or blank");
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating<0 || rating>10)
        throw new IllegalArgumentException("Rating cannot be less than 0 or greater than 10");
        this.rating = rating;
    }

    public static void main(String[] args) {
        Main m = new Main();
        try{
            m.setName("");            
            System.out.println(m.getName());
            m.setRating(11);
            System.out.println(m.getRating());
        }
        catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        finally{
            System.out.println("Ended");
        }        
    }   
}
