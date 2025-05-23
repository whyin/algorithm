class Solution {
    public int solution(int n) {
        int[] result = new int[n];
        int answer = 1;//9;

        for (int i = 1; i <= n; i++) {

            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                if (answer % 3 == 0) {
                    answer++;
                }

                if (String.valueOf(answer).contains("3")) {
                    answer++;
                }
            }
            result[i-1] = answer++;
        }
        return result[n-1];
    }
}