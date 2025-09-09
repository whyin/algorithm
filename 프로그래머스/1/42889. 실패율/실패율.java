import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] challenger = new int[N + 2];

        for (int s : stages) {
            challenger[s]++;
        }

        int totalPlayers = stages.length;
        double[][] failArr = new double[N][2];

        for (int i = 1; i <= N; i++) {
            double failRate = 0;
            if (totalPlayers != 0) {
                failRate = (double) challenger[i] / totalPlayers;
            }
            failArr[i - 1][0] = i;
            failArr[i - 1][1] = failRate;
            totalPlayers -= challenger[i];
        }
        
        Arrays.sort(
                failArr, (a, b) -> {
                    if (a[1] == b[1]) {
                        return Double.compare(a[0], b[0]);
                    }
                    return Double.compare(b[1], a[1]);
                });

        for (int i = 0; i < N; i++) {
            answer[i] = (int) failArr[i][0];
        }
        return answer;
    }
}