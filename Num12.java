/**
 * @author karthik.kumar
 */
public class Num12 {

    public static void main(String[] args) {
        int cumulative = 0;
        int i = 0;
        while(true) {
            int triagleNum = cumulative += i++;
            if (numDivisors(triagleNum) > 500) {
                System.out.print(triagleNum);
                break;
            }
        }
    }

    private static int numDivisors(int triagleNum) {
        int factors = 0;
        int mult = 1;
        while (mult <= Math.sqrt(triagleNum)) {
            if (triagleNum % mult == 0) {
                factors+= 2;
            }
            mult++;
        }

        return factors;
    }
}
