public class SortierTanz {
    public static void main(String[] args) {
        int[] zahlenZuSortieren = {7, 9, 2, 6, 4, 4, -5, 0, 3};
        int[] sortierteZahlen = sortieren(zahlenZuSortieren);

        for (int i = 0; i < sortierteZahlen.length; i++) {
            System.out.print(sortierteZahlen[i] + " ");
        }
    }

    static int[] sortieren(int[] gemischteZahlen) {
        for (int j = 0; j < gemischteZahlen.length; j++)
            for (int i = 0; i < gemischteZahlen.length - 1; i++) {
                if (gemischteZahlen[i] > gemischteZahlen[i + 1]) {
                    int[] intArr = tauschen(gemischteZahlen[i], gemischteZahlen[i + 1]);
                    gemischteZahlen[i] = intArr[0];
                    gemischteZahlen[i + 1] = intArr[1];
                }
            }

        return gemischteZahlen;
    }

    static int[] tauschen(int a, int b) {
        int c = a;
        a = b;
        b = c;
        int[] intArr = {a, b};
        return intArr;
    }
}
