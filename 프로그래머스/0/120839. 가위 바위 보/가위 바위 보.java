class Solution {
    public String solution(String rsp) {
        //가위: 2 바위: 0 보: 5
        String answer = "";

        for (char c : rsp.toCharArray()) {
            if (c == '2') {
                answer += "0";
            } else if (c == '0') {
                answer += "5";
            } else if (c == '5') {
                answer += "2";
            }
        }
        return answer;
    }
}