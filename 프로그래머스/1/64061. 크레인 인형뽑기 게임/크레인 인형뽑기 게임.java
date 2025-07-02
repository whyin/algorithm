import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        // 1. moves 에 있는 값들 탐색
        // 2. 보드에 있는 [i][m+1]
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][m - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[i][m - 1]) {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.add(board[i][m - 1]);
                    }
                    board[i][m - 1] = 0;
                    break;
                }
            }
        }
        return count;
    }
}