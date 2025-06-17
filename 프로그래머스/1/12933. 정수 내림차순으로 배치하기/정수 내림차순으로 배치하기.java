import java.util.*;
class Solution {
    public long solution(long n) {
        
        String[] s = (String.valueOf(n)).split("");
        Integer[] arr = new Integer[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return Long.parseLong(sb.toString());
    }
}