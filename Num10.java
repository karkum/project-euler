/*
 * Problem: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
   Find the sum of all the primes below two million.
   
   Answer: 142913828922
   
   Algorithm: Sieve of Eratosthenes
 */

import java.math.BigInteger;

public class Num10 {
    private static final int N = 2000000;
    public static void main (String [] args) {
        
        boolean[] nums = new boolean[N];
        for (int i = 2; i < N; i++)
            nums[i] = true;
        for (int i = 2; i < Math.sqrt(N); i++)
        {
           if (nums[i])
           {
                for (int j = 2 * i; j < N; j += i)
                    nums[j] = false;
           }
        }
        long sum = 0;
        for (int i = 2; i< N; i++)
        {
            if (nums[i])
                sum += i;
        }
        System.out.println(sum);
    }
}
