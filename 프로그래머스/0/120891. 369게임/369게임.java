class Solution {
    public int solution(int order) {
        String str = String.valueOf(order);
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '3' || ch == '6' || ch == '9') {
                count++;
            }
        }
        return count;
    }
}