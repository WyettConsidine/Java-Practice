/**
 * Created by eliag on 10/2/2018.
 */
public class HanoiSolver {

    public static IntArrayStack A = new IntArrayStack();
    public static IntArrayStack B = new IntArrayStack();
    public static IntArrayStack C = new IntArrayStack();

    public static void main(String[] args) {
        int size = 7;
        for (int i = 0; i < size; i++) {
            A.push(size - i);
        }
        move(A, C, B, size);
    }

    /**
     * Moves a number of discs between stacks, using an intermediary
     * @param src The source stack
     * @param dest The destination stack
     * @param intermediary The third stack
     * @param number The number of discs to move
     */
    private static void move(IntArrayStack src, IntArrayStack dest, IntArrayStack intermediary, int number) {
        if (number == 0) {
            return;
        }
        move(src, intermediary, dest, number - 1);
        dest.push(src.pop());
        System.out.println(
                "\nA: " + A + "\nB: " + B + "\nC: " + C
        );
        move(intermediary, dest, src, number - 1);
    }

}
