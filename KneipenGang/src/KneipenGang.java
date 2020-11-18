public class KneipenGang {
    public static String name;
    public static int gewicht;
    public static boolean is_female;
    private Alkohol halbeBier, seiterlBier, schnaps, wein;

    private class Alkohol {
        private final int milliLiter;
        private final double alkoholGehalt;
        private final String marke;
        private int anzahl;

        Alkohol(int milliLiter, double alkoholGehalt, String marke, int anzahl) {
            this.milliLiter = milliLiter;
            this.alkoholGehalt = alkoholGehalt;
            this.marke = marke;
            this.anzahl = anzahl;
        }

        public void addAnzahl(int anzahl) {
            if (anzahl >= 0)
                this.anzahl += anzahl;
        }
    }

    public KneipenGang() {
        name = "MeMyselfAndI"; // We are 3!
        gewicht = 70;
        is_female = false;
        halbeBier = new Alkohol(500, 4.8, "Zipfer", 0);
        seiterlBier = new Alkohol(300, 3.5, "Kaiser", 0);
        schnaps = new Alkohol(20, 60, "Birnenschnaps", 0);
        wein = new Alkohol(125, 15.0, "Portwein", 0);
    }

    public void registerBier(int anzahl, String typ) {
        if (typ == "halbe") {
            halbeBier.addAnzahl(anzahl);
        } else {
            seiterlBier.addAnzahl(anzahl);
        }
    }

    public void registerSchnaps(int anzahl) {
        schnaps.addAnzahl(anzahl);
    }

    public void registerWein(int anzahl) {
        wein.addAnzahl(anzahl);
    }

    private double getPureAlcohol(Alkohol drink) {
        return (drink.anzahl*drink.milliLiter)*drink.alkoholGehalt/100;
    }

    private double getPromill(double alkohol) {
        return (!is_female ? (alkohol * 0.8)/((gewicht)*0.68):(alkohol * 0.8)/((gewicht)*0.55));
    }

    public void alkoholReport() {
        System.out.println("Alkohol-Polizeilicher Tagesreport für: "+name);
        System.out.println("Bier ("+halbeBier.milliLiter+"): "+halbeBier.anzahl);
        System.out.println("Bier ("+seiterlBier.milliLiter+"): "+seiterlBier.anzahl);
        System.out.println("Wein ("+wein.milliLiter+"): "+wein.anzahl);
        System.out.println("Schnaps ("+schnaps.milliLiter+"): "+schnaps.anzahl);
        double gesamtAlkohol = getPureAlcohol(halbeBier)+getPureAlcohol(seiterlBier)+getPureAlcohol(wein)+getPureAlcohol(schnaps);
        System.out.println("Gesamt Alkohol: "+gesamtAlkohol+"ml");
        System.out.println("Promill (berechnet): "+getPromill(gesamtAlkohol));
    }
}