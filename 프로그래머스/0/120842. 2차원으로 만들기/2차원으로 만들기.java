class Solution {
    public int[][] solution(int[] num_list, int n) {
        int num = num_list.length / n;
        int[][] answer = new int[num][n];
        int a = 0;
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[a];
                a++;
            }
        }
        return answer;
    }
}