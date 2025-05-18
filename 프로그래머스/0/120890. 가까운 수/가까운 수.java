import java.util.*;

class Solution {
    public static int solution(int[] array, int n) {
        int closest = array[0];
        int minDiff = Math.abs(array[0] - n);

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);

            if (diff < minDiff || (diff == minDiff && array[i] < closest)) {
                minDiff = diff;
                closest = array[i];
            }
        }

        return closest;
    }
}