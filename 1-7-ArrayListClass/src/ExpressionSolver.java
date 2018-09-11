import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Solves expressions
 */
public class ExpressionSolver {

    public static void main(String[] args) {
        System.out.println("3 + 5 = " + solve("3 + 5"));
        System.out.println("3 - 53 * 5 = " + solve("3 - 53 * 5"));
        System.out.println("3 / 5 = " + solve("3 / 5"));
        System.out.println("5 / 5 * 2 + 8 / 2 + 5 = " + solve("5 / 5 * 2 + 8 / 2 + 5"));
        System.out.println("5 * 5 + 2 / 2 - 8 + 5 * 5 – 2 = " + solve("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2"));
    }

    public static int solve(String input) {
        //Format input
        input = input.trim();
        input = input.replaceAll("[+]", " + ");
        input = input.replaceAll("-", " - ");
        input = input.replaceAll("/", " / ");
        input = input.replaceAll("[*]", " * ");
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(input.split(" ")));
        inputList.removeAll(Collections.singleton(""));
        //Deal with multiplication
        while (inputList.contains("*") || inputList.contains("/")) {
            for (int i = 0; i < inputList.size(); i++) {
                if (inputList.get(i).equals("*")) {
                    int lhs = Integer.valueOf(inputList.get(i - 1));
                    int rhs = Integer.valueOf(inputList.get(i + 1));
                    inputList.set(i - 1, String.valueOf(lhs * rhs));
                    inputList.remove(i);
                    inputList.remove(i);
                    continue;
                } else if (inputList.get(i).equals("/")) {
                    int lhs = Integer.valueOf(inputList.get(i - 1));
                    int rhs = Integer.valueOf(inputList.get(i + 1));
                    inputList.set(i - 1, String.valueOf(lhs / rhs));
                    inputList.remove(i);
                    inputList.remove(i);
                    continue;
                }
            }
        }
        //Deal with addition
        while (inputList.contains("+") || inputList.contains("-")) {
            for (int i = 0; i < inputList.size(); i++) {
                if (inputList.get(i).equals("+")) {
                    int lhs = Integer.valueOf(inputList.get(i - 1));
                    int rhs = Integer.valueOf(inputList.get(i + 1));
                    inputList.set(i - 1, String.valueOf(lhs + rhs));
                    inputList.remove(i);
                    inputList.remove(i);
                    break;
                } else if (inputList.get(i).equals("-")) {
                    int lhs = Integer.valueOf(inputList.get(i - 1));
                    int rhs = Integer.valueOf(inputList.get(i + 1));
                    inputList.set(i - 1, String.valueOf(lhs - rhs));
                    inputList.remove(i);
                    inputList.remove(i);
                    break;
                }
            }
        }
        return Integer.valueOf(inputList.get(0));
    }

}
