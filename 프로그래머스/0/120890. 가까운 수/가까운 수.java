import java.util.*;

class Solution {
    public static int solution(int[] array, int n) {
        // 초기값
        int diff = Math.abs(array[0] - n);
        int answer = array[0];
        
        for (int i = 1; i < array.length; i++) {
            
            if (diff > Math.abs(array[i] - n)) {
                diff = Math.abs(array[i] - n);
                answer = array[i];
            } else if (diff == Math.abs(array[i] - n)) {
                answer = Math.min(answer, array[i]);
            }
            
        }
        return answer;
    }
}