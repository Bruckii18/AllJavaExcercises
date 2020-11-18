public class Sektkelch {

    public static void main(String[] args) {
        int stiellaenge = 7;
        zeichneSektkelch(stiellaenge);
    }

    static void zeichneSektkelch(int stiellaenge) {
        zeichneKelch(stiellaenge,stiellaenge+1);
        zeichneStiel(stiellaenge,stiellaenge);
        zeichneFuss(stiellaenge);
    }

    static void zeichneKelch(int stiellaenge, int leerzeichen) {
        if (stiellaenge > 0) {
            for (int i = 0; i < stiellaenge * 2 + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            int leer = leerzeichen - stiellaenge;
            if (stiellaenge > 1) {
                for (int i = 0; i < leer; i++) {
                    System.out.print(" ");
                }
            }
            stiellaenge = stiellaenge - 1;
            zeichneKelch(stiellaenge,leerzeichen);
        }
    }

    static void zeichneStiel(int stiellaenge,int leerzeichen) {

        for (int i = 0; i < leerzeichen;i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        if (stiellaenge > 1) {
            stiellaenge = stiellaenge -1;
            zeichneStiel(stiellaenge, leerzeichen);
        }

    }

    static void zeichneFuss(int stiellaenge) {
        for (int i = 0; i < stiellaenge * 2 + 1; i++) {
            System.out.print("*");
        }
    }
}
