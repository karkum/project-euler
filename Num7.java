/**
 * Problem: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 *
 * Answer: 104743
 */
public class Num7
{
    public static void main(String [] args) 
    {
        int count = 2;
        int i = 3;
        for (; count <= 10001; i+=2) 
        {
            if (isPrime(i))
            {
//                System.out.println(i);
                count++;
            }
        }
        System.out.println(i - 2);
    }

    private static boolean isPrime(int n)
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
