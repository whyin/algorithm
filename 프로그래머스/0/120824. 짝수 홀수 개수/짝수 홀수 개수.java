class Solution {
    public int[] solution(int[] num_list) {
        int a = 0, b = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }

        return new int[]{a, b};
    }
}