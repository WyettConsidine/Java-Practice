/**
 * Stores an integer
 */
public class Node {

    //Stored element
    private int element;
    //The next node in the change
    private Node next;

    /**
     * Constructs a new node with specified parameters
     */
    public Node(int element, Node next) {
        this.element = element;
        this.next = next;
    }

    /**
     * Gets the next node
     * @return the node to which this points
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * Sets the pointer to the given node
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Gets the stored element
     * @return the element, an integer
     */
    public int getElement() {
        return this.element;
    }

    /**
     * Sets the stored element of the node
     */
    public void setElement(int element) {
        this.element = element;
    }


}
