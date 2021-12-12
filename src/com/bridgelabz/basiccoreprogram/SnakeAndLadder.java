package com.bridgelabz.basiccoreprogram;

import java.util.Random;

public class SnakeAndLadder {

    // Constants
    final static int NO_PLAY = 0;
    final static int LADDER = 1;
    final static int SNAKE = 2;
    final static int WINNING_POS = 100;

    public static void main(String[] args) {
        System.out.println(" Welcome to the Game ");
        int position = 0;

        // Player reaches till winning position loop
        while(position <= WINNING_POS) {

            // Generate Random Num from 1 to 6
            Random random = new Random();
            int diceNo = random.nextInt(6) + 1;
            System.out.println(" Rolled Num: " + diceNo);

            // Random Check
            int randomCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (randomCheck) {
                case NO_PLAY -> System.out.println(" NO Play! You are at the same Position: " + position);
                case LADDER -> {
                    position += diceNo;
                    System.out.println(" You Got Ladder!, Position: " + position);
                }
                case SNAKE -> {
                    position -= diceNo;
                    if (position < 0){
                        position = 0;
                    }
                    System.out.println("Oppps Bitten by Snake, Position: " + position);
                }
            }

            System.out.println(" Hoorray You won!!!");
        }
    }
}
