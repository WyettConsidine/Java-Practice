import java.util.Arrays;

/**
 * Replicates array list functionality with integers
 */
public class IntegerArrayList {

    //The list of elements
    //We want them to be nullable
    private int[] components;
    //How many elements the arraylist should have
    private int size;

    /**
     * Constructs the arraylist with 10 null components
     */
    public IntegerArrayList() {
        this.components = new int[10];
    }

    /**
     * Adds an element to the array
     * @param element the element to add
     */
    public void add(int element) {
        this.size++;
        if (this.components.length < this.size) {
            this.increaseLength();
        }
        this.components[this.size -  1] = element;
    }

    /**
     * Adds an element at the specified index, displacing the rest of the elements forward
     * @param index the index that the element will be at once added
     * @param element the element to add
     */
    public void add(int index, int element) {
        this.size++;
        if (this.components.length < this.size) {
            this.increaseLength();
        }
        System.arraycopy(this.components, index - 1, this.components, index, this.size - index);
        this.components[index] = element;
    }

    /**
     * Empties the arraylist and resets its size
     */
    public void clear() {
        this.components = new int[10];
        this.size = 0;
    }

    /**
     * Gets the specified element of the array, or throws an exception
     * @param index where to get the element
     * @return the element at that index
     */
    public int get(int index) {
        if (index >= this.size) throw new IndexOutOfBoundsException("IntegerArrayList \'get\' index out of bounds");
        return this.components[index];
    }

    /**
     * Removes an element at a specified index, or throws an exception
     * @param index where to get the element
     */
    public void remove(int index) {
        if (index >= this.size) throw new IndexOutOfBoundsException("IntegerArrayList \'remove\' index out of bounds");
        this.size--;
        System.arraycopy(this.components, index + 1, this.components, index, this.components.length - index - 1);
        this.components[this.size] = 0;
    }

    /**
     * Returns the size of the array
     * @return size of the array
     */
    public int size() {
        return this.size;
    }

    /**
     * Verifies if the size of the arraylist is 0
     * @return if the arraylist is empty
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * @return a string representation of the list
     */
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(this.components, 0, this.size));
    }

    /**
     * Increases the length of the array
     */
    private void increaseLength() {
        int[] placeholder = new int[this.components.length * 2];
        System.arraycopy(this.components, 0, placeholder, 0, this.components.length);
        this.components = placeholder;
    }

}
