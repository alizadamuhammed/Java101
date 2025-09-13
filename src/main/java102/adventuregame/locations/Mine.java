package main.java102.adventuregame.locations;

import main.java102.adventuregame.characters.Player;
import main.java102.adventuregame.inventory.Armor;
import main.java102.adventuregame.inventory.Weapon;
import main.java102.adventuregame.obstacles.Obstacle;
import main.java102.adventuregame.obstacles.Snake;

import java.util.Random;

public class Mine extends BattleLoc {
    private Random random = new Random();

    public Mine(Player player) {
        super(player, "Mine", new Snake(), "Random", 5);
    }

    public void rewardPlayer() {
        int chance = random.nextInt(100) + 1;

        if (chance <= 45) {
            System.out.println("You didn't get anything from Snake");
            return;
        } else if (chance <= 70) {
            int moneyChance = random.nextInt(100) + 1;
            int money = 0;
            if (moneyChance <= 20) money = 10;
            if (moneyChance <= 20 + 30) money = 5;
            else money = 3;

            this.getPlayer().setMoney(this.getPlayer().getMoney() + money);
            System.out.println("You got " + money + " money.");
        } else if (chance <= 85) {
            int weaponChance = random.nextInt(100) + 1;
            Weapon weapon;
            if (weaponChance <= 20) {
                weapon = Weapon.getWeaponObjByID(3);
            } else if (weaponChance <= 50) {
                weapon = Weapon.getWeaponObjByID(2);
            } else {
                weapon = Weapon.getWeaponObjByID(1);
            }

            this.getPlayer().getInventory().setWeapon(weapon);
            System.out.println("You got this weapon: " + weapon.getName());
        } else {
            int armorChance = random.nextInt(100) + 1;
            Armor armor;
            if (armorChance <= 20) {
                armor = Armor.getArmorByID(3);
            } else if (armorChance <= 50) {
                armor = Armor.getArmorByID(2);
            } else {
                armor = Armor.getArmorByID(1);
            }
            this.getPlayer().getInventory().setArmor(armor);
            System.out.println("You got this armor: " + armor.getName());
        }
    }
}
