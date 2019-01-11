/**
 * Created by eliag on 11/15/2018.
 */
public class Caesar {

    private int howFar;
    static String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String shifted = "";

    public Caesar() {
        this.howFar = (int) (Math.random() * 26);
        for (int i = 0; i < 26; i++) {
            shifted += alph.charAt((i + howFar) % 26);
        }
    }

    public String encode(String original) {
        String out = "";
        for (char character: original.toCharArray()) {
            out += this.shifted.charAt(alph.indexOf(Character.toUpperCase(character)));
        }
        return out;
    }

    public String decode(String encoded) {
        assert(encoded.toUpperCase().equals(encoded));
        String out = "";
        for (char character: encoded.toCharArray()) {
            out += alph.charAt(this.shifted.indexOf(Character.toUpperCase(character)));
        }
        return out;
    }

}
