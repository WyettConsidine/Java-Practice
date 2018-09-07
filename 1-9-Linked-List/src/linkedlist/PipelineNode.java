package linkedlist;

/**
 * Contains an element of a linked list
 */
public class PipelineNode {

    //Instance variables have package visibility so that only the LinkedList can access them

    //The position of the element in the list
    int position;
    //The description of the element
    String description;
    //Points to the next node in the sequence
    PipelineNode nextNode;

    /**
     * Constructor
     */
    public PipelineNode(int pos, String descr, PipelineNode ptr) {
        this.position = pos;
        this.description = descr;
        this.nextNode = ptr;
    }

    /**
     * Describes the node's contents
     * @return a string containing the description and position
     */
    public String toString() {
        return this.description + " at " + String.valueOf(this.position) + " ft";
    }
}
