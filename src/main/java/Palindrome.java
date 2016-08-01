import java.util.Arrays;

/**
 * Created by svetlana on 27.07.16
 */
public class Palindrome {
    public static void main(String[] args) {
        String str = "арген тина м анит негра";
        int [] array = {1,2,3,1};

        System.out.println("String is palindrome? " + palindromeString(str));
        System.out.println("Digit is palindrome? " + palindromeArray(array));
    }

    public static boolean palindromeString(String str) {
        String palindrome = "";
        for(int i = str.length()-1; i>=0; i--) {
            palindrome += str.substring(i, i+1);
        }
        return str.equals(palindrome);
    }

    public static boolean palindromeArray(int array[]) {
        int[] palindrome = new int[array.length];
        int count = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            palindrome[count] = array[i];
            count++;
        }

        if(Arrays.toString(palindrome).equals(Arrays.toString(array))) { // Dear Efrat, Why I can not compare array.equals(palindrome)?
            return true;
        }
        return false;
    }
}
