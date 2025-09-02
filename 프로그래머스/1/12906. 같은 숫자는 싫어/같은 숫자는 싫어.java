import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int prev = arr[0];
        list.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (prev == arr[i]) {
                continue;
            }
            
            prev = arr[i];
            list.add(arr[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}