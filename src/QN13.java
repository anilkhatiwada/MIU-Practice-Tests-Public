import java.lang.Math;

public class QN13 {
    public static int answerOne(int n) {
        int noOfItirations = (int) (Math.sqrt(n));
        int noOfSquarePair = 0;
        for (int i = 1; i <= noOfItirations; i++) {
            for (int j = 1; j <= noOfItirations; j++) {
                if (i * i + j * j == n) {
                    noOfSquarePair++;
                }
            }
        }

        if (noOfSquarePair > 1) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(answerOne(50));
    }
}
