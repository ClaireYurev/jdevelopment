package com.claireyurev;

public class Game {
    Player p1;
    Player p2;          // 3 instance variables for the three player objects
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();  // Create 3 Player objects and assign them to the 3 Player instance variables
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;    // Declare 3 variables to hold the 3 guesses the players make
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false; // Declare 3 variables to hold a true or false based on the player's answer
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");  // Makes the TARGET number

        while(true) {

            System.out.println("Number to guess is "+targetNumber);

            p1.guess();     // call each player's guess Method
            p2.guess();     // call each player's guess Method
            p3.guess();     // call each player's guess Method

            // Let's get the result of each player's guess() method running
            // by accessing the number variable of each player:

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            // Let's check each player's guess to see if it matches the target number.
            // If the player is right, then set that player's variable to be true
            // (Remember, we set it false by default)

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight ) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? "+ p1isRight);
                System.out.println("Player two got it right? "+ p2isRight);
                System.out.println("Player three got it right? "+ p2isRight);
                System.out.println("Game is over.");
                break; // Game is over, so break out of the loop
            } else {
                // we must keep going because nobody got it right
                System.out.println("Players will have to try again.");
            }   // end if/else
        } // end loop
    } // end method
} // end class

