import java.util.ArrayList;
import java.util.LinkedList;

// FIFO Stack which can store Element type E (where Element is any Object type)
public class ArrayListStack<E> implements Stack<E>
{
    // private ArrayList<E> - can store Element type E (where Element is any Object)
    private ArrayList<E> list;

    public ArrayListStack() //constructor
    {
        list = new ArrayList<E>();
    }
    public void push(E obj)
    {
        list.add(obj);
    }
    public E pop( )
    {
        E e = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return e;
    }
    public E peek( )
    {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty( )
    {
        return list.isEmpty( );
    }

    public int size()
    {
        return list.size();
    }
    public static void main(String[] args)
    {
        LinkedListStack<Integer> s = new LinkedListStack<Integer>( );
        for (int i=1; i<=10; i++)
            s.push(i);
        Integer i = s.pop();
        System.out.println(i);
    }
}