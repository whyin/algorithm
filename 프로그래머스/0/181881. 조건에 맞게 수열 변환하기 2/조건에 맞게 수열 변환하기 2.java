import java.util.Arrays;

public class Solution {
    public static int solution(int[] arr) {
        int count = 0;
        int[] prev;

        while (true) {
            prev = Arrays.copyOf(arr, arr.length); // 이전 상태 복사

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
                // 나머지는 그대로
            }

            // 이전 상태와 동일하면 종료
            if (Arrays.equals(prev, arr)) break;

            count++;
        }

        return count;
    }
}