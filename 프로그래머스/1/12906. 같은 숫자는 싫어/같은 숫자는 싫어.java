import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int prev = -1;
        
        for (int n : arr) {
            if (prev != n) {
                list.add(n);
                prev = n;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
       
    }
}