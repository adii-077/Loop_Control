import java.util.Scanner;

public class PhonePIN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter PIN to set: ");
        String pin = input.nextLine();

        System.out.println("Enter PIN: ");
        while (true){
//            System.out.println("Enter PIN: ");
            String newPin = input.nextLine();
            if (newPin.equals(pin)){
                System.out.println("Correct PIN!");
                break;
            } else {
                System.out.println("Try again:");
            }
        }

    }
}
