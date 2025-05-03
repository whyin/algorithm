class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        String replace = myString.replace('A', 'X')
                .replace('B', 'A')
                .replace('X', 'B');

        if (replace.contains(pat)) {
            answer = 1;
        }

        return answer;
    }
}