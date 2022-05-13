public class LargestAdSum {
    public static int largestAdjacentSum(int[] a) {
        int largetsum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > largetsum) {
                largetsum = a[i] + a[i + 1];
            }

        }
        return largetsum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        System.out.println(largestAdjacentSum(arr));

    }

}
