import java.util.List;

/**
 * A linked list of integers
 */
public class IntegerLinkedList {

    //The first node
    Node head;

    public IntegerLinkedList() {}

    /**
     * Adds a Node with the given int to the end of the list
     */
    public void add(int x){
        this.add(this.getSize(), x);
    }

    /**
     * Adds a Node with the given int to the given index position in the list
     */
    public void add(int index, int x) {
        if (index < 0 || index > this.getSize()) {
            throw new ArrayIndexOutOfBoundsException("Get: index out of bounds");
        }
        Node newNode = new Node(x, null);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.setNext(this.getNode(index - 1 ).getNext());
            this.getNode(index - 1).setNext(newNode);
        }
    }

    /**
     * Replaces the Node with the given index position with a new Node containing the given int value
     */
    public void set(int index, int x) {
        this.remove(index);
        this.add(index, x);
    }

    /**
     * Sets the List back to an empty list
     */
    public void clear() {
        this.head = null;
    }

    /**
     * Returns the int from the Node at position index
     */
    public int get(int index) {
        return this.getNode(index).getElement();
    }

    /**
     * Gets the node at position index
     */
    private Node getNode(int index) {
        if (index < 0 || index > this.getSize()) {
            throw new ArrayIndexOutOfBoundsException("Get: index out of bounds");
        }
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    /**
     * Removes the Node at the given index from the List
     */
    public void remove(int index) {
        if (index == 0) {
            this.head = this.head.getNext();
            return;
        }
        Node prevNode = this.getNode(index - 1);
        prevNode.setNext(prevNode.getNext().getNext());
    }

    /**
     * Returns the size of the list
     */
    public int getSize() {
        int size = 0;
        Node node = head;
        while (node != null) {
            size++;
            node = node.getNext();
        }
        return size;
    }

    /**
     * Returns true if the list is an empty list, false otherwise
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * Returns a string representation of the array
     */
    public String toString() {
        String representation = "[";
        Node currentNode = this.head;
        for (int i = 0; i < this.getSize(); i++) {
            representation += currentNode.getElement() + ",";
            currentNode = currentNode.getNext();
        }
        representation = representation.substring(0, representation.length() - 1);
        representation += "]";
        return representation;
    }

}
