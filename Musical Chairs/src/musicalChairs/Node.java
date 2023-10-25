package musicalChairs;

class Node {
	   String data;
	   public Node next;
	   public Node prev;

	   public Node(String initialData) {
	      data = initialData;
	      next = null;
	      prev = null;
	   }
	}