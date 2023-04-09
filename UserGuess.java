import java.util.Scanner;

public class UserGuess{
    public static int enterGuess(){ 
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess: ");
         
        String guess = scanner.nextLine();
        
        int userInt1 = Integer.parseInt(guess);
        /*if (userInt >= 0 || userInt < 0){
            return guess;
        }
        */
        return userInt1;
        
      
    }
    
}