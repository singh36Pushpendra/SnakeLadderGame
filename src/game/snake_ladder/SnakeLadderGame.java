package game.snake_ladder;

import java.util.Random;

public class SnakeLadderGame {

    public static void main(String[] args) {
        int userPos = 0, count = 0;
        Random random = new Random();

        System.out.println("Welcome to snake ladder game: ");

        System.out.println("*****GAME STARTED*****");
        System.out.println("Starting position of user = " + userPos);

        while (userPos != 100) {

            count++;
            int dieNum = 1 + random.nextInt(6);
            System.out.println("Die number: " + dieNum);

            int checkOption = random.nextInt(3);

            switch (checkOption) {
                case 0:
                    System.out.println("No Play!");
                    break;
                case 1:
                    System.out.println("Ladder!");
                    userPos += dieNum;
                    break;
                default:
                    System.out.println("Snake!");
                    userPos -= dieNum;
                    if (userPos < 0) {
                        userPos = 0;
                    }
            }
            System.out.println("New position of user: " + userPos);
        }
        System.out.println("User Wins by rolling a die " + count + " times!");
    }

}
