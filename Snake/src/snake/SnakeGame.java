package snake;

import java.awt.Color;




public class SnakeGame {


    public static void main(String[] args) {

        Game game = new Game();
        
        Thread thread = new Thread(game);
        thread.start();
        
    }

}

