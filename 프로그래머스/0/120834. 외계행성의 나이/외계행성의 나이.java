class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(age);

        for (char c : str.toCharArray()) {
            int num = c - '0';
            char en = (char) ('a' + num);
            sb.append(en);
        }

        return sb.toString();
    }
}