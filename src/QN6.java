public class QN6 {
    public static int f(int[] a) {
        int sumBeforePoe = 0;
        int sumAfterpoe = 0;
        int poe = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                sumBeforePoe = sumBeforePoe + a[j];
            }
            for (int k = i + 1; k < a.length; k++) {
                sumAfterpoe = sumAfterpoe + a[k];
            }
            if (sumBeforePoe == sumAfterpoe) {
                poe = i;
            }
            sumBeforePoe = 0;
            sumAfterpoe = 0;
        }
        return poe;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(f(arr));
    }
}
