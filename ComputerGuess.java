import java.util.Random;


public class ComputerGuess {
    
    public static int computerSelection(){
        Random random = new Random();
        int guessThisNum = random.nextInt(10);
        
        return guessThisNum;
    }
}