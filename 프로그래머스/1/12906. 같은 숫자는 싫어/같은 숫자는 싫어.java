import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int prev = -1;
        
        for (int n : arr) {
            if (prev != n) {
                list.add(n);
                prev = n;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
       
    }
    public int[] solution1(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int n : arr) {
            if (stack.isEmpty() || stack.peek() != n) {
                stack.push(n);
            }
        }
        
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}