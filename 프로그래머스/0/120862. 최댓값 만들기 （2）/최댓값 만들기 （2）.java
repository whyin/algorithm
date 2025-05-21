import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int length = numbers.length;
        Arrays.sort(numbers);
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[length-1] * numbers[length-2];
        Math.max(num1, num2);
        int answer = 0;
        return Math.max(num1, num2);
    }
}