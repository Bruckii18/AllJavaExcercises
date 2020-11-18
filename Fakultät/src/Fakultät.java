public class Fakultät {
    public static void main (String[] args) {
        System.out.println(faculty(5));
        System.out.println(faculty2(5));
    }

    static int faculty (int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
    static int faculty2 (int n) {
        if (n==1) return 1;
        return (n*faculty2(n-1));
    }
}
