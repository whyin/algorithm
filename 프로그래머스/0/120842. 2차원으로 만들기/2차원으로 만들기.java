class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length;
        
        int[][] arr = new int[len/n][n];
        
        int index = 0;
        
        for (int i = 0; i < len; i++) {
            arr[i/n][i%n] = num_list[i];
        }
        return arr;
    }
}