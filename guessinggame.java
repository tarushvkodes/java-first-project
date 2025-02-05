import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = (int) (Math.random() * 100) +1;
        int numberOfTries = 0;
        int guess = 0;

        System.out.println("welcome to the number guessing game");
        System.out.println("i have selected a num betweek 1 and 100");
        System.out.println("try to guess it");

        while (guess != numberToGuess) {
            System.out.print("enter ur guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess < numberToGuess){
                System.out.println("too low, guess again.");
            } else if (guess > numberToGuess){
                System.out.println("too high, try again");
            } else {
                System.out.println("congrats, u guessed it right in " + numberOfTries + " tries");
            }
        }
    
    scanner.close();

    }
}