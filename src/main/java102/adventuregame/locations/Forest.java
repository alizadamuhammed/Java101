package main.java102.adventuregame.locations;

import main.java102.adventuregame.characters.Player;
import main.java102.adventuregame.obstacles.Vampire;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Firewood", 3);
    }

}
