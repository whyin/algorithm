class Solution {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n); //n의 제곱근 
        return (sqrt * sqrt == n) ? 1 : 2;
    }
}