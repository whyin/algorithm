class Solution {
    public int solution(int[] arr) {

        int lmc = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lmc = lmc(lmc, arr[i]);
        }
        return lmc;
    }

    public int lmc(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int gcd(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    
}