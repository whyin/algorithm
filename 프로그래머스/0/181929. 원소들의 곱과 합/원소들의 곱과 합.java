class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1;
        int sum2 = 0;

        for (int n : num_list) {
            sum *= n;
            sum2 += n;
        }
        answer = sum < sum2 * sum2 ? 1 : 0;
        return answer;
    }
}