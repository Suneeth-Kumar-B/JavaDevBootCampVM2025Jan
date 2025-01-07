import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Java Chatbot");
        System.out.println("Hello. What is your name?");
        String name = in.nextLine();
        System.out.println("Hi "+name+"!, I'm Javabot. Where are you from?");
        String place = in.nextLine();
        System.out.println("I hear it's beautiful at "+place+"! I'm from place called Oracle");
        System.out.println("How ols are you?");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("So you're "+age+", cool! I'm 400 years old.\nThis means I'm "+400/age+" times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        String language = in.nextLine();
        if(language.equalsIgnoreCase("python"))
        System.out.println("Oopsie! ");
        else
        System.out.println(language+", fair enough!");
        System.out.println("How many years you have been coding in "+language);
        int n = in.nextInt();
        System.out.println(n+" years eh? That's great keep it up!");
        System.out.println("Nice chatting with you "+name+". I have to log off now. See ya!");
        in.close();
    }
}
