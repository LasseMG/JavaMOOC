package Recap.liquidcontainers;

import java.util.ArrayList;
import java.util.Scanner;

/*
The program offers the functionality to add, move and remove liquid.
Using the "add" command will add liquid to the first container,
"move" will move liquid from the first container to the second container
and "remove" will remove liquid from the second container.

- OOP, nu kan der oprettes separate containers, som der kan flyttes imellem.
 */

public class LiquidContainer {
    private int maxAmount;
    private int currentAmount;
    private static ArrayList<LiquidContainer> liquidContainers = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    private LiquidContainer() {
        this.maxAmount = 100;
        this.currentAmount = 0;
        liquidContainers.add(this);
    }

    public static LiquidContainer create() {
        return new LiquidContainer();
    }


    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void addAmount(int amount) {
        if (!(amount > maxAmount) || !(currentAmount + amount > maxAmount) || !(amount < 0)) {
            this.currentAmount += amount;
        } else {
            System.out.println("Cannot exceed max. amount or add a negative number!");
        }
    }

    public void removeAmount(int amount) {
        if (!((currentAmount - amount) < 0) || !(amount < 0) || !(currentAmount == 0)) {
            this.currentAmount -= amount;
        } else {
            System.out.println("Cannot subtract to less than 0, subtract negative numbers or subtract when current amount is 0!");
        }
    }

    public static void moveAmount() {
        System.out.println("Which container to move it from?");
        for (int i = 0; i < liquidContainers.size(); i++) {
            System.out.println(i + ": " + liquidContainers.get(i));
        }
        int containerIdFrom = scanner.nextInt();
        LiquidContainer lcFrom = liquidContainers.get(containerIdFrom);

        System.out.println(lcFrom+ "selected. Which container to move it to?");
        for (int i = 0; i < liquidContainers.size(); i++) {
            if (liquidContainers.get(i) != lcFrom) {
                System.out.println(i + ": " + liquidContainers.get(i));
            }
        }
        int containerIdTo = scanner.nextInt();
        LiquidContainer lcTo = liquidContainers.get(containerIdTo);

        System.out.println(lcTo + " selected. How much to move?");

        int amount = scanner.nextInt();

        lcTo.addAmount(amount);
        lcFrom.removeAmount(amount);

        System.out.println("Updated amount for container: " + lcTo);
    }

    @Override
    public String toString() {
        return "LiquidContainer{" +
                "maxAmount=" + maxAmount +
                ", currentAmount=" + currentAmount +
                '}';
    }
}
