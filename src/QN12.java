public class QN12 {
    public static int isBean(int[] a) {
        boolean two_n = false;
        boolean two_n_plus_one = false;
        boolean n_by_two = false;
        int sucessCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((int) (a[i] / 2) == a[j]) {
                    two_n = true;
                }
                if ((int) (2 * a[i] + 1) == a[j]) {
                    two_n_plus_one = true;
                }
                if ((int) (2 * a[i] + 1) == a[j]) {
                    n_by_two = true;
                }
            }
            if (two_n || two_n_plus_one || n_by_two) {
                sucessCount++;
            }
        }
        if (sucessCount == a.length) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 4 };
        System.out.println(isBean(arr));
    }
}
