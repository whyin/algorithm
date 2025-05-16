import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> primeFactors = new TreeSet<>(); // 중복 제거 + 자동 오름차순 정렬

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                primeFactors.add(i);  // i는 소인수
                n /= i;               // n을 계속 나눔
            }
        }

        if (n > 1) {
            primeFactors.add(n);  // 마지막에 남은 n이 소수일 수 있음
        }

        // Set → int[]
        return primeFactors.stream().mapToInt(i -> i).toArray();
    }
}