public class QN2 {
    public static int f(int[] a) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                x = x + a[i];
            } else {
                y = y + a[i];
            }
        }
        return x - y;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        System.out.println(f(a));

    }
}
