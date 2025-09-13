package main.java102.adventuregame.locations;

import main.java102.adventuregame.characters.Player;

import java.util.ArrayList;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in safe house, your health has been renewed.");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        if (checkWinCondition()) {
            System.out.println("You got all award items and won the game. Congratulations!");
            return false;
        }
        return true;
    }

    public boolean checkWinCondition() {
        ArrayList<String> items = this.getPlayer().getInventory().getItems();
        return items.contains("Food") && items.contains("Water") && items.contains("Firewood");
    }

}
