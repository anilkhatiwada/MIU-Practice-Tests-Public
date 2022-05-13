public class SequencedArray {
    public static int isSequencedArray(int[] a, int m, int n) {

        if (a[0] != m || a[a.length - 1] != n) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + 1 == a[i + 1] || a[i] == a[i + 1]) {
                continue;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(isSequencedArray(arr, 1, 5));
    }

}
