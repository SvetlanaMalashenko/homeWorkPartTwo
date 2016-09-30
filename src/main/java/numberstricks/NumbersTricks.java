package numberstricks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by svetlana on 21.08.16
 */
public class NumbersTricks {

    public static void main(String[] args) throws IOException {
        int [] arrayInputs = {1, 3, 3, 2, 6, 5, 6, 7, 8, 9} ;
        int numberToFind = 6;
        int one = 1;
        int two = 2;

        System.out.println("calculateTotal: " + calculateTotal(arrayInputs));

        System.out.println("calculateTotalWithInput: " + calculateTotalWithInput(arrayInputs));

        convertToName(arrayInputs);

        System.out.println("getNumOccurrences: " + getNumOccurrences(arrayInputs, numberToFind));

        System.out.println("int1 is equal to input int2? " + equals(arrayInputs));

        System.out.println("input int1 as string is equal to int2 as String? " + equals(one,two));

          toTwoDimensional(arrayInputs);
    }

    public static int calculateTotal(int[] arrayInputs) {
        int result = 0;

        for(int i = 0; i < arrayInputs.length; i++) {
            result += arrayInputs[i];
        }
        return result;
    }

    public static int calculateTotalWithInput(int[] arrayInputs) throws IOException {
        int result = 0;

        for(int i = 0; i < arrayInputs.length; i++) {
            result += arrayInputs[i];
        }
        return result + inputNumber();
    }

    public static void convertToName(int[] arrayInputs ) {
        String result = "";
        String [] arrayNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        for(int i = 0; i < arrayInputs.length; i++) {
            result = arrayNames[arrayInputs[i]];
            System.out.println("convertToName: " + result);
        }
    }

    public static int getNumOccurrences(int[] arrayInputs, int numberToFind) {
        int count = 0;

        for(int i = 0; i < arrayInputs.length-1; i++) {
            if(arrayInputs[i] == numberToFind) {
                count++;
            }
        }
        return count;
    }

    public static boolean equals(int[] arrayInputs) {

        return arrayInputs[1] == arrayInputs[2];
    }

    public static boolean equals(int one, int two) {
        String oneString = Integer.toString(one);
        String twoString = Integer.toString(two);

        if(oneString.equals(twoString)) {
            return true;
        }
        return false;
    }

    public static int[][] toTwoDimensional(int[] arrayInputs) {
        int[][] twoDimensional = new int [10][2];

        System.out.print("The first row: " );
        for(int i = 0; i < arrayInputs.length; i++) {
            System.out.print((twoDimensional[i][0] = arrayInputs[i]) + " ");
        }

        System.out.println();

        System.out.print("The second row: " );
        for(int j= 0; j < arrayInputs.length; j++) {
            System.out.print((twoDimensional[j][1] = arrayInputs[j]) + " ");
        }
        return twoDimensional;
    }

    private static int inputNumber() throws IOException {
        BufferedReader inputNumber = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer:");
        int i = Integer.parseInt(inputNumber.readLine());
        return i;
    }
}
