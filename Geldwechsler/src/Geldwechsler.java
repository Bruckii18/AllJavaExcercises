public class Geldwechsler {
    static final double[] MUENZEN = {2,1,0.50,0.20,0.10,0.05,0.02,0.01};
    static double geldZuMuenzen = 27.65;

    public static void main(String[] args) {
        System.out.println(geldZuMuenzen+"€ kann man aufteilen in:");
        for (int i = 0; i < MUENZEN.length; i++) {
            int muenzenAnzahl = (int) ((geldZuMuenzen - (geldZuMuenzen % MUENZEN[i])) / MUENZEN[i]);
            double rest = geldZuMuenzen % MUENZEN[i];
            rest = Math.rint(rest * 100) / 100;
            System.out.println(muenzenAnzahl+" x "+MUENZEN[i]+"€");
            geldZuMuenzen = rest;
        }
    }
}
