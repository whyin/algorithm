class Solution {
    public int solution(int[] numbers) {
        int numSum = 45;
        for (int n : numbers) {
            numSum -= n;
        }
        return numSum;
    }
}