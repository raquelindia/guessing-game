public class PlayRound {
    
    public static void main(String[] args){
        ComputerGuess computer = new ComputerGuess();
        int computerGuess = ComputerGuess.computerSelection();
        for(int i = 0; i < 5; i++){
                int rounds = i + 1;
                
                String passOrFail = "";

                UserGuess user = new UserGuess();
                int userGuess = UserGuess.enterGuess();
                //int userInt = Integer.parseInt(userGuess);

            if (rounds == 5 && userGuess != computerGuess){
                
                passOrFail = "LOST";
                String gameOver = "You " + passOrFail + "!" + " GAME OVER...";
                System.out.println(gameOver + " Round: " + rounds); 
            } else if (rounds == 5 && userGuess == computerGuess){
                
                passOrFail = "WON";
                String gameOver2 = "You " + passOrFail + "!" + " GAME OVER...";
                System.out.println(gameOver2 + " Round: " + rounds);
            } else if (rounds < 5 && userGuess == computerGuess){
                
                passOrFail = "WON";
                String message = "You " + passOrFail + "!";
                System.out.println(message + " Round: " + rounds);
            } else {
                
                passOrFail = "LOST";
                String messageTryAgain = "You " + passOrFail + "! Guess again...";
                System.out.println(messageTryAgain + " Round: " + rounds);
            }
        }
    }
}