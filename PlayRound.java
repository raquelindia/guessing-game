public class PlayRound {
    
    public static void main(String[] args){
        ComputerGuess computer = new ComputerGuess();
        int computerGuess = ComputerGuess.computerSelection();
        int gamesWon = 0;
        int gamesLost = 0;
        int gamesPlayed = 0;
       
        for(int j = 0; j < 3; j++){
        for(int i = 0; i < 5; i++){
                int rounds = i + 1;
                
                String passOrFail = "";

                UserGuess user = new UserGuess();
                int userGuess = UserGuess.enterGuess();
                
                
                
                
                
                if (userGuess > 10 || userGuess < 0){
                    System.out.println("Hint: The number is 0 - 10" );
                    /* 
                    UserGuess user1 = new UserGuess();
                    userGuess = UserGuess.enterGuess();
                    rounds = rounds + 1;
                    int newRounds = rounds - 1;
                    if (rounds < 5 && computerGuess == userGuess){
                        passOrFail = "WON";
                        String message = "You " + passOrFail + "!";
                        System.out.println(message + " Round: " + newRounds + " Games Played: " + gamesPlayed + " Scoreboard: You: " + gamesWon + " | Computer: " + gamesLost);
                    } else if (rounds < 5 && computerGuess != userGuess) {
                        passOrFail = "LOST";
                        String messageTryAgain = "You " + passOrFail + "! Guess again...";
                        System.out.println(messageTryAgain + " Round: " + newRounds);
                    } else if (rounds == 5 && computerGuess == userGuess){
                        gamesWon = gamesWon + 1;
                        passOrFail = "WON";
                        String gameOver2 = "You " + passOrFail + "!" + " GAME OVER...";
                        System.out.println(gameOver2 + " Round: " + newRounds + " Games Played: " + gamesPlayed + " Scoreboard: You: " + gamesWon + " | Computer: " + gamesLost);
                    } else if (rounds == 5 && computerGuess != userGuess){
                        gamesLost = gamesLost + 1;
                        passOrFail = "LOST";
                        String gameOver = "You " + passOrFail + "!" + " GAME OVER...";
                        System.out.println(gameOver + " Round: " + newRounds + " Games Played: " + gamesPlayed + " Scoreboard: You: " + gamesWon + " | Computer: " + gamesLost);
                    } */
                } 
                
           
            if (rounds == 5 && userGuess != computerGuess){
                
                passOrFail = "LOST";
                gamesLost = gamesLost + 1;
                gamesPlayed = gamesPlayed + 1;
                String gameOver = "You " + passOrFail + "!" + " GAME OVER...";
                System.out.println(gameOver + " Round: " + rounds + " Games Played: " + gamesPlayed + " Scoreboard: You: " + gamesWon + " | Computer: " + gamesLost); 
            } else if (rounds == 5 && userGuess == computerGuess){
                
                passOrFail = "WON";
                String gameOver2 = "You " + passOrFail + "!" + " GAME OVER...";
                gamesWon = gamesWon + 1;
                gamesPlayed = gamesPlayed + 1;
                System.out.println(gameOver2 + " Round: " + rounds + " Games Played: " + gamesPlayed + " Scoreboard: You: " + gamesWon + " | Computer: " + gamesLost);
                
            } else if (rounds < 5 && userGuess == computerGuess){
                
                passOrFail = "WON";
                String message = "You " + passOrFail + "!";
                gamesWon = gamesWon + 1;
                gamesPlayed = gamesPlayed + 1;
                System.out.println(message + " Round: " + rounds + " Games Played: " + gamesPlayed + " Scoreboard: You: " + gamesWon + " | Computer: " + gamesLost);
                break;
            } else {
                
                passOrFail = "LOST";
                String messageTryAgain = "You " + passOrFail + "! Guess again...";
                System.out.println(messageTryAgain + " Round: " + rounds);
            }
        }
        if (gamesPlayed == 3 && gamesWon > gamesLost){
            System.out.println("YOU BEAT THE COMPUTER! CONGRATULATIONS!! ~.~ <3 ^_^ <3");
        } else if (gamesPlayed == 3 && gamesWon < gamesLost) {

            System.out.println("You let the computer beat you... train for 30 days and try again...");
        }
        
    
        }
    }
    }

