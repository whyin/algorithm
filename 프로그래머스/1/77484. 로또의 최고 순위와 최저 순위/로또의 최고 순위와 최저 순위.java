class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int win = 0;
        int zero = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        win++;
                    }
                }
            }
        }
        
        int maxRank = (win + zero) >= 2 ? 7 - (win + zero) : 6;
        int minRank = win >= 2 ? 7 - win : 6;
        
        return new int[]{maxRank, minRank};
    }
}