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

    }

    /**
     * Adds a Node with the given int to the given index position in the list
     */
    public void add(int index, int x) {
        if (index < 0 || index >= this.getSize()) {
            throw new ArrayIndexOutOfBoundsException("Get: index out of bounds")
        }
        Node newNode = new Node(x, null);
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.getNode(index).setNext(newNode);
        }
    }

    /**
     * Replaces the Node with the given index position with a new Node containing the given int value
     */
    public void set(int index, int x) {

    }

    /**
     * Sets the List back to an empty list
     */
    public void clear() {
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
        if (index < 0 || index >= this.getSize()) {
            throw new ArrayIndexOutOfBoundsException("Get: index out of bounds")
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

    }

    /**
     * Returns the size of the list
     */
    public int getSize() {
        int size = 0;
        Node node = head;
        while (node.getNext() != null) {
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

    public String toString() {

    }

}
