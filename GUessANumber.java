import java.util.Random;
import java.util.Scanner;

public class GUessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);


        while (true){
            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();


            boolean isValid = true;

            for (int i = 0; i <playerInput.length() ; i++) {

                if (playerInput.charAt(i)<48 || playerInput.charAt(i)>57  ){
                    isValid = false;


                }

                if (isValid) {
                    int playerNumber = Integer.parseInt(playerInput);

                    if (playerNumber == computerNumber){
                        System.out.println("You guessed it!");
                        return;
                    } else if (playerNumber > computerNumber) {
                        System.out.println("Too High!");
                        break;

                    } else  {
                        System.out.println("Too low!");
                        break;

                    }
                }
                else {
                    System.out.println("Invalid input!");
                    break;

                }

            }


        }




    }
}
