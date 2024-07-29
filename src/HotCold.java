import java.util.Scanner;
import java.util.Random;

public class HotCold {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100);


        while (true) {

//          System.out.println(randomNumber);

            System.out.println("Guess a number: ");
            int number = in.nextInt();

            int difference = randomNumber - number;
            if (number >= 0 && number <= 100) {
                if (difference >= -100 && difference <= -75) {
                    System.out.println("Too Too Cold");
                } else if (difference >= -75 && difference <= -50) {
                    System.out.println("Too Cold");
                } else if (difference >= -50 && difference <= -25) {
                    System.out.println("Colder");
                } else if (difference >= -25 && difference <= -10) {
                    System.out.println("Cold");
                } else if (difference >= -10 && difference <= 0) {
                    System.out.println("Near");
                } else if (difference >= 0 && difference <= 10) {
                    System.out.println("Near");
                } else if (difference >= 10 && difference <= 25) {
                    System.out.println("Hot");
                } else if (difference >= 25 && difference <= 50) {
                    System.out.println("Hotter");
                } else if (difference >= 50 && difference <= 75) {
                    System.out.println("Too Hot");
                } else if (difference >= 75 && difference <= 100) {
                    System.out.println("Too Too Hot");
                } else {
                    System.out.println("Guess between 0 and 100.");
                }
            }
            else {
                System.out.println("Guess between 0 and 100.");
            }
        }
    }
}