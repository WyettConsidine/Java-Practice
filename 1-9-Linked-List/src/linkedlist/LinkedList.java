package linkedlist;

/**
 * Contains and handles multiple pipeline nodes
 */
public class LinkedList {

    //The first element in the linked list
    private PipelineNode head;
    //The last element in the linked list
    private PipelineNode tail;

    /**
     * Adds a new element to the list, adjusting pointers
     */
    public void append(int pos, String descr) {
        PipelineNode newNode = new PipelineNode(pos, descr, null);
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.nextNode = newNode;
        }
        this.tail = newNode;
    }

    /**
     * Inserts an element at the given index
     * @param pos The position of the node along the pipeline in feet
     * @param descr The node's description
     * @param index Where to insert it
     */
    public void insert(int pos, String descr, int index) {
        if (index == 0) {
            PipelineNode newNode = new PipelineNode(pos, descr, this.head);
            this.head = newNode;
            return;
        }
        PipelineNode beforeNode = this.get(index - 1);
        PipelineNode afterNode = beforeNode.nextNode;
        PipelineNode newNode = new PipelineNode(pos, descr, afterNode);
        beforeNode.nextNode = newNode;
    }

    /**
     * Prints the elements of the linked list
     */
    public void traverseAndPrint() {
        int index = -1;
        PipelineNode currentNode = this.head;
        do {
            index++;
            System.out.println("Node Number: " + index);
            System.out.println("Node contents: " + currentNode + "\n");
            currentNode = currentNode.nextNode;
        } while (currentNode != null);
    }

    /**
     * Gets the element at the specified index, or the last element
     * @param index The index
     * @return The element at the index
     */
    public PipelineNode get(int index) {
        PipelineNode currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.nextNode;
            if (currentNode == null || index < 0) {
                throw new IndexOutOfBoundsException("Linked list index out of bounds");
            }
        }
        return currentNode;
    }

}
