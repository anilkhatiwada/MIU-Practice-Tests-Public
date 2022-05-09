package src;
public class QN5 {
    public static int[] append(int a, int[] arr) {
        int newArrLength = arr.length + 1;
        int[] newArray = new int[newArrLength];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArrLength - 1] = a;
        return newArray;
    }

    public static int[] f(int[] first, int[] second) {
        if (first == null) {
            return null;
        } else if (second == null) {
            return null;
        }
        int[] commonElement = {};
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    commonElement = append(first[i], commonElement);
                }
            }
        }
        return commonElement;
    }

    public static void main(String[] arr) {
        int[] f = { 1, 8, 3, 2, 6 };
        int[] s = { 2, 6, 1 };
        int[] commonElement = f(f, s);
        if (commonElement != null) {
            for (int i = 0; i < commonElement.length; i++) {
                System.out.println(commonElement[i]);
            }
        } else {
            System.out.println("Null");
        }

    }
}
