public interface Stack<E>
{
    void push(E obj); //place d on top of the stack
    E pop( ); //return top item in the stack and then remove from stack
    E peek( ); //return the top item in the stack and leave the stack intact
    int size( ); //returns the size (depth) of the stack
    boolean isEmpty(); // return true if Stack is empty

}
