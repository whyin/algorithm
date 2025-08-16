import java.util.*;

class Solution {
    /*
    [[0,0,0,0,0],
    [0,0,1,0,3],
    [0,2,5,0,1],
    [4,2,4,4,2],
    [3,5,1,3,1]]
    */
    public int solution(int[][] board, int[] moves) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int n : moves) { // 1
            for (int i = 0; i < board.length; i++) {
                if (board[i][n-1] != 0) {
                    if(!stack.isEmpty() && stack.peek() == board[i][n-1]) {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.add(board[i][n-1]);
                    }
                    board[i][n-1] = 0;
                    break;
                }
            }
        }
        return count;
    }
}