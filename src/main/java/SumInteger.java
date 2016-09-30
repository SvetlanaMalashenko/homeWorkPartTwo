/**
 * Created by svetlana on 04.08.16
 */
public class SumInteger {
    public static void main(String[] args) {
        int n = 2;

        System.out.println(sumInt(n));
    }

    public static int sumInt(int n) {

        int result = 0;
        for(int i = 0; i <= n; i++) {
            result += i;
        }

        return result;
    }
}
