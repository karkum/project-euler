/*
 * Problem: Digit cancelling fractions
 *
 * Answer: 100
 *
 * Algorithm: Brute-force search
 */

import java.math.BigInteger;

public class Num33 {

    public static void main (String [] args) {
        double numDenom = 1.0;
        double numNum = 1.0;
        for (int i = 10; i < 99; i++) {
            for (int j = i + 1; j < 99; j++) {
                double value = ((double)i)/j;
                if (i % 10 == 0 || j % 10 == 0 || value >= 1) continue;
                char[] topChars = String.valueOf(i).toCharArray();
                char[] botChars = String.valueOf(j).toCharArray();

                if (topChars[1] == botChars[0]) {
                    double num = Double.valueOf("" + topChars[0]);
                    double denom = Double.valueOf("" + botChars[1]);
                    if (num/denom == value) {
                        numDenom *= denom;
                        numNum *= num;
                        System.out.println(i + "/" + j + "=" + value);
                    }
                }
            }
        }
        BigInteger numerator = BigInteger.valueOf(new Double(numNum).longValue());
        BigInteger denominator = BigInteger.valueOf(new Double(numDenom).longValue());
        int gcd = numerator.gcd(denominator).intValue();
        System.out.println((int)numDenom / gcd);
    }
}
