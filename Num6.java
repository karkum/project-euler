public class Num6
{
    public static void main(String [] args) {
        int sumofsquares = 0;
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sumofsquares += i*i;
            sum += i;
        }
        System.out.println(sum*sum - sumofsquares);
    }
}
