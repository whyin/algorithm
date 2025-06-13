class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;

        int len = A.length();

        for (int i = 0; i < len; i++) {
            int n = i % len;
            String newString = A.substring(len - n) + A.substring(0, len - n);
            if (newString.equals(B)) {
                return i; 
            }
        }
        return -1;
    }
}