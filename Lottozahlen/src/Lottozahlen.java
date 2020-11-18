import java.util.Random;
public class Lottozahlen {
    public static void main(String[] args) {
        int[] lottozahlen = new int[6];
        Random zufall = new Random();
        for (int i = 0; i < lottozahlen.length;i++) {
            lottozahlen[i] = Math.abs(zufall.nextInt()) % 49;
        }

        int[] lottozahlen1 = {12,12,12,13,23,23};
        lottozahlen1 = entdopple(lottozahlen1);
        for (int i = 0; i < lottozahlen1.length;i++) {
            System.out.print(lottozahlen[i]+" ");
        }
    }

    static int[] entdopple (int[] lottozahlen) {
        for (int i = 0; i < lottozahlen.length; i++) {
            for (int j = i + 1; j < lottozahlen.length-1;j++) {
                if (lottozahlen[i] == lottozahlen[j]) {
                    Random zufall = new Random();
                    lottozahlen[j] = Math.abs(zufall.nextInt()) % 45;
                    i = 0;
                    j = i + 1;
                }
            }
        }
        return lottozahlen;
    }
}
