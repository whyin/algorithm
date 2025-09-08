/*
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
*/
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        int len = answers.length;

        for (int i = 0; i < len; i++) {
            if (arr1[i % arr1.length] == answers[i]) count1++;
            if (arr2[i % arr2.length] == answers[i]) count2++;
            if (arr3[i % arr3.length] == answers[i]) count3++;
        }

        int max = Math.max(Math.max(count1, count2), count3);

        List<Integer> list = new ArrayList<>();
        if (max == count1) list.add(1);
        if (max == count2) list.add(2);
        if (max == count3) list.add(3);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}