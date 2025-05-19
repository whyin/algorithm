import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            
            int left = Integer.parseInt(split[0]);
            int right = Integer.parseInt(split[2]);
            int expected = Integer.parseInt(split[4]);
            int result = 0;

            if (split[1].equals("+")) {
                result = left + right;
            } else {
                result = left - right;
            }

            if (result == expected) {
                answer[i] ="O";
            } else {
                answer[i] ="X";
            }
        }

        return answer;
    }
}