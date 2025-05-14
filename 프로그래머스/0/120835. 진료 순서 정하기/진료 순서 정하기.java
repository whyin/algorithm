import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];

        // 인덱스와 값을 함께 저장할 배열 생성
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // 인덱스를 emergency 값 기준으로 내림차순 정렬
        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return emergency[o2] - emergency[o1]; // 응급도 높은 순서
            }
        });

        // 정렬된 순서대로 순위 부여
        for (int i = 0; i < n; i++) {
            int index = indices[i];  // 정렬된 순서의 원래 인덱스
            answer[index] = i + 1;   // 진료 순서는 1부터 시작
        }

        return answer;
    }
}