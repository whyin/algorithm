
class Solution {
    public long solution(int balls, int share) {
        share = Math.max(balls - share, share);
        if(share == 0) return 1;
        
        long result = solution(balls-1,share-1);
        result *= balls;
        result /= share;
        
        return result;
    }
}