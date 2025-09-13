package main.java102.adventuregame.obstacles;

import java.util.Random;

public class Snake extends Obstacle{
    private Random random = new Random();
    public Snake() {
        super("Snake", 4, 3 , 12, 0);
    }

    @Override
    public int getDamage() {
        return random.nextInt(3,7);
    }
}
