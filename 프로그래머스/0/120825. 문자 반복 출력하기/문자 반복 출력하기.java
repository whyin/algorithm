class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (Object s : my_string.toCharArray()) {
            for (int i = 0; i < n; i++) {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}