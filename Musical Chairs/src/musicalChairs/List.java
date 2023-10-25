package musicalChairs;

class List {
    public Node head;
    public Node tail;

    public List() {
        head = null;
        tail = null;
    }

    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void remove(Node currentNode) {
        if (currentNode == null) return;

        Node prev = currentNode.prev;
        Node next = currentNode.next;

        if (prev != null) {
            prev.next = next;
        } else {
            head = next;
        }

        if (next != null) {
            next.prev = prev;
        } else {
            tail = prev;
        }
    }

    public void removeByName(String name, Node current) {
        Node target = head;
        boolean found = false;
        while (target != null) {
            if (target.data.equalsIgnoreCase(name)) {
                found = true;
                break;
            }
            target = target.next;
        }

        if (found) {
            System.out.println("Eliminating player: " + target.data);
            remove(target);
        } else {
            System.out.println("Player not found.");
        }
    }

    @Override
    public String toString() {
        StringBuilder players = new StringBuilder();
        Node current = head;
        while (current != null) {
            players.append(current.data).append(" ");
            current = current.next;
        }
        return players.toString().trim();
    }
}
