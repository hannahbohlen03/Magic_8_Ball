import java.util.Scanner;

public class Magic_8_Ball {
    public static void main(String[]args){

        //Declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number;

        //Initializing
        System.out.println(" ");
        System.out.println("Think of your question. Think really hard.");
        System.out.println("Now, pick a number from 0-200.");
        number = keyboard.nextInt();

        if (number == 0){
            System.out.println("Zero is such an unlucky number.. Try again later.");
        }
        else if (number < 10){
            System.out.println("The outcome is not looking good...");
        }
        else if (number < 20){
            System.out.println("Go for it!");
        }
        else if (number < 30){
            System.out.println("I wouldn't do that if I were you.");
        }
        else if (number < 40){
            System.out.println("It'll turn out great. Don't doubt yourself so much.");
        }
        else if (number < 50){
            System.out.print("I'm guessing " + number + " is not your lucky number.");
        }
        else if (number < 60){
            System.out.println("Yes! You have the best luck today! " + number + " must be your lucky number!");
        }
        else if (number < 70){
            System.out.println("Wow... You have the worse luck today. Things don't look too great for you.");
        }
        else if (number < 80){
            System.out.println("Good fortune! I think everything will turn out well this time!");
        }
        else if (number < 90){
            System.out.println("I don't know about this, friend. I would maybe try again later... And with a different number.");
        }
        else if (number < 100){
            System.out.println("Sounds good to me!");
        }
        else if (number == 100){
            System.out.println("Did you seriously pick 100..? It's a no from me.");
        }
        else if (number < 110){
            System.out.println(number + "%! Seems like you got some extra credit today!");
        }
        else if (number < 120){
            System.out.println("Man, I don't know. Try again later.");
        }
        else if (number < 130){
            System.out.println("Sure thing! I think that's a very good idea.");
        }
        else if (number < 140){
            System.out.println("Not such a good idea, I'm afraid. Try again later, maybe I'll change my mind.");
        }
        else if (number < 150){
            System.out.println("I think that's the best idea you've ever had. Keep 'em coming!");
        }
        else if (number < 160){
            System.out.println("Nope. Maybe next time.");
        }
        else if (number < 170){
            System.out.println("Yes! I love it!");
        }
        else if (number < 180){
            System.out.println("Uhhh... I wouldn't do that if I were you. Doesn't seem very logical.");
        }
        else if (number < 190){
            System.out.println("Make your dreams come true! Good luck!");
        }
        else if (number < 200){
            System.out.println("You picked a very unlucky number! Don't do it, I beg you!");
        }
        else if (number == 200){
            System.out.println("200? Really? Fine... Bad luck for you.");
        }
    }
}
