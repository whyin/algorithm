class Solution {
    
    public int solution(int[][] sizes) {
        int maxW = 0; // 긴 변들의 최댓값
        int maxH = 0; // 짧은 변들의 최댓값

        for (int[] s : sizes) {
            int longer = Math.max(s[0], s[1]);
            int shorter = Math.min(s[0], s[1]);

            if (longer > maxW) maxW = longer;
            if (shorter > maxH) maxH = shorter;
        }

        return maxW * maxH;
    }
}

