import linkedlist.LinkedList;

/**
 * Tests the code
 */
public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append(0, "Pump station");
        linkedList.append(3050, "Hwy 35");
        linkedList.append(4573, "Tank farm");

        linkedList.traverseAndPrint();

        System.out.println("Adding Cold Creek at index 2: \n");

        linkedList.insert(4040, "Cold Creek", 2);

        linkedList.traverseAndPrint();
    }

}
