import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int max1 = Math.max(numbers[0], numbers[1]);
        int max2 = Math.min(numbers[0], numbers[1]);
        
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > max1) {
                max2 = max1;
                max1 = numbers[i];
            } else if (numbers[i] > max2) {
                max2 = numbers[i];
            }
        }
        return max1 * max2;
    }
}