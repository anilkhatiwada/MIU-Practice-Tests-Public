public class QN11 {
    public static int isMeera(int[] a) {
        boolean hasOne = false;
        boolean hasNine = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                hasOne = true;
            }
            if (a[i] == 9) {
                hasNine = true;
            }
        }
        if (hasNine && hasOne) {
            return 1;
        } else if (!hasOne && !hasNine) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 8, 0, 9, 9, 1 };
        System.out.println(isMeera(arr));
    }
}
