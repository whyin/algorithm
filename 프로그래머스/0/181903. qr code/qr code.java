class Solution {
    public static String solution(int q, int r, String code) {
        String answer = "";
        for (int i = r; i < code.length(); i+=q) {
            answer += code.charAt(i);
        }
        return answer;
    }
}