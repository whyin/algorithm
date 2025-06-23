class Solution {
    public int[] solution(int n, int m) {
        int gcd = 0;
        int lmc = 0;

        int a = n;
        int b = m;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a;
        lmc = (n * m) / a; 

        return new int[]{gcd, lmc};
    }
}