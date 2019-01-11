/**
 * Created by eliag on 11/15/2018.
 */
public class Combined {

    Caesar caesarCipher;
    BottomRightColumnRow matrixTransposer;

    public Combined(Caesar caesarCipher, BottomRightColumnRow matrixTransposer) {
        this.caesarCipher = caesarCipher;
        this.matrixTransposer = matrixTransposer;
    }

    public String encode(String original) {
        return this.matrixTransposer.encode(this.caesarCipher.encode(original));
    }

    public String decode(String encoded) {
        return this.caesarCipher.decode(this.matrixTransposer.decode(encoded));
    }

}
