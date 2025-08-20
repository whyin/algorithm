class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int index = section[0] + m - 1;
        
        for (int i = 1; i < section.length; i++) { //
           
            if (section[i] <= index) continue; //4
            
            answer++; // 1
            index = section[i] + m - 1; // 2
        }        
        return answer;
    }
}