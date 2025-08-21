import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 스코어를 내림차순 정렬
        // m개씩 자르기
        // 가장 작은 인덱스 값 * m
        
        int answer = 0;
        Arrays.sort(score);
        
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
}