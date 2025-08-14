class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;

        /* 
        4 -> 2 -> 1 
        7 -> 4 -> 2 -> 1
        */
        
        
        while(true) {
            if (a == b) break;
            
            if (a != 1) {
                if (a % 2 == 1) {
                    a += 1;
                }
                a /= 2;
            }
            
            if (b != 1) {
                if (b % 2 == 1) {
                    b += 1;
                }
                b /= 2;
            }
            answer++;
        }        

        return answer;
    }
}