public class QN9 {
    public static int primeCount(int start, int end) {
        if (start <= 2) {
            start = 2;
        }
        if (end < 0) {
            end = 0;
        }
        int noofPrime = 0;
        for (int i = start; i <= end; i++) {
            int isDivisibleFlag = 0;
            for (int j = 2; j <= (int) (i / 2); j++) {
                if (i % j == 0) {
                    isDivisibleFlag++;
                }
            }
            if (isDivisibleFlag == 0) {
                noofPrime++;
            }
        }
        return noofPrime;
    }

    public static void main(String[] args) {

        System.out.println(primeCount(11, 29));

    }
}
