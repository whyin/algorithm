class Solution {
    public String solution(String s, int n) {
        // 아스키코드로 char
        // Z일 경우 고려 (a: 97; z: 122, A: 65; Z: 90) 
        
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){answer += " ";} else if ((int) s.charAt(i) <= 90) {
                answer += (int) s.charAt(i) + n <= 90 ? (char) (s.charAt(i) + n) : (char)( s.charAt(i) + (n - 26));
            } else {
                answer += (int) s.charAt(i) + n <= 122 ? (char) (s.charAt(i) + n) : (char) (s.charAt(i) + (n - 26));
            }
        }
        return answer;
    }
}