class Solution {    
    public String solution(String s, int n) {
        // Z일 경우 고려 (a: 97; z: 122, A: 65; Z: 90) 
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result += " ";
            } else if ((int) s.charAt(i) <= 90) {
                result += (int) s.charAt(i) + n <= 90 ? (char) (s.charAt(i) + n) : (char) (s.charAt(i) + (n - 26)); 
            } else {
                result += (int) s.charAt(i) + n <= 122 ? (char) (s.charAt(i) + n) : (char) (s.charAt(i) + (n - 26));
            }
        }
        return result;
    }
}