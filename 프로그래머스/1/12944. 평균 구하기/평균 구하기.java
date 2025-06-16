class Solution {
    public double solution(int[] arr) {
        int len = arr.length;
        double answer = 0;
        for (int i : arr) {
            answer += i;
        }
        return answer / len;
    }
}