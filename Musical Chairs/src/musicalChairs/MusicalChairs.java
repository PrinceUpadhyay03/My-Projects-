package musicalChairs;

import java.util.Random;

public class MusicalChairs {
    private DoublyLinkedList players;
    private Random random;

    public MusicalChairs(DoublyLinkedList players) {
        this.players = players;
        this.random = new Random();
    }

    // Simulate a single round
    public void playRound() {
        if (players.head == null || players.head.next == players.head) {
            // Game over or only one player left
            return;
        }

        // Simulate music playing and stopping at a random player
        int steps = random.nextInt(getPlayerCount());
        Node current = players.head;

        // Move 'steps' times around the circle
        for (int i = 0; i < steps; i++) {
            current = current.next;
        }

        // Eliminate the player at the current position
        System.out.println("Eliminated: " + current.data);
        players.remove(current);
    }

    // Get the number of players remaining
    private int getPlayerCount() {
        if (players.head == null) return 0;

        int count = 1;
        Node current = players.head;

        while (current.next != players.head) {
            count++;
            current = current.next;
        }

        return count;
    }

    // Play the game until one winner remains
    public void playGame() {
        while (getPlayerCount() > 1) {
            playRound();
            System.out.println("Remaining players: " + players);
            System.out.println("---------------------------------");
        }

        if (players.head != null) {
            System.out.println("The winner is: " + players.head.data);
        } else {
            System.out.println("No winner. The game ended with no players.");
        }
    }
}
