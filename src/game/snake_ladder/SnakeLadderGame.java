package game.snake_ladder;

import java.util.Random;

public class SnakeLadderGame {

    public static void main(String[] args) {
        int userPos = 0;
        Random random = new Random();
        
        System.out.println("Welcome to snake ladder game: ");
        
        System.out.println("*****GAME STARTED*****");
        System.out.println("Starting position of user = " + userPos);
        
        int dieNum = 1 + random.nextInt(6);
        System.out.println("Die number: " + dieNum);
    }
    
}
