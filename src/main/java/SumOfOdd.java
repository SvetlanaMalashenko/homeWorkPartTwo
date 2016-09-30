/**
 * Created by svetlana on 04.08.16
 */
public class SumOfOdd {
    public static void main(String[] args) {
        int n = 23745;
        int sum = 0;

        System.out.println(sumCount(n, sum));
    }
    public static int sumCount(int n, int sum) {

        int number = 0;

        do {
            number = n % 10;
            if (number % 2 != 0) {
                sum++;
            }

            n = n / 10;
        } while (n > 0);

        return sum;
    }
}
