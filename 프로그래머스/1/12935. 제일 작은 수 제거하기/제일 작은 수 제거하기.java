import java.util.*;

class Solution {
    
    public int[] solution(int[] arr) {
        if(arr.length ==1) return new int[]{-1};

        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        List<Integer> list = new ArrayList<>();
        boolean removed = false;
        for (int num : arr) {
            if (num == min && !removed) {
                removed = true;
                continue;
            }
            list.add(num);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }
}