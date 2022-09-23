package game.snake_ladder;

import java.util.Random;

public class SnakeLadderGame {

    static int count;

    static int play(int playerPos) {

        ++count;
        Random random = new Random();
        int dieNum = 1 + random.nextInt(6);
        System.out.println("Die number: " + dieNum);

        int checkOption = random.nextInt(3);

        switch (checkOption) {
            case 0:
                System.out.println("No Play!");
                break;
            case 1:
                System.out.println("Ladder!");
                playerPos += dieNum;
                if (playerPos > 100) {
                    playerPos -= dieNum;
                }
                play(playerPos);
                break;
            default:
                System.out.println("Snake!");
                playerPos -= dieNum;
                if (playerPos < 0) {
                    playerPos = 0;
                }
        }

        return playerPos;
    }

    public static void main(String[] args) {
        int player1Pos = 0, player2Pos = 0, chPlayCount = 0;

        System.out.println("Welcome to snake ladder game: ");

        System.out.println("*****GAME STARTED*****");
        System.out.println("Starting position of player 1 = " + player1Pos);
        System.out.println("Starting position of player 2 = " + player2Pos);

        while (player1Pos != 100 && player2Pos != 100) {
            chPlayCount++;
            if (chPlayCount % 2 != 0) {
                System.out.println("Player 1 is playing...");
                player1Pos = play(player1Pos);
                System.out.println("New position of Player 1: " + player1Pos + "\n");
            } else {
                System.out.println("Player 2 is playing...");
                player2Pos = play(player2Pos);
                System.out.println("New position of Player 2: " + player2Pos + "\n");
            }
        }
        if (player1Pos == 100) {
            System.out.println("Player 1 won the game!");
        } else {
            System.out.println("Player 2 won the game!");
        }
        
        
        System.out.println("Total " + count + " times dice was played to win!");

    }

}
