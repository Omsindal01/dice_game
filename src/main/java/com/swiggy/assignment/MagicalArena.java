package com.swiggy.assignment;

/**
 * The MagicalArena class represents the arena where two players engage in a magical battle.
 * It orchestrates the turns and displays the game results.
 */

public class MagicalArena {
    private Player playerA;
    private Player playerB;
    private Dice attackDice;
    private Dice defendDice;

    /**
     * Constructs a MagicalArena with two players and the number of sides on the dice.
     *
     * @param playerA The first player.
     * @param playerB The second player.
     * @param sides   The number of sides on the dice.
     */

    public MagicalArena(Player playerA, Player playerB, int sides) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.attackDice = new Dice(sides);
        this.defendDice = new Dice(sides);
    }

    /**
     * Constructor for Unit testing.
     * Constructs a MagicalArena with two players and custom attack and defend dice.
     *
     * @param playerA     The first player.
     * @param playerB     The second player.
     * @param attackDice  Mock attack dice.
     * @param defendDice  Mock defend dice.
     */

    public MagicalArena(Player playerA, Player playerB, Dice attackDice, Dice defendDice) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.attackDice = attackDice;
        this.defendDice = defendDice;
    }

    /**
     * Checks if the input is valid for the game.
     *
     * @return Flase if both players can't damage each other, true otherwise.
     */

    private boolean isValidInput() {
        return !(playerA.getAttack()*6 <= playerB.getStrength() && playerB.getAttack()*6 <= playerA.getStrength());
    }

    /**
     * Plays the magical game between two players, taking turns until one player's health reaches 0.
     */

    public void playGame() {
        // Determine the player with lower health to attack first
        Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;

        // The game will continue until both players has a health > 0
        while (playerA.isAlive() && playerB.isAlive()) {

            // The game needs to be stopped, if both players can't cause damage to each other, because it will run forever otherwise.
            if(!isValidInput()) {
                break;
            }

            // Players play a single turn of the game
            playTurn(attacker, defender);
    
            // Check if the game has ended after the current turn
            if (!defender.isAlive()) {
                break;
            }
    
            // Swap roles for the next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        // Display the winner of the game
        displayWinner();
    }

    /**
     * Plays a single turn between an attacker and a defender.
     *
     * @param attacker The player attacking.
     * @param defender The player defending.
     */

    private void playTurn(Player attacker, Player defender) {
        int attackRoll = attackDice.roll();
        int defendRoll = defendDice.roll();

        // Calculate the damage cause by the attacker to the defender
        int damage = Math.max(0, attackRoll * attacker.getAttack() - defendRoll * defender.getStrength());

        // Calculate the remaining health of the defender after the attack
        defender.takeDamage(damage);

        // Logs every turn between the players
        System.out.println(attacker.getName() + " attacks with roll " + attackRoll +
                " and deals damage " + damage + ". " + defender.getName() +
                " defends with roll " + defendRoll + ". " +
                defender.getName() + "'s health: " + defender.getHealth());
    }

    /**
     * Displays the winner or declares a draw based on the players' health.
     */

    private void displayWinner() {
        if (playerA.getHealth() == 0 && playerB.getHealth() == 0) {
            System.out.println("It's a draw!");
        } else if (playerA.getHealth() == 0) {
            System.out.println("Player " + playerB.getName() + " wins!");
        } else if(playerB.getHealth() == 0){
            System.out.println("Player " + playerA.getName() + " wins!");
        } else {
            System.out.println("Cannot proceed with the game. Both players can't cause damage to each other!");
        }
    }
}
