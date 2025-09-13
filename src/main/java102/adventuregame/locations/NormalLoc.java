package main.java102.adventuregame.locations;

import main.java102.adventuregame.characters.Player;

public abstract class NormalLoc extends Location {
    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
