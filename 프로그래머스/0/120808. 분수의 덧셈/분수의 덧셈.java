class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int denom = denom1 * denom2;
        int num = (numer1 * denom2) + (numer2 * denom1);

        int a = denom, b = num;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int[] answer = new int[2];
        answer[0] = num / a; answer[1] = denom / a;
        
        return answer;

    }
}