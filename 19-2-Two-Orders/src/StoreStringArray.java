import java.util.Arrays;

/**
 * Sorts a list of names
 */
public class StoreStringArray {

    public static void main(String[] args) {
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        System.out.println("Ascend     Descend\n");
        String spaces = "       ";
        for (int i = 0; i < ss.length; i++) {
            //Calculate how many spaces necessary for correct formatting
            String missingSpaces = spaces.substring(0, spaces.length() - ss[i].length());
            System.out.println(ss[i] + missingSpaces + "    " + ss[ss.length - 1 - i]);
        }
        int h = 0;
        System.out.println(h++);
    }

}
