import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            for (int j = 0; j < n; j++) {
                list.add(n);
            }
        }
        return list;
    }
}