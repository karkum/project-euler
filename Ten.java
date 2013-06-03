import java.math.BigInteger;

public class Ten {
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
