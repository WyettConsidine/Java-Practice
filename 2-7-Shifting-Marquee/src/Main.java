import java.util.LinkedList;

/**
 * Created by eliag on 11/13/2018.
 */
public class Main {

    public static void main(String[] args) {
        String[] inputlines = {
                "7",
                "DELL 29.85  VIGN 14.82  MOT 26.27  JDSU 1.95  PAGE .94  MCLL .32  ",
                "22",
                "VSSL 22.80  CCC 18.22  IBM 12.66  COK 11.86  AL 22.00  ",
                "12",
                "UUJ 11.01  HP 23.27  CSCO 19.86  ZW 12.75  BTDF 22.96  "
        };

        for (int i = 0; i < inputlines.length / 2; i++) {
            char[] chars = inputlines[2 * i + 1] .toCharArray();
            LinkedList<Character> marquee = new LinkedList<Character>();
            for (char element : chars) {
                marquee.addLast(element);
            }
            for (int j = 0; j < Integer.parseInt(inputlines[2 * i]); j++) {
                marquee.addLast(marquee.removeFirst());
            }
            String out = "";
            for (int j = 0; j < 40; j++) {
                out += marquee.removeFirst();
            }
            System.out.println(out);
        }

    }

}
