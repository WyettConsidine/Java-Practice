//From BluePelicanJava Lesson 52
public interface Queue<E>
{
    boolean isEmpty( ); //returns true if nothing in the queue
    void enqueue(E obj ); //places object obj at the back of the queue
    E dequeue( ); //removes and returns object at front of the list
    E peekFront( ); //returns object at the front of the list
    int size(); //returns the number of elements in the queue
}
