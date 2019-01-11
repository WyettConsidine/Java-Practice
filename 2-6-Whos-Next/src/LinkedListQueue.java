import java.util.LinkedList;
// LIFO Queue which can store Element type E (where Element is any Object type)
public class LinkedListQueue<E> implements Queue<E>
{
    // private LinkedList<E> - can store Element type E (where Element is any Object type)
    private LinkedList<E> list;

    public LinkedListQueue() //constructor
    { 
        list = new LinkedList<E>(); 
    }

    public void enqueue(E obj)
    { 
        list.addLast(obj); 
    }

    public E dequeue()
    { 
        return list.removeFirst(); 
    }

    public E peekFront()
    { 
        return list.getFirst(); 
    }

    public boolean isEmpty()
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
