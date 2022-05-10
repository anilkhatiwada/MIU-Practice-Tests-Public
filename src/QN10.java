// Yet to finish 
public class QN10 {
    public static int isfancy(int n) {
        if (n == 1) {
            return 1;
        }
        int prev = 1;
        int now = 1;
        int isfancy = 0;
        while (now <= n) {
            prev = prev * 3 + now * 2;
            System.out.println(Integer.toString(prev) + "x 3 + 2 x" + Integer.toString(now * 2) + '='
                    + Integer.toString(prev * 3 + now * 2));
            now = prev * 3 + now * 2;
            System.out.println(Integer.toString(prev) + "x 3 + 2 x" + Integer.toString(now * 2) + '='
                    + Integer.toString(prev * 3 + now * 2));
            // if (n == a) {
            // isfancy = 1;
            // }

            // if (n == b) {
            // isfancy = 1;
            // }

        }
        return isfancy;
    }

    public static void main(String[] args) {
        System.out.println(isfancy(61));
    }
}
