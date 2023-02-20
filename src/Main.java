import java.util.*;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {

        // Rock, paper, scissor game, user vs cpu, earn 3 points to a win game, 1 point for 1 round winned

        try {
            String[] cpuAnswers = new String[]{"ROCK", "PAPER", "SCISSORS"};

            int playerScore = 0;
            int cpuScore = 0;

            String playerAnswer;
            String playAgainCharacter;

            Boolean playAgain = false;

            Random rundomNumber = new Random();
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);

            do {
                playerScore = 0;
                cpuScore = 0;
                playAgain = false;

                do {
                    do {
                        System.out.print("Write - \"Rock\", \"Paper\", \"Scissors\": ");
                        playerAnswer = scanner1.next();
                        playerAnswer = playerAnswer.toUpperCase();
                    }while (!playerAnswer.equals("ROCK") && !playerAnswer.equals("PAPER") && !playerAnswer.equals("SCISSORS"));

                    String cpuChoose = cpuAnswers[rundomNumber.nextInt(3)];
                    System.out.println("PLAYER has choose - " + playerAnswer);
                    System.out.println("CPU has choose - " + cpuChoose);

                    if (playerAnswer.equals("ROCK") && cpuChoose.equals(cpuAnswers[0])) {
                        System.out.println("==== Tie!");
                        System.out.println("Player score: " + playerScore + "\nCpu score: " + cpuScore);
                    } else if (playerAnswer.equals("ROCK") && cpuChoose.equals(cpuAnswers[1])) {
                        System.out.println("**** Cpu has WON this round!");
                        cpuScore++;
                        System.out.println("Player score: " + playerScore + "\nCpu score: " + cpuScore);
                    } else if (playerAnswer.equals("ROCK") && cpuChoose.equals(cpuAnswers[2])) {
                        System.out.println("^^^^ Player has WON this round!");
                        playerScore++;
                        System.out.println("Player score: " + playerScore + "\nCpu score: " + cpuScore);
                    }

                    if (playerAnswer.equals("PAPER") && cpuChoose.equals(cpuAnswers[0])) {
                        System.out.println("^^^^ Player has WON this round!");
                        playerScore++;
                        System.out.println("Player score: " + playerScore + "\nCpu score: " + cpuScore);
                    } else if (playerAnswer.equals("PAPER") && cpuChoose.equals(cpuAnswers[1])) {
                        System.out.println("==== Tie!");
                        System.out.println("Player score: " + playerScore + "\nCpu score: " + cpuScore);
                    } else if (playerAnswer.equals("PAPER") && cpuChoose.equals(cpuAnswers[2])) {
                        System.out.println("**** Cpu has WON this round!");
                        cpuScore++;
                        System.out.println("Player score: " + playerScore + "\nCpu score: " + cpuScore);
                    }

                    if (playerAnswer.equals("SCISSORS") && cpuChoose.equals(cpuAnswers[0])) {
                        System.out.println("**** Cpu has WON this round!");
                        cpuScore++;
                        System.out.println("Player score: " + playerScore + "\nCpu score: " + cpuScore);
                    } else if (playerAnswer.equals("SCISSORS") && cpuChoose.equals(cpuAnswers[1])) {
                        System.out.println("^^^^ Player has WON this round!");
                        playerScore++;
                        System.out.println("Player score: " + playerScore + "\nCpu score: " + cpuScore);
                    } else if (playerAnswer.equals("SCISSORS") && cpuChoose.equals(cpuAnswers[2])) {
                        System.out.println("==== Tie!");
                        System.out.println("Player score: " + playerScore + "\nCpu score: " + cpuScore);
                    }
                } while (playerScore != 3 && cpuScore != 3);
                if (playerScore == 3) {
                    System.out.println("\n<<< Player WON! >>>");
                }
                if (cpuScore == 3) {
                    System.out.println("\n<<< Cpu WON! >>>\n");
                }

                do{
                    System.out.print("Do You wanna play again? Enter `Y` for yes or `N` for no: ");
                    playAgainCharacter = scanner2.next();
                    playAgainCharacter = playAgainCharacter.toUpperCase();
                    if(playAgainCharacter.equals("Y")){
                        playAgain = true;
                    }else if(playAgainCharacter.equals("N")){
                        playAgain = false;
                    }
                }while(!playAgainCharacter.equals("Y") && !playAgainCharacter.equals("N"));

            }while(playAgain == true);
        }catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
    }
}