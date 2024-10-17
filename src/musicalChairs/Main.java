package musicalChairs;

public class Main {
    public static void main(String[] args) {
        // Initialize player names
        String[] playerNames = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank"};

        // Create a new doubly linked list and add players
        DoublyLinkedList playerList = new DoublyLinkedList();
        for (String name : playerNames) {
            playerList.insert(name);
        }

        // Start the Musical Chairs game
        MusicalChairs game = new MusicalChairs(playerList);
        game.playGame();
    }
}
