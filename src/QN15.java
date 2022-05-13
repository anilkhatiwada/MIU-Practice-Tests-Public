public class QN15 {
    public static int answerThree(int[] a) {
        if (a.length % 2 == 1) {
            return 0;
        } else {
            int sumFirstFlaf = 0;
            int sumSecondHalf = 0;
            for (int i = 0; i < (a.length / 2); i++) {
                sumFirstFlaf = sumFirstFlaf + a[i];
            }
            for (int j = (a.length / 2); j < a.length; j++) {
                sumSecondHalf = sumSecondHalf + a[j];
            }
            if (sumFirstFlaf != sumSecondHalf) {
                return 0;
            }

            return 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 3, 4, 6, 1 };
        System.out.println(answerThree(arr));

    }
}
