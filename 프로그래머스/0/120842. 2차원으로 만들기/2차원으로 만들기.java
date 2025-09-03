class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        
        int[][] arr = new int[len][n];
        
        int index = 0;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = num_list[index];
                index++;
            }
        }
        return arr;
    }
}