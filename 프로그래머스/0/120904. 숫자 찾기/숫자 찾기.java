class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] split = String.valueOf(num).split("");
        for (int i = 0; i < split.length; i++) {
            if (Integer.parseInt(split[i]) == k) {
                answer = i+ 1;
                break; 
                
            } else {
                answer = -1;
            }
        }

    
        return answer;
    }
}