class Solution {
    public int solution(int a, int b) {
        int A = a;
        int B = b;
        
        while (B != 0) {
            int temp  = A % B;
            A = B;
            B = temp;
        }
        
        int gcd = A;
        b /= gcd;

        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        return (b == 1) ? 1 : 2;
    }
}