package Recap.liquidcontainers;

import java.util.Scanner;

public class LiquidContainersApp {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LiquidContainer l1 = LiquidContainer.create();
        LiquidContainer l2 = LiquidContainer.create();
        LiquidContainer l3 = LiquidContainer.create();

        l1.addAmount(50);
        l2.addAmount(20);
        l3.addAmount(90);

        LiquidContainer.moveAmount();
    }
}
