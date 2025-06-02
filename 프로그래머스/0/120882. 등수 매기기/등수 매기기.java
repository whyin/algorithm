import java.util.Arrays;
class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] avg = new int[len]; // 평균 저장
        Integer[] indices = new Integer[len]; // 인덱스 저장용

        for (int i = 0; i < len; i++) {
            avg[i] = score[i][0] + score[i][1]; // 평균 대신 총점 (어차피 비교용)
            indices[i] = i;
        }

        // 총점 기준 내림차순 정렬 (인덱스 배열 정렬)
        Arrays.sort(indices, (a, b) -> avg[b] - avg[a]);

        int[] rank = new int[len];
        for (int i = 0; i < len; i++) {
            if (i > 0 && avg[indices[i]] == avg[indices[i - 1]]) {
                // 같은 점수면 같은 등수
                rank[indices[i]] = rank[indices[i - 1]];
            } else {
                // 아니라면 등수는 i + 1
                rank[indices[i]] = i + 1;
            }
        }

        return rank;
    }
}