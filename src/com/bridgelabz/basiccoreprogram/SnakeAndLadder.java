package com.bridgelabz.basiccoreprogram;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println(" Welcome to the Game ");
        int initial_pos = 0;
        System.out.println(" Position of the Player: " + initial_pos);

        // Generate Random Num from 1 to 6
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        System.out.println(" Rolled Num: " + dice);
    }
}
