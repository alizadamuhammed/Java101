package main.java102.adventuregame.locations;

import main.java102.adventuregame.characters.Player;
import main.java102.adventuregame.obstacles.Bear;

public class River extends BattleLoc{
    public River(Player player) {
        super(player, "River", new Bear(), "Water", 3);
    }
}
