class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zero = 0;
        
        
        while (! s.equals("1")) {
            int len = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '0') zero++;
                else len++;
            }
            
            s = Integer.toBinaryString(len);
            
            count++;
        }
        return new int[]{count, zero};
    }
}