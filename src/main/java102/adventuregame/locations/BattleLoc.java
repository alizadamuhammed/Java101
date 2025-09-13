package main.java102.adventuregame.locations;

import main.java102.adventuregame.characters.Player;
import main.java102.adventuregame.obstacles.Obstacle;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacles;
    private Random random = new Random();


    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacles) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacles = maxObstacles;
        this.random = new Random();
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("----------------------------------------------");
        System.out.println("You are now here: " + this.getName());
        System.out.println("Be careful! " + obsNumber + " " + this.getObstacle().getName() + " is living here.");
        System.out.println("Run or Fight? (ex: R) ");
        String choice = scanner.nextLine().toUpperCase();
        if (choice.equals("F")) {
            if (combat(obsNumber)) {
                System.out.println("------------------------------------");
                System.out.println("You defeated obstacle(s)");
                return true;
            }
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You are dead");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            resetObstacleHealth();
            displayStats(i);
            boolean playerTurn = random.nextBoolean();
            while (isPlayerAlive() && isObstacleAlive()) {
                if (playerTurn) {
                    boolean hit = applyDamageToObstacle();
                    if (!hit) {
                        return false;
                    }
                } else {
                    if (isPlayerAlive()) {
                        applyDamageToPlayer();
                    }
                }
                playerTurn = !playerTurn;
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                rewardPlayer();
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean isPlayerAlive() {
        return this.getPlayer().getHealth() > 0;
    }

    public boolean isObstacleAlive() {
        return this.getObstacle().getHealth() > 0;
    }

    public void rewardPlayer() {
        int moneyAward = this.getObstacle().getMoneyAward();
        this.getPlayer().setMoney(this.getPlayer().getMoney() + moneyAward);
        System.out.println("You won the fight and get " + moneyAward + " money");

        String awardItem = this.getAward();
        if (!this.getPlayer().getInventory().getItems().contains(awardItem)) {
            this.getPlayer().getInventory().addItem(awardItem);
            System.out.println("You also get: " + awardItem);
        } else {
            System.out.println("You already have " + awardItem);
        }
    }


    public void applyDamageToPlayer() {
        System.out.println("\n" + this.getObstacle().getName() + " hit you");
        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor()
                .getBlock();
        if (obstacleDamage < 0) {
            obstacleDamage = 0;
        }
        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
        afterHit();
    }

    public boolean applyDamageToObstacle() {
        System.out.println("Hit ot run? (Ex: H)");
        String choice = scanner.nextLine().toUpperCase();
        if (choice.equals("H")) {
            System.out.println("You hit!");
            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
            afterHit();
            return true;
        } else {
            // Run
            return false;
        }
    }

    public void resetObstacleHealth() {
        this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
    }

    public void afterHit() {
        System.out.println();
        if (this.getObstacle().getHealth() < 0) {
            this.getObstacle().setHealth(0);
        }
        System.out.println("Your health: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + "'s health: " + this.getObstacle().getHealth());
        System.out.println();
    }

    public void displayStats(int i) {
        playerStats();
        obstacleStats(i);
    }

    public void playerStats() {
        System.out.println("------------------------------");
        System.out.println("Player stats!");
        System.out.println("Health: " + this.getPlayer().getHealth() +
                "\nDamage: " + this.getPlayer().getTotalDamage() +
                "\nWeapon: " + this.getPlayer().getInventory().getWeapon().getName() +
                "\nArmor: " + this.getPlayer().getInventory().getArmor().getName() +
                "\nBlock: " + this.getPlayer().getInventory().getArmor().getBlock() +
                "\nMoney: " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStats(int i) {
        System.out.println("-----------------------------");
        System.out.println(i + ". " + this.getObstacle().getName() + " stats!");
        System.out.println("Health: " + this.getObstacle().getHealth() +
                "\nDamage: " + this.getObstacle().getDamage() +
                "\nMoney Award: " + this.getObstacle().getMoneyAward());
        System.out.println();
    }

    public int randomObstacleNumber() {
        Random rand = new Random();
        return rand.nextInt(1, (this.getMaxObstacles() + 1));
    }

    public int getMaxObstacles() {
        return maxObstacles;
    }

    public void setMaxObstacles(int maxObstacles) {
        this.maxObstacles = maxObstacles;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
