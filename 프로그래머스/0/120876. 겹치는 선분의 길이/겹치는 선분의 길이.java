class Solution {
    public int solution(int[][] lines) {
        int[] map = new int[201]; // 좌표 -100 ~ 100 → 인덱스 0 ~ 200

        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            for (int i = start; i < end; i++) {
                map[i]++; // 선분이 지나가는 구간 표시
            }
        }

        int answer = 0;
        for (int count : map) {
            if (count >= 2) answer++; // 겹치는 구간만 센다
        }

        return answer;
    }
}