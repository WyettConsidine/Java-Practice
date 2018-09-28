// Intended output:
// Linked 1:
// 0 1 2 3 4 5
// false
// Linked 2:
// 1 2 4
// false

public class IntegerListTester {

    public static void main(String args[]) {
        IntegerLinkedList l1 = new IntegerLinkedList();
        l1.add(0, 0);
        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(2, 2);
        l1.add(5, 5);
        System.out.println("Linked 1:");
        System.out.println(l1);
        System.out.println(l1.isEmpty());
        IntegerLinkedList l2 = new IntegerLinkedList();
        l2.add(0, 0);
        l2.add(1);
        l2.add(3);
        l2.add(4);
        l2.add(2, 2);
        l2.add(5, 5);
        l2.remove(0);
        l2.remove(3);
        l2.remove(l2.getSize() - 1);
        System.out.println("Linked 2:");
        System.out.println(l2);
        System.out.println(l2.isEmpty());
    }

}