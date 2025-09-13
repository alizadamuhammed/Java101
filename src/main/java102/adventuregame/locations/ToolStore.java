package main.java102.adventuregame.locations;

import main.java102.adventuregame.characters.Player;
import main.java102.adventuregame.inventory.Armor;
import main.java102.adventuregame.inventory.Weapon;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\n----------------------------------------------");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("Tool store!");
            System.out.println("1 - Weapons\n" +
                    "2 - Armors\n" +
                    "3 - Exit");
            System.out.print("Enter your choice: ");
            int choice = Location.scanner.nextInt();
            while (choice < 1 || choice > 3) {
                System.out.print("Invalid choice, try again: ");
                choice = Location.scanner.nextInt();
            }
            switch (choice) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("----------Weapons----------\n");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + ". Name - " + w.getName() + ", Damage - " + w.getDamage() +
                    ", Price - " + w.getPrice());
        }
        System.out.println("4 - Exit");
    }

    public void buyWeapon() {
        System.out.print("Enter your choice: ");
        int choice = Location.scanner.nextInt();
        while (choice < 0 || choice > Weapon.weapons().length+1) {
            System.out.print("Invalid choice, try again: ");
            choice = Location.scanner.nextInt();
        }

        if (choice != 4) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(choice);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Not enough money!");
                } else {
                    System.out.println("You successfully bought " + selectedWeapon.getName());
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("You have " + this.getPlayer().getMoney() + " money left.");

                }
            }
        }
    }

    public void printArmor() {
        System.out.println("----------Armors----------\n");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + ". Name: " + a.getName() + ", Block: " + a.getBlock() +
                    ", Price: " + a.getPrice());
        }
        System.out.println("4 - Exit");
    }

    public void buyArmor() {
        System.out.print("Enter your choice: ");
        int choice = Location.scanner.nextInt();
        while (choice < 1 || choice > Weapon.weapons().length+1) {
            System.out.print("Invalid choice, try again: ");
            choice = Location.scanner.nextInt();
        }

        if (choice != 4) {
            Armor selectedArmor = Armor.getArmorByID(choice);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Not enough money!");
                } else {
                    System.out.println("You successfully bought " + selectedArmor.getName());
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("You have " + this.getPlayer().getMoney() + " money left.");
                }
            }
        }
    }
}
