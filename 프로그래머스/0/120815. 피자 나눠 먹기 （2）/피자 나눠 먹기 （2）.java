class Solution {
    public int solution(int n) {
        int pizza = 6;
        int a = n;

        //최대공약수
        while (pizza != 0) {
            int temp = pizza;
            pizza = a % pizza;
            a = temp;
        }
        //a: 최대공약수

        //최소공배수
        int lmc = (n * 6) / a;
        return lmc / 6;
    }
}