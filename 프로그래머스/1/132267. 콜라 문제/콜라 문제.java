class Solution {
    public int solution(int a, int b, int n) {
        
        int coke = n; // 콜라의 초기 값
        int countCoke = 0; // 더해진 콜라
        int resultCoke = 0;
        
        while(coke >= a) {
            countCoke = (coke / a) * b;
            System.out.println("countCoke: " + countCoke);
            coke = (coke % a) + countCoke;
            System.out.println("coke: " + coke);
            resultCoke += countCoke;
        }
        
        return resultCoke;
    }
}