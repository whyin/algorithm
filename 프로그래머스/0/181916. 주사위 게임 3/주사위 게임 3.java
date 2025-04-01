import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] list = {a, b, c, d};
        Arrays.sort(list);

        int answer = 0;

        if (list[0] == list[3]) {
            // 모두 같을 경우
            answer = 1111 * list[0];
        } else if ((list[0] == list[2]) || (list[1] == list[3])){
            // 세 주사위가 같을 경우
            if (list[0] == list[2]) {
                answer = (10 * list[0] + list[3]) * (10 * list[0] + list[3]);
            } else {
                answer = (10 * list[3] + list[0]) * (10 * list[3] + list[0]);
            }
        } else if ((list[0] == list[1]) && (list[2] == list[3])) {
            // 두 개씩 같은 값일 경우
            answer = ((list[0] + list[3]) * (list[3] - list[0]));
        } else if ((list[0] == list[1]) || (list[1] == list[2]) || (list[2] == list[3])) {
            // 두 개가 같고 나머지가 다를 경우
            if ((list[0] == list[1])) {
                answer = list[2] * list[3];
            } else if ((list[1] == list[2])) {
                answer = list[0] * list[3];
            } else if ((list[2] == list[3])) {
                answer = list[0] * list[1];
            }
        } else {
            // 다 다를 경우
            answer = list[0];
        }
        return answer;
    }
}