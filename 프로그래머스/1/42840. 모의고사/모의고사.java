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
        
        int countArr1 = 0;
        int countArr2 = 0;
        int countArr3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (arr1[i % arr1.length] == answers[i % answers.length]) countArr1++;
            if (arr2[i % arr2.length] == answers[i % answers.length]) countArr2++;
            if (arr3[i % arr3.length] == answers[i % answers.length]) countArr3++;
        }
        
        int max = Math.max(Math.max(countArr1, countArr2), countArr3);
        
        List<Integer> list = new ArrayList<>();
        if (countArr1 == max) list.add(1);
        if (countArr2 == max) list.add(2);
        if (countArr3 == max) list.add(3);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}