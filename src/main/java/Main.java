/**
 * Created by user on 18/05/2016.
 */
public class Main {
    public static void main(String args[]) {
        for (int index = 1; index <= 100; index++) {
            System.out.print(getResult(index));
            System.out.println();
        }
    }

    public static String getResult(int input) {
        String output = "";
        boolean isFooBarQix = false;

        if (isDivisibleBy(input, 3)) {
            output += "Foo";
            isFooBarQix = true;
        }
        if (isDivisibleBy(input, 5)) {
            output += "Bar";
            isFooBarQix = true;
        }
        if (isDivisibleBy(input, 7)) {
            output += "Qix";
            isFooBarQix = true;
        }

        char[] charArray = String.valueOf(input).toCharArray();
        for (char c : charArray) {

            if (contains(c, 3)) {
                output += "Foo";
                isFooBarQix = true;
            } else if (contains(c, 5)) {
                output += "Bar";
                isFooBarQix = true;
            } else if (contains(c, 7)) {
                output += "Qix";
                isFooBarQix = true;
            }
        }

        if (isFooBarQix) {

        } else {
            output = String.valueOf(input);
        }

        return output;
    }

    public static boolean isDivisibleBy(int numerator, int denominator) {
        if (numerator % denominator == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean contains(char numerator, int denominator) {
        if (String.valueOf(numerator).contains(String.valueOf(denominator))) {
            return true;
        } else {
            return false;
        }
    }
}
