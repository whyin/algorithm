class Solution {
    public int solution(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if ((n - 1) % i == 0) {
                return i;
            }
        }
        return 0;
    }
}