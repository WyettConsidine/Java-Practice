/**
 * Runs test cases
 */
public class Main {

    public static void main(String[] args) {
        IntegerArrayList list = new IntegerArrayList();
        System.out.println("The list is " + list);
        System.out.println("The list is empty? " + list.isEmpty());
        list.add(0);
        System.out.println("Add 0: " + list);
        for (int i = 0; i < 15; i++) {
            list.add(i + 1);
        }
        System.out.println("Add 1-15: " + list);
        System.out.println("List size: " + list.size());
        list.remove(6);
        System.out.println("Remove 6: " + list);
        System.out.println("List length: " + list.size());
        System.out.println("List element 4: " + list.get(4));
        list.add(5, 19);
        System.out.println("Add 19 at index 5: " + list);
    }

}
