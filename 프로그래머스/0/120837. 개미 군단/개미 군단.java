class Solution {
    public int solution(int hp) {
        int five = hp / 5;
        hp %= 5;

        int three = hp / 3;
        hp %= 3;
        
        return five + three + hp;
    }
}