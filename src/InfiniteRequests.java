import java.util.Scanner;

public class InfiniteRequests {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter a string: ");
            String input = in.nextLine();
            System.out.println(input);

            if(input.equals("quit")){
                break;
            }
        }
    }
}
