/**
 * Created by Tristan on 20.04.2014.
 */
public class ggT {
    private static int ggt(int zahl1, int zahl2) {
        while (zahl2 != 0) {
            if (zahl1 > zahl2) {
                zahl1 = zahl1 - zahl2;
            } else {
                zahl2 = zahl2 - zahl1;
            }
        }
        return zahl1;
    }
}
