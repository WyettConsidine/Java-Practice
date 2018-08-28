import java.util.Arrays;
import java.util.Scanner;

/**
 * Main class for this exercise
 * Finds number of occurrences of 'sa' in an array
 */
public class Tester {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String command = "";
        while (!command.equals("dEXITd")) {
            //Prompt and read input
            System.out.print("Type in a sentence and press ENTER.");
            //The replaceAll statement prunes whitespace; toUpperCase converts the statement to uppercase
            command = "d" + scanner.nextLine().replaceAll("\\s", "").toUpperCase() + "d";
            //Split the command into substrings delimited by sp
            //There should be 1 more substrings than occurrences of sp
            String splitCommand[] = command.split("SA");
            //Return the occurrences of sp (even if exit is prompted, which may be a problem)
            System.out.println("There are " + (splitCommand.length - 1) + " occurrences.\n");
        }
    }

}
