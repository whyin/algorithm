class Solution {
    public int solution(int n) {
        String[] split = String.valueOf(n).split("");
        int answer = 0;
        for (String s : split) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}