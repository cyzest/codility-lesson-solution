import org.junit.Test;

public class LocalTestCase {

    @Test
    public void test1() {

        int[] rotateArray = solution1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10);

        for (int arrayValue : rotateArray) {
            System.out.print(arrayValue);
        }
    }

    /**
     * Codility Score 100%
     */
    @Test
    public void test2() {
        int[] rotateArray = solution2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10);

        for (int arrayValue : rotateArray) {
            System.out.print(arrayValue);
        }
    }

    private int[] solution1(int[] array, int rotateNum) {

        int[] rotateArray = null;

        if (array != null) {

            rotateArray = array.clone();

            int rotateArrayLength = rotateArray.length;

            if (rotateArrayLength > 1 && rotateNum > 0) {

                int rotationCount = rotateNum % rotateArrayLength;

                // TODO rotationCount 수만큼 배열값 치환을 한번에 옮기는 방식으로 구현 가능
            }
        }

        return rotateArray;
    }

    private int[] solution2(int[] array, int rotateNum) {

        int[] rotateArray = null;

        if (array != null) {

            rotateArray = array.clone();

            int rotateArrayLength = rotateArray.length;

            if (rotateArrayLength > 1 && rotateNum > 0) {

                int rotationCount = rotateNum % rotateArrayLength;

                for (int i = 0; i < rotationCount; i++) {

                    int tempValue = rotateArray[rotateArrayLength - 1];

                    for (int j = rotateArrayLength - 2; j >= 0; j--) {
                        rotateArray[j + 1] = rotateArray[j];
                    }

                    rotateArray[0] = tempValue;
                }
            }
        }

        return rotateArray;
    }

}
