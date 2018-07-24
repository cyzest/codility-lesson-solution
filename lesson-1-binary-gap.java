import org.junit.Test;

public class LocalTestCase {

    /**
     * Codility Score 100%
     */
    @Test
    public void test1() {
        System.out.println(solution1(2147483647));
    }

    /**
     * Codility Score 93%
     */
    @Test
    public void test2() {
        System.out.println(solution2(2147483647));
    }

    private int solution1(int number) {

        int maxGap = 0;

        if (number > 0) {

            String binaryString = Long.toBinaryString(number);

            char[] binaryCharArray = binaryString.toCharArray();

            int gap = 0;

            for (char binaryChar : binaryCharArray) {

                if (binaryChar == 49) {
                    if (maxGap < gap) {
                        maxGap = gap;
                    }
                    gap = 0;
                } else if (binaryChar == 48) {
                    gap++;
                }
            }
        }

        return maxGap;
    }

    private int solution2(int number) {

        int maxGap = 0;

        if (number > 0) {

            boolean isStartGap = false;

            int gap = 0;

            while (true) {

                Integer quotient = number / 2;

                Integer remainder = number % 2;

                if (remainder == 1) {
                    isStartGap = true;
                    if (maxGap < gap) {
                        maxGap = gap;
                    }
                    gap = 0;
                } else if (remainder == 0 && isStartGap) {
                    gap++;
                } else {
                    isStartGap = false;
                    gap = 0;
                }

                if (quotient == 1) {
                    if (maxGap < gap) {
                        maxGap = gap;
                    }
                    break;
                }

                number = quotient;
            }
        }

        return maxGap;
    }

}
