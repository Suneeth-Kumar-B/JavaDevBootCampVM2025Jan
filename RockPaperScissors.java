import java.util.Scanner;
public class RockPaperScissors {

    static Scanner in = new Scanner(System.in);
    
    static String []choices = {"rock", "paper", "scissors"};

    static String getChoice(){
        return choices[((int)(Math.random()*10))%3];
    }

    static String winner(String userChoice){
        String computer = getChoice();
        System.out.println("Computer chose: "+computer);
        if(computer.equalsIgnoreCase(userChoice))
        return "Tie";
        switch(userChoice){
            case "rock":
                if(computer.equalsIgnoreCase("paper"));
                return "Loss";
            case "paper":
                if(computer.equalsIgnoreCase("scissors"))
                return "Loss";
            case "scissors":
                if(computer.equalsIgnoreCase("rock"))
                return "Loss";
        }
        return "Win";
    }

    static void play(){
        System.out.println("Are you ready? (y/n)");
        char choice = in.next().charAt(0);
        in.nextLine();
        while(choice=='y' || choice=='Y')
        {            
            System.out.println("Great!");
            System.out.println("Rock - Paper - Scissors Shoot!");
            String user = in.nextLine();
            System.out.println("You chose: "+user);
            System.out.println(winner(user));

            System.out.println("Are you ready? (y/n)");
            choice = in.next().charAt(0);
            in.nextLine();
        }
    }
    public static void main(String[] args) {
        play();
    }
}
