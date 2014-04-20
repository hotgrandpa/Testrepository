/**
 * Created by Tristan on 20.04.2014.
 */
public class ggT {
    private static int ggt(int zahl1, int zahl2) {
        if (zahl1 == zahl2) {
            return zahl1;
        }
        if (zahl1 > zahl2) {
            return ggt(zahl2, (zahl1 - zahl2));
        }
        return ggt(zahl2, (zahl2 - zahl1));
    }
}
