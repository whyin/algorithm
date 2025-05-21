class Solution {
    public int solution(int[][] dots) {
        int num1= 0, num2 = 0;

        for (int i = 1; i < dots.length; i++) {
            if (dots[0][0] == dots[i][0]) {
                num1 = Math.abs(dots[0][1] - dots[i][1]);
                break;
            }
        }
        for (int i = 1; i < dots.length; i++) {
            if (dots[0][1] == dots[i][1]) {
                num2 = Math.abs(dots[0][0] - dots[i][0]);
                break;
            }
        }

        return num2 * num1;
    }
}