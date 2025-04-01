class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] list = number.split("");
        for (String s : list) {
            sum += Integer.parseInt(s);
        }
        answer = sum % 9;
        return answer;
    }
}