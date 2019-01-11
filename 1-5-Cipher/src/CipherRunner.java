/**
 * Created by eliag on 11/15/2018.
 */
public class CipherRunner {

    public static void main(String[] args) {
        Caesar caesarCipher = new Caesar();
        String[] testCases = {
                "friendly",
                "abc",
                "dnadoublehelix",
                "cipherscodesandstrings",
                "elvissoundgardenhinderseetherbeatles"
        };
        System.out.println("CAESAR TEST CASES: \n");
        for (String testCase: testCases) {
            String encoded = caesarCipher.encode(testCase);
            System.out.println(testCase);
            System.out.println(encoded);
            System.out.println(caesarCipher.decode(encoded));
            System.out.println("");
        }

        BottomRightColumnRow matrixTransposer = new BottomRightColumnRow();
        System.out.println("TRANSPOSITIONAL TEST CASES: \n");
        for (String testCase: testCases) {
            String encoded = matrixTransposer.encode(testCase);
            System.out.println(testCase);
            System.out.println(encoded);
            System.out.println(matrixTransposer.decode(encoded));
            System.out.println("");
        }

        Combined combinedCipher = new Combined(caesarCipher, matrixTransposer);
        System.out.println("COMBINED TEST CASES: \n");
        for (String testCase: testCases) {
            String encoded = combinedCipher.encode(testCase);
            System.out.println(testCase);
            System.out.println(encoded);
            System.out.println(combinedCipher.decode(encoded));
            System.out.println("");
        }
    }

}
