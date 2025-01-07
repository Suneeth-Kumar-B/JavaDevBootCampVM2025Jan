import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Which country held the 2016 olympics");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy");
        int points = 0;
        char q1 = in.next().charAt(0);
        points+=q1=='c'?10:0;
        System.out.println("2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Sturn\n\tc) Mercury\n\td) Mars");
        char q2 = in.next().charAt(0);        
        points+=q2=='a'?10:0;
        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-");
        char q3 = in.next().charAt(0);        
        points+=q3=='d'?10:0;
        System.out.println("4. Which of these characters are friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy");
        char q4 = in.next().charAt(0);        
        points+=q4=='a'?10:0;

        System.out.println("Your final score is: "+points);


        if(points==40)
        System.out.println("Wow! You know your stuff.");
        else if(points>=20)
        System.out.println("Good Job! Keep it up.");
        else
        System.out.println("Better luck next time");
        in.close();
    }
}
