import java.util.HashMap;
import java.util.Map;

/**
 * @author karthik.kumar
 */
public class Num14 {

    public static void main(String [] args) {
        Map<Long, Long> counts = new HashMap<>();
        for (long i = 2; i < 1_000_000; i++) {
            if (counts.get(i) == null) {
                calculateSequenceLength(i, counts);
            }
        }
        System.out.println(findMax(counts));
    }

    private static Map.Entry<Long, Long> findMax(Map<Long, Long> counts) {
        Map.Entry<Long, Long> max = null;
        for (Map.Entry<Long, Long> entry : counts.entrySet()) {
            if (max == null || entry.getValue() > max.getValue()) {
                max = entry;
            }
        }
        return max;
    }

    private static long calculateSequenceLength(long n, Map<Long, Long> counts) {
        if (n == 1) {
            return 1;
        }
        if (counts.get(n) != null) {
            return counts.get(n);
        }

        counts.put(n, 1 + calculateSequenceLength(n % 2 == 0 ? n / 2 : 3 * n + 1, counts));
        return counts.get(n);
    }
}
