class Solution {
    public int solution(int[][] board) {
        int len = board.length;
        int[][] danger = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 1) {
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            int nx = i + dx;
                            int ny = j + dy;

                            if (nx >= 0 && nx < len && ny >= 0 && ny < len) {
                                danger[nx][ny] = 1;
                            }
                        }
                    }
                }
            }
        }
        int answer = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (danger[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;

    }
}