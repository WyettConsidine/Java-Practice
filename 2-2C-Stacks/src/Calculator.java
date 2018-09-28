import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Using a stack, computes values
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner inputGetter = new Scanner(System.in);
        StackLL stack = new StackLL();
        String input = "";
        while (!input.toUpperCase().equals("Q")) {
            System.out.print("Enter number, math operation(+,-,*, or /), or Q to quit: ");
            input = inputGetter.nextLine();
            Double number = safeToDouble(input);
            if (number != null) {
                stack.push(number);
            } else if (input.equals("+")) {
                double number2 = stack.pop();
                double number1 = stack.pop();
                stack.push(number1 + number2);
            } else if (input.equals("-")) {
                double number2 = stack.pop();
                double number1 = stack.pop();
                stack.push(number1 - number2);
            } else if (input.equals("*")) {
                double number2 = stack.pop();
                double number1 = stack.pop();
                stack.push(number1 * number2);
            } else if (input.equals("/")) {
                double number2 = stack.pop();
                double number1 = stack.pop();
                stack.push(number1 / number2);
            }
        }
        if (stack.size() > 1) {
            System.out.println("Multiple numbers on stack; assuming first.");
        }
        System.out.println("The answer is " + Double.toString(stack.peek()));
    }

    /**
     * Checks if something is a double or returns null
     * @param s the string to check
     * @return the string to a double if it is convertible, else null
     */
    private static Double safeToDouble(String s) {
        Double num = null;
        try {
            num = Double.parseDouble(s);
        } catch (NumberFormatException error) {}
        return num;
    }

}
