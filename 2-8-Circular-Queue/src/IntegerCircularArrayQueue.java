public class IntegerCircularArrayQueue implements Queue<Integer> {

    private int size;
    private int[] items;
    private int front = -1;
    private int rear = -1;

    IntegerCircularArrayQueue(int size) {
        this.size = size;
        this.items = new int[size];
    }

    public boolean isFull() {
        return ((this.front == this.rear + 1) || (this.front == 0 && this.rear == this.size-1));
    }

    @Override
    public boolean isEmpty() {
        return this.front == -1;
    }

    @Override
    public void enqueue(Integer obj) {
        if (this.isFull()) throw new ArrayIndexOutOfBoundsException("Queue is full.");
        if (this.front == -1) this.front = 0;
        this.rear = (this.rear + 1) % this.size;
        this.items[this.rear] = obj;
    }

    @Override
    public Integer dequeue() {
        if (this.isEmpty()) return null;
        int element = this.items[this.front];
        if (this.front == this.rear) {
            this.front = -1;
            this.rear = -1;
        } else {
            this.front = (this.front + 1) % this.size;

        }
        System.out.println("Removed " + Integer.toString(element));
        return element;
    }

    @Override
    public Integer peekFront() {
        if (this.isEmpty()) return null;
        return this.items[this.front];
    }

    @Override
    public int size() {
        return this.size;
    }

    public String toString() {
        if (this.isEmpty()) return "[]";
        String out = "Front: " + Integer.toString(this.front) + "\n Items: ";
        for (int i = this.front; i != this.rear; i = (i+1) % this.size) {
            out += Integer.toString(this.items[i]) + " ";
        }
        out += Integer.toString(this.items[this.rear]) + "\n";
        out += "Rear: " + Integer.toString(this.rear);
        return out;
    }

    public static void main(String[] args) {
        IntegerCircularArrayQueue q = new IntegerCircularArrayQueue(5);

        try {
            q.dequeue();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception");
        }

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        try {
            q.enqueue(6);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception");
        }

        System.out.println(q);

        q.dequeue();

        System.out.println(q);

        q.enqueue(7);

        System.out.println(q);

        // Fails to enqueue because front == rear + 1
        try {
            q.enqueue(8);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception");
        }
    }
}
