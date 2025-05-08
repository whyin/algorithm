class Solution {
    public int solution(String num_str) {
        String[] split = num_str.split("");
        int sum = 0;
        for (String s : split) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}