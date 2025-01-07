import java.util.Scanner;

public class HangMan {

    public static Scanner in = new Scanner(System.in);

    private static String[] words = {
        "ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf", "wombat", "zebra"
    };

    public static String[] gallows = {
        "+---+\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +   //if the user didn't miss any guesses.
        "    |\n" +
        "    |\n" +
        "=========\n",
    
        "+---+\n" +
        "|   |\n" +
        "O   |\n" +   //if the user missed one guess.
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",
    
        "+---+\n" +
        "|   |\n" +
        "O   |\n" +    //if the user missed two guesses.
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",
    
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +   //if the user missed three guesses.
        "/|   |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",
    
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n"+   //if the user missed four guesses.
        "     |\n" +
        "     |\n" +
        " =========\n",
    
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +  //if the user missed five guesses.
        "/    |\n" +
        "     |\n" +
        " =========\n",
    
        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +   //if the user missed six guesses.
        "/ \\  |\n" +
        "     |\n" +
        " =========\n"};

    private static int misses = 0;
    private static String word = words[(int) (Math.random() * words.length)];
    public static StringBuilder res = new StringBuilder();

    static {
        for (int i = 0; i < word.length(); i++) {
            res.append("-");
        }
    }

    public static StringBuilder guess = new StringBuilder();

    static void play() {
        while (true) {
            System.out.println(gallows[misses]);
            System.out.println("Word: " + res);
            System.out.println("Guess: " + guess);
    
            System.out.print("Enter your guess: ");
            char characterGuessedByUser = in.next().charAt(0);
    
            int ind = word.indexOf(characterGuessedByUser, res.toString().indexOf(characterGuessedByUser) + 1);
            if (ind != -1) {
                res.setCharAt(ind, characterGuessedByUser);
            } else {
                misses++;
            }
    
            guess.append(characterGuessedByUser);
    
            if (misses > 6) {
                System.out.println("Game Over! You've been hanged.\nThe word is "+word );
                break;
            }
    
            if (word.equals(res.toString())) {
                System.out.println("Congratulations! You've guessed the word: " + word);
                break;
            }
        }
    }   

    public static void main(String[] args) {
        play();
    }
}