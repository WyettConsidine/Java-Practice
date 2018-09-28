/**
 * Stores an integer
 */
public class Node {

    //Stored element
    private int element;
    //The next node in the list
    private Node next;
    //The previous node in the list
    private Node prev;

    /**
     * Constructs a new node with specified parameters
     */
    public Node(int element, Node next, Node prev) {
        this.element = element;
        this.next = next;
    }

    /**
     * Gets the next node
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * Gets the previous node
     */
    public Node getPrev() {
        return this.prev;
    }

    /**
     * Sets the pointer to the given node
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Sets the pointer to the given node
     */
    public void setPrev(Node prev) {
        this.prev = prev;
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

    /**
     * @return the element as a string
     */
    public String toString() {
        return String.valueOf(this.element);
    }

}
