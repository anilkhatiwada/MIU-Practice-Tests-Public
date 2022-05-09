import java.lang.Math;

public class QN7 {
    public static int isPerfectSquare(int n) {
        if (n < 0) {
            return 0;
        }
        int base = (int) (Math.sqrt(n)) + 1;
        return base * base;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPerfectSquare(n));
    }
}
