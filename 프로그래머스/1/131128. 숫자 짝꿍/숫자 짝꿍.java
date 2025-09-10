import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for (char c : X.toCharArray()) {
            arrX[c - '0']++;
        }
        
        for (char c : Y.toCharArray()) {
            arrY[c - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0 ; i--) {
            int cnt = Math.min(arrX[i], arrY[i]);
            
            for (int j = 0; j < cnt; j++) {
                sb.append(i);
            }
        }
        
        if (sb.length() == 0) return "-1";   
        if (sb.charAt(0) == '0') return "0"; 

        return sb.toString();

        
    }
}