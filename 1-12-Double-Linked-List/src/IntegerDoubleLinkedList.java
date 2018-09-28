/**
 * A linked list of integers
 */
public class IntegerDoubleLinkedList {

    //The first node
    Node head;
    //The last node
    Node tail;

    public IntegerDoubleLinkedList() {}

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
        Node newNode = new Node(x, null, null);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else if (index == 0) {
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;
        } else {
            newNode.setNext(this.getForwardNode(index - 1).getNext());
            this.getForwardNode(index - 1).setNext(newNode);
            newNode.setPrev(this.getForwardNode(index - 1));
            if (newNode.getNext() == null) {
                this.tail = newNode;
            } else {
                newNode.getNext().setPrev(newNode);
            }
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
        this.tail = null;
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
            throw new ArrayIndexOutOfBoundsException("Get: index " + String.valueOf(index) +  " out of bounds");
        }
        return index < this.getSize() / 2 ? this.getForwardNode(index) : this.getBackwardNode(index);
    }

    /**
     * Gets the node at index by iterating forward from head
     */
    private Node getForwardNode(int index) {
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    /**
     * Gets the node at index by iterating backward from head
     */
    private Node getBackwardNode(int index) {
        Node currentNode = this.tail;
        for (int i = this.getSize() - 1; i > index; i--) {
            currentNode = currentNode.getPrev();
        }
        return currentNode;
    }

    /**
     * Removes the Node at the given index from the List
     */
    public void remove(int index) {
        if (index == 0) {
            this.head = this.head.getNext();
            this.head.setPrev(null);
            return;
        }
        if (index == this.getSize() - 1) {
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
            return;
        }
        Node prevNode = this.getNode(index - 1);
        prevNode.setNext(prevNode.getNext().getNext());
        prevNode.getNext().setPrev(prevNode);
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
        if (this.isEmpty()) return "[]";
        String representation = "[";
        Node currentNode = this.head;
        for (int i = 0; i < this.getSize(); i++) {
            representation += currentNode + ",";
            currentNode = currentNode.getNext();
        }
        representation = representation.substring(0, representation.length() - 1);
        representation += "]";
        return representation;
    }

    /**
     * Returns a new linked list with the elements reversed
     */
    public IntegerDoubleLinkedList reverse() {
        IntegerDoubleLinkedList newList = new IntegerDoubleLinkedList();
        Node currentNode = this.tail;
        for (int i = 0; i < this.getSize(); i++) {
            newList.add(currentNode.getElement());
            currentNode = currentNode.getPrev();
        }
        newList.tail = this.head;
        assert this.head == currentNode;
        return newList;
    }

}
