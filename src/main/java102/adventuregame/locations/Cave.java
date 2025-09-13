package main.java102.adventuregame.locations;

import main.java102.adventuregame.characters.Player;
import main.java102.adventuregame.obstacles.Zombie;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food", 3);
    }

}
