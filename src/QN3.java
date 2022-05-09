public class QN3 {
    public static char[] f(char[] a, int start, int len) {
        if (len > a.length) {
            return null;
        } else {
            char[] newArr = new char[len];
            for (int i = start, j = 0; i <= len; i++, j++) {
                newArr[j] = a[i];
            }
            return newArr;
        }
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c' };
        System.out.println(f(arr, 1, 2));

    }
}
