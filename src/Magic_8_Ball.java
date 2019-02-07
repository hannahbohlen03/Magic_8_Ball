import java.util.Scanner;

public class Magic_8_Ball {
    public static void main(String[]args){

        //Declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number;

        //Initializing
        System.out.println("Think of your question. Think really hard.");
        System.out.println(" ");
        System.out.println("Now, pick a number from 0-100.");
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
            System.out.println("Wow! You have the best luck today! " + number + " must be your lucky number today!");
        }
        else if (number < 70){
            System.out.println("Wow... You have the worse luck today. I'd just go home... Things don't look too good.");
        }
        else if (number < 80){
            System.out.println("Good fortune! I say go for it! Nothing bad will happen!");
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







    }
}
