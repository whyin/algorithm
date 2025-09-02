class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                index = 0;
                continue;
            } else {
                if (index % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                index++;
            }
        }
        return sb.toString();
    }
}