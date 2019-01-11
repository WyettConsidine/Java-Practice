import java.util.LinkedList;
// FIFO Stack which can store Element type E (where Element is any Object type)
public class LinkedListStack<E> implements Stack<E>
{
    // private LinkedList<E> - can store Element type E (where Element is any Object type)
    private LinkedList<E> list;

    public LinkedListStack( ) //constructor
    { 
        list = new LinkedList<E>( ); 
    }
    public void push(E obj)
    { 
        list.addLast(obj); 
    }
    public E pop( )
    { 
        return list.removeLast( ); 
    }
    public E peek( )
    { 
        return list.getLast( ); 
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

