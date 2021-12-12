package com.bridgelabz.basiccoreprogram;

import java.util.Random;

public class SnakeAndLadder {

    // Constants
    final static int NO_PLAY = 0;
    final static int LADDER = 1;
    final static int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println(" Welcome to the Game ");
        int initial_pos = 0;
        System.out.println(" Position of the Player: " + initial_pos);

        // Generate Random Num from 1 to 6
        Random random = new Random();
        int diceNo = random.nextInt(6) + 1;
        System.out.println(" Rolled Num: " + diceNo);

        // Random Check
        int randomCheck = (int) Math.floor(Math.random() * 10 ) % 3;

        switch (randomCheck) {
            case NO_PLAY -> System.out.println(" NO Play! You are at the same Position: " + initial_pos);
            case LADDER -> {
                initial_pos += diceNo;
                System.out.println(" You Got Ladder!, Position: " + initial_pos);
            }
            case SNAKE -> {
                initial_pos -= diceNo;
                System.out.println("Opps Bitten by Snake, Position: " + initial_pos);
            }
        }
    }
}
