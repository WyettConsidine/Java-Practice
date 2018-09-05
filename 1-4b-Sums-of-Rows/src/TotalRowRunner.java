//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elia Gorokhovsky

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TotalRowRunner {

	public static void main(String args[]) {
        int input1[][] = {{1,2,3},{5,5,5,5}};
        System.out.println("Row totals are :: " + Arrays.toString(getSums(input1)));
        int input2[][] = {{1,2,3},{5},{1},{2,2}};
        System.out.println("Row totals are :: " + Arrays.toString(getSums(input2)));
        int input3[][] = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
        System.out.println("Row totals are :: " + Arrays.toString(getSums(input3)));
    }

    /**
     * @return an array of the sume of the matrix's rows
     */
    public static int[] getSums(int[][] matrix) {
        return Stream.of(matrix).map(
                //Convert every element of matrix into its sum
                a -> IntStream.of(a).reduce(0, (b, c) -> b + c)
                //Convert back to IntStream, then int[]
        ).mapToInt(it -> it).toArray();
    }
}



