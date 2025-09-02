import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        
        for (String str : s.split(" ")) {
            if (str.equals("Z") && !stack.isEmpty()) stack.pop();
            else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.stream().mapToInt(Integer::intValue).sum();
        
    }
}