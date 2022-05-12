public class QN14 {
    public static int answerTwo(int[] a) {
        int maxOccoring = 0;
        int counterPrev = 0;
        int counterNow = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    counterNow++;
                }
                if (counterNow > counterPrev) {
                    maxOccoring = a[i];
                    counterPrev = counterNow;
                    counterNow = 0;
                } else {
                    counterNow = 0;
                }

            }
        }

        return maxOccoring;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 5, 1, 8, 6, 5 };
        System.out.println(answerTwo(arr));
    }
}
