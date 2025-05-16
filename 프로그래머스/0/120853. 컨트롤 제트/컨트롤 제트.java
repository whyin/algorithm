import java.util.*;
class Solution {
    public int solution(String s) {
        String[] tokens = s.split(" ");
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("Z")) {
                if (!stack.isEmpty()) {
                    sum -= stack.pop();  // 바로 전 숫자 제거
                }
            } else {
                int num = Integer.parseInt(token);
                sum += num;
                stack.push(num);  // 되돌릴 수 있도록 저장
            }
        }

        return sum;
    }
}