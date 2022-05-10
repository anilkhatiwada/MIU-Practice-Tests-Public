public class QN1 {
  static int Center(int[] arr) {
    int lengthOfarray = arr.length;
    int indexOfMiddleElement = (int) (lengthOfarray / 2);
    int counter = 0;
    if (lengthOfarray % 2 == 0) {
      return 0;
    } else {
      for (int i = 0; i < lengthOfarray; i++) {
        if (arr[i] <= arr[indexOfMiddleElement] && i != indexOfMiddleElement) {
          counter++;
        }
      }
    }
    if (counter == 0) {
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    int[] data = {10};
    System.out.println(Center(data));
  }
}