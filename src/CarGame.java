import java.util.Scanner;

public class CarGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'start' to start car: ");
        System.out.println("Enter 'stop' to stop car: ");
        System.out.println("Enter 'quit' to quit game: ");
        System.out.println("Enter 'hint' for hint: ");

        int i = 0;
        int j = 0;
        while(true){
            String input = in.nextLine();
            if (input.equals("start")){
                if (i == 0){
                    System.out.println("The car is starting.");
                    j = 0;
                } else {
                    System.out.println("You can't start the same car twice.");
                }
                i = i + 1;
            } else if(input.equals("stop")){
                if (j == 0){
                    System.out.println("The car is stopping.");
                    i = 0;
                } else {
                    System.out.println("You can't stop the same car twice.");
                }
                j = j + 1;
            } else if(input.equals("quit")){
                System.out.println("Please replay.");
                break;
            } else if(input.equals("hint")){
                System.out.println("Guess the hint.");
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
