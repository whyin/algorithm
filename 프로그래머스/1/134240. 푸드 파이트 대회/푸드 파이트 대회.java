class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            String temp = "";
            String sum = "";
            
            if (food[i] > 1) {  // 7
                int n = (food[i] / 2) * 2;
                sum += String.valueOf(i).repeat(n);
                System.out.print("sum: " + sum);
            }
            
            answer = answer.substring(0, answer.length() / 2) + sum + answer.substring(answer.length() / 2);
            
            if (i == food.length - 1) {
                answer = answer.substring(0, answer.length() / 2) + "0" + answer.substring(answer.length() / 2);
            }
            
        }
        return answer;
    }
}