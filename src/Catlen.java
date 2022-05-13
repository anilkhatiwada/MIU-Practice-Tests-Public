public class Catlen {
    public static int CheckConcatenatedSum(int n, int catlen) {
        int nCheck = n;
        int sum = 0;
        int degit = 0;
        int Concat = 0;
        while (n > 0) {
            degit = n % 10;
            for (int i = 0; i < catlen; i++) {
                Concat = Concat * 10 + degit;
            }
            sum = sum + Concat;
            Concat = 0;
            n = (int) (n / 10);
        }
        if (nCheck == sum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(CheckConcatenatedSum(198, 3));

    }

}
