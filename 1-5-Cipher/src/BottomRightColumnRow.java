import java.util.Arrays;

/**
 * Created by eliag on 11/15/2018.
 */
public class BottomRightColumnRow {

    public String encode(String original) {
        int matrixSize = 0;
        while(matrixSize * matrixSize < original.length()) {
            matrixSize++;
        }
        char[][] matrix = new char[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize * matrixSize; i++) {
            if (i < original.length()) {
                matrix[i / matrixSize][i % matrixSize] = original.charAt(i);
            } else {
                matrix[i / matrixSize][i % matrixSize] = '*';
            }
        }
        String out = "";
        for (int i = matrixSize * matrixSize - 1; i >= 0; i--) {
            out += matrix[i % matrixSize][i / matrixSize];
        }
        return out;
    }

    public String decode(String encoded) {
        int matrixSize = (int)Math.sqrt(encoded.length());
        char[][] matrix = new char[matrixSize][matrixSize];
        for (int i = matrixSize * matrixSize - 1; i >= 0; i--) {
            matrix[i % matrixSize][i / matrixSize] = encoded.charAt(matrixSize * matrixSize - 1 - i);
        }
        String out = "";
        for (int i = 0; i < matrixSize * matrixSize; i++) {
            out += matrix[i / matrixSize][i % matrixSize];
        }
        return out.replaceAll("\\*", "");
    }

}
