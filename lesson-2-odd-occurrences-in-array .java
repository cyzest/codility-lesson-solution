import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class LocalTestCase {

    /**
     * Codility Score 100%
     */
    @Test
    public void test() {
        System.out.println(solution(new int[]{1, 1, 3, 3, 5, 5, 7, 8, 7}));
    }

    private int solution(int[] array) {

        int arrayLength = array.length;

        Set<Integer> unpairedSet = new HashSet<>();

        for (int i = 0; i < arrayLength; i++) {
            int value = array[i];
            if (unpairedSet.contains(value)) {
                unpairedSet.remove(value);
            } else {
                unpairedSet.add(value);
            }
        }

        return unpairedSet.iterator().next();
    }

}
