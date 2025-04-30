class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer1 = 1;

        if (num_list.length > 10) {
            for (int i : num_list) {
                answer += i;
            }
        } else {
            for (int i : num_list) {
                answer1 *= i;
            }
        }

        return num_list.length > 10 ? answer : answer1; 
    }
}