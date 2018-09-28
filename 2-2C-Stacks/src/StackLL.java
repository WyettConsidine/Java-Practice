import java.util.LinkedList;

/**
 * Implements Stack with a linked list
 */
public class StackLL implements StackInterface{

    //The elements of the stack
    //Let the first element be the top
    private LinkedList<Double> ll;

    public StackLL() {
        this.ll = new LinkedList<Double>();
    }

    /**
     * Adds a double to the top of the stack
     * @param d
     */
    public void push(double d){
        this.ll.addFirst(d);
    }

    /**
     * returns the size of the stack
     * @return the number of elements in the stack
     */
    public int size(){
        return this.ll.size();
    }

    /**
     * Empties the stack
     */
    public void clear(){
        this.ll.clear();
    }

    /**
     * Peeks at the top element of the stack, not removing it
     * @return the top of the stack
     */
    public double peek(){
        return this.ll.getFirst();
    }

    /**
     * Removes the top element from the stack and returns it
     * @return the top of the stack
     */
    public double pop() {
        double toReturn = ll.getFirst();
        this.ll.removeFirst();
        return toReturn;
    }

    /**
     * @return the stack as a string
     */
    public String toString() {
        return this.ll.toString();
    }
}
