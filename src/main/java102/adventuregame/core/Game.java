package main.java102.adventuregame.core;

import main.java102.adventuregame.characters.*;
import main.java102.adventuregame.locations.*;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    private Player player;

    public void startGame() {
        System.out.println("Welcome to Game");
        System.out.print("Please enter your name: ");
        String playerName = sc.nextLine();

        this.player = new Player(playerName);

        System.out.println(player.getName() + ", please choose a character to start the game");
        selectCharacter();
        selectLocation();
    }

    public void selectCharacter() {
        Characters[] characters = {new Samurai(), new Archer(), new Knight()};

        while (true) {
//            player.printPlayerInfo();
            System.out.println("----------------------------------------------------");
            for (Characters character : characters) {
                System.out.println(character.getId() + ". Name: " + character.getName() + " Damage: " + character.getDamage() + " Health: " + character.getHealth() + " Money: " + character.getMoney());
            }
            System.out.println("----------------------------------------------------");
            System.out.print("Choose your choice (ex: 1): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    player.initPlayer(new Samurai());
                    break;
                case 2:
                    player.initPlayer(new Archer());
                    break;
                case 3:
                    player.initPlayer(new Knight());
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    continue;
            }
            break;
        }
//        System.out.println("You chose " + player.getCharName() + ". The properties of " + player.getCharName() + " are:");
        System.out.println("You chose " + player.getCharName());
//        player.printPlayerInfo();
    }

    public void selectLocation() {
        Location location = null;
        Location[] listOfLocations = {new SafeHouse(player), new ToolStore(player)};

        while (true) {
            System.out.println("----------------------------------------------\n");
            player.printPlayerInfo();
            System.out.println("\n----------------------------------------------");
            System.out.println("Locations:");
            System.out.println("0. Exit");
            System.out.println("1. Safe House - You are safe here.");
            System.out.println("2. Tool Store - You are in tool store. It's safe here.");
            System.out.println("3. Cave - Dangerous area. Could be zombie. Award is food.");
            System.out.println("4. Forest - Dangerous area. Could be vampire. Award is firewood.");
            System.out.println("5. River - Dangerous area. Could be bear. Award is water.");
            System.out.println("6. Mine - Dangerous area. Could be snake. Award is random.");
            System.out.print("Choose your choice (ex: 1): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                case 0:
                    location = null;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;
            }

            if (location == null) {
                System.out.println("GAME OVER");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }

        }
    }
}
