import java.util.Scanner;

public class Magic_8_Ball {
    public static void main(String[]args){

        //Declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String userName;
        int number;

        //Initializing
        System.out.println("What is your name, curious one?");
        userName = keyboard.nextLine();
        System.out.println(userName+ ", think of a scenario that you want to go well, like should you ask someone on a date or if you should study tonight.");
        System.out.println("Now, pick a number from 0-200.");
        System.out.println(" ");
        number = keyboard.nextInt();
        System.out.println(" ");

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
            System.out.println("I wouldn't do that if I were you, " + userName + ".");
        }
        else if (number < 40){
            System.out.println("You need to do that for sure. Don't let me down!");
        }
        else if (number < 50){
            System.out.print("I'm guessing " + number + " is not your lucky number.");
        }
        else if (number < 60){
            System.out.println("Yes! Do it! " + number + " must be your lucky number!");
        }
        else if (number < 70){
            System.out.println("Wow... You have the worse luck today. Things don't look too great for you.");
        }
        else if (number < 80){
            System.out.println("I think everything will turn out well this time!");
        }
        else if (number < 90){
            System.out.println("I don't know about this, friend. I would maybe try again later... And use a different number.");
        }
        else if (number < 100){
            System.out.println("Sounds good to me!");
        }
        else if (number == 100){
            System.out.println("Did you seriously pick 100..? It's a no from me.");
        }
        else if (number < 110){
            System.out.println("I think that us a very good idea. YOu'll be very happy with the outcome.");
        }
        else if (number < 120){
            System.out.println("ERROR TRY AGAIN LATER");
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
            System.out.println("200? Really? Fine... Come back later. Or not, I don't care.");
        }
        else if (number > 200){
            System.out.println("You didn't listen to the instructions. You learned how to read instruction in what, 2nd grade?");
        }
    }
}
