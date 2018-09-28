/**
 * Tests a stack
 */
public class StackTester {
    public static void main(String args[]){
        StackLL stck = new StackLL();
        System.out.println(stck.size()); //0
        stck.push(157.3);
        stck.push(22);
        stck.push(-18);
        double j = stck.pop();
        System.out.println(j);
        System.out.println(stck.peek());
        System.out.println(stck.pop());
        System.out.println(stck.size());
        stck.clear();
        System.out.println(stck.size());

        /* Correct Return:
          0
         -18.0
          22.0
          22.0
          1
          0
         */
    }
}
