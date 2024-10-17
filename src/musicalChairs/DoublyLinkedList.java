package musicalChairs;

public class DoublyLinkedList {
    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert a new node into the circular doubly linked list
    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            // List is empty; new node becomes head and tail
            head = tail = newNode;
            head.next = head.prev = head; // Circular references
        } else {
            // Insert at the end and update pointers
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head; // Circular link
            head.prev = newNode;
            tail = newNode;
        }
    }

    // Remove a specific node from the circular doubly linked list
    public void remove(Node currentNode) {
        if (currentNode == null) return;

        if (currentNode == head && currentNode == tail) {
            // Only one node in the list
            head = tail = null;
        } else {
            // Adjust the pointers
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;

            if (currentNode == head) {
                head = currentNode.next;
            }
            if (currentNode == tail) {
                tail = currentNode.prev;
            }
        }
    }

    // Convert the list to a string of player names
    @Override
    public String toString() {
        if (head == null) return "";

        StringBuilder players = new StringBuilder();
        Node current = head;

        do {
            players.append(current.data).append(" ");
            current = current.next;
        } while (current != head);

        return players.toString().trim();
    }
}
