import java.util.*;

class Solution {
    public static int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed() // int -> Integer
                .sorted((a, b) -> {
                    int distA = Math.abs(a - n);
                    int distB = Math.abs(b - n);
                    if (distA == distB) {
                        return b - a; // 더 큰 수를 앞에
                    } else {
                        return distA - distB; // n과의 거리로 오름차순
                    }
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}