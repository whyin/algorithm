import java.util.*;

class Solution {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            int temp = 0;

            if (Character.isDigit(dartResult.charAt(i))) {
                int num = dartResult.charAt(i) - '0';

                if (i + 1 < dartResult.length() &&
                        dartResult.charAt(i) == '1' &&
                        dartResult.charAt(i + 1) == '0') {
                    stack.add(10);
                    i++;
                    continue;
                }
                stack.add(num);
                continue;
            }

            if (dartResult.charAt(i) == 'S') {
                temp = stack.pop();
                stack.add(temp);

            } else if (dartResult.charAt(i) == 'D') {
                temp = stack.pop();
                temp *= temp;
                stack.add(temp);
            } else if (dartResult.charAt(i) == 'T') {
                temp = stack.pop();
                temp = temp * temp * temp;
                stack.add(temp);
            }


            if (dartResult.charAt(i) == '*') {
                int cur = stack.pop() * 2;
                if (!stack.isEmpty()) {
                    int prev = stack.pop() * 2;
                    stack.add(prev);
                }
                stack.add(cur);

            } else if (dartResult.charAt(i) == '#') {
                stack.add(-stack.pop());
            }
        }

        for (int n : stack) {
            answer += n;
        }
        return answer;
    }
}