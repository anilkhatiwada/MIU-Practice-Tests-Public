public class QN10 {
    public static int isfancy(int n) {
        if (n == 1) {
            return 1;
        }
        int a = 1;
        int b = 1;
        while (n >= b) {
            a = b * 3 + 2 * a;
            if (n == a) {
                return 1;
            }
            b = a * 3 + 2 * b;
            if (b == n) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isfancy(62));
    }
}
