import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int n : arr) {
            
            if (stack.isEmpty()) {
                stack.add(n);
                continue;
            }

            if (stack.peek() == n) {
                continue;
            } else {
                stack.add(n);
            } 
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}