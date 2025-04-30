class Solution {
    public static int solution(int[] num_list) {
        int total = 0;

        for (int n : num_list) {
            while (n > 1) {
                n = n / 2;
                total++;
            }
        }

        return total;
    }
}