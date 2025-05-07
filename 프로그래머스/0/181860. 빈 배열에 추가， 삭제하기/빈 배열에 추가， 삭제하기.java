import java.util.ArrayList;
import java.util.List;

class Solution {
    public  List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];

            if (flag[i] == true) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(n);
                }
            } else if (flag[i] == false) {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        return list;
    }
}