public class QN4 {
    public static int f(int n) {
        int reverse = 0, reminder = 0;

        while (n > 0) {
            reminder = n % 10;
            reverse = (reverse * 10) + reminder;
            n = (int) (n / 10);
        }
        return reverse;
    }

    public static void main(String[] arr) {
        int n = 1234;
        System.out.println(f(n));

    }
}
