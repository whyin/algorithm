import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list, int n) {
    int[] answer1 = Arrays.copyOfRange(num_list, n, num_list.length); // 뒤쪽
    int[] answer2 = Arrays.copyOfRange(num_list, 0, n);               // 앞쪽

    int[] answer = new int[num_list.length];

    // answer1 복사
    for (int i = 0; i < answer1.length; i++) {
        answer[i] = answer1[i];
    }

    // answer2 복사
    for (int i = 0; i < answer2.length; i++) {
        answer[answer1.length + i] = answer2[i];
    }

    return answer;
}

}