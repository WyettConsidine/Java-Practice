import java.util.ArrayList;
import java.util.LinkedList;

// LIFO Queue which can store Element type E (where Element is any Object type)
public class ArrayListQueue<E> implements Queue<E>
{
    // private ArrayList<E> - can store Element type E (where Element is any Object type)
    private ArrayList<E> list;

    public ArrayListQueue( ) //constructor
    {
        list = new ArrayList<E>( );
    }

    public void enqueue(E obj)
    {
        list.add(obj);
    }

    public E dequeue( )
    {
        E e = list.get(0);
        list.remove(0);
        return e;
    }

    public E peekFront()
    {
        return list.get(0);
    }

    public boolean isEmpty( )
    {
        return list.isEmpty();
    }

    public int size()
    {
        return list.size();
    }

    public static void main(String[] args)
    {
        LinkedListQueue<Integer> q = new LinkedListQueue<Integer>( );
        for (int i=1; i<=10; i++)
            q.enqueue(i);
        Integer i = q.dequeue();
        System.out.println(i);
    }
}
