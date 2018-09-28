public class DoubleLinkedListTester {

    public static void main(String args[]) {
        /*
        This is what the results should look like:
            Empty: true; size: 0
            Added 0-9: [0,1,2,3,4,5,6,7,8,9]
            Added -1 to index 0: [-1,0,1,2,3,4,5,6,7,8,9]
            Added 100 to index 5: [-1,0,1,2,3,100,4,5,6,7,8,9]
            Added -2 to end: [-1,0,1,2,3,100,4,5,6,7,8,9,-2]
            First: -1; 6th: 100; last: -2
            List: [-1,0,1,2,3,100,4,5,6,7,8,9,-2]
            Reversed: [-2,9,8,7,6,5,4,100,3,2,1,0,-1]
            Removed zero: [0,1,2,3,100,4,5,6,7,8,9,-2]
            Removed last: [0,1,2,3,100,4,5,6,7,8,9]
            Removed element at index 5: [0,1,2,3,100,5,6,7,8,9]
            Empty: false; size: 10
            List: [0,1,2,3,100,5,6,7,8,9]
            Cleared: []
            Empty: true; size: 0
            Added 0, 3, 6, ... , 27: [0,3,6,9,12,15,18,21,24,27]
            Added -1 to index 0: [-1,0,3,6,9,12,15,18,21,24,27]
            Added 100 to index 5: [-1,0,3,6,9,100,12,15,18,21,24,27]
            Added -2 to end: [-1,0,3,6,9,100,12,15,18,21,24,27,-2]
            First: -1; 6th: 100; last: -2
            List: [-1,0,3,6,9,100,12,15,18,21,24,27,-2]
            Reversed: [-2,27,24,21,18,15,12,100,9,6,3,0,-1]
            Removed zero: [0,3,6,9,100,12,15,18,21,24,27,-2]
            Removed last: [0,3,6,9,100,12,15,18,21,24,27]
            Removed element at index 5: [0,3,6,9,100,15,18,21,24,27]
            Empty: false; size: 10
            List: [0,3,6,9,100,15,18,21,24,27]
            Cleared: []
         */
        IntegerDoubleLinkedList list = new IntegerDoubleLinkedList();
        System.out.println("Empty: " + list.isEmpty() + "; size: " + list.getSize());
        for (int i = 0; i < 10; i ++) {
            list.add(i);
        }
        System.out.println("Added 0-9: " + list);
        list.add(0, -1);
        System.out.println("Added -1 to index 0: " + list);
        list.add(5, 100);
        System.out.println("Added 100 to index 5: " + list);
        list.add(12, -2);
        System.out.println("Added -2 to end: " + list);
        System.out.println("First: " + list.get(0) + "; 6th: " + list.get(5) + "; last: " + list.get(list.getSize() - 1));
        System.out.println("List: " + list);
        //Comment this if you don't implement reverse()
        System.out.println("Reversed: " + list.reverse());
        list.remove(0);
        System.out.println("Removed zero: " + list);
        list.remove(list.getSize() - 1);
        System.out.println("Removed last: " + list);
        list.remove(5);
        System.out.println("Removed element at index 5: " + list);
        System.out.println("Empty: " + list.isEmpty() + "; size: " + list.getSize());
        System.out.println("List: " + list);
        list.clear();
        System.out.println("Cleared: " + list);

        System.out.println("Empty: " + list.isEmpty() + "; size: " + list.getSize());
        for (int i = 0; i < 10; i ++) {
            list.add(3*i);
        }
        System.out.println("Added 0, 3, 6, ... , 27: " + list);
        list.add(0, -1);
        System.out.println("Added -1 to index 0: " + list);
        list.add(5, 100);
        System.out.println("Added 100 to index 5: " + list);
        list.add(12, -2);
        System.out.println("Added -2 to end: " + list);
        System.out.println("First: " + list.get(0) + "; 6th: " + list.get(5) + "; last: " + list.get(list.getSize() - 1));
        System.out.println("List: " + list);
        //Comment this if you don't implement reverse()
        System.out.println("Reversed: " + list.reverse());
        list.remove(0);
        System.out.println("Removed zero: " + list);
        list.remove(list.getSize() - 1);
        System.out.println("Removed last: " + list);
        list.remove(5);
        System.out.println("Removed element at index 5: " + list);
        System.out.println("Empty: " + list.isEmpty() + "; size: " + list.getSize());
        System.out.println("List: " + list);
        list.clear();
        System.out.println("Cleared: " + list);
    }

}