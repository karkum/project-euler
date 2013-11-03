/* Problem: The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * Answer: 6857
 *
 * Algorithm: Start at sqrt(n), decrement down until we find a factor 
 * that is also a prime.
 */
import java.math.BigInteger;

public class Num3 {
    public static final BigInteger MAGIC = new BigInteger("600851475143");
    public static void main (String [] args) {
        double start = (int)Math.sqrt(MAGIC.doubleValue());
        for (; start > 2; start--)
        {
            if (MAGIC.doubleValue() % start == 0)
            {
                BigInteger bi = new BigInteger("" + (int)start);
                if (bi.isProbablePrime(1))
                    break;
            }
        }
        System.out.println((int)start);
    }

}
