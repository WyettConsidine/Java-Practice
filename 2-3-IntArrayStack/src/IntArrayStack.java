import java.util.Arrays;

/**
 * A stack using an integer array
 */
public class IntArrayStack {

    //The elements of the stack, ordered from bottom to top
    private int[] elements;
    //The number of elements of the array taken up by stack elements
    private int size;

    /**
     * Initialize the elements array to have some space in it initially
     */
    public IntArrayStack() {
        this.size = 0;
        this.elements = new int[10];
    }

    /**
     * Checks that the stack is empty
     * @return true if there are no stack elements in the array
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Looks at and removes the top item of the stack
     * @return the top item of the stack
     */
    public int pop() {
        this.size--;
        return this.elements[this.size];
    }

    /**
     * Adds the element to the top of the stack
     * @param x the element to add
     */
    public void push(int x) {
        if (this.size == this.elements.length) {
            int[] placeholder = new int[2 * this.elements.length];
            System.arraycopy(this.elements, 0, placeholder, 0, this.elements.length);
        }
        this.elements[this.size] = x;
        this.size++;
    }

    /**
     * @return the elements of the stack, from bottom to top
     */
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(this.elements, 0, this.size));
    }

}
