import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        /* s.chars()
                .mapToObj(n -> (char) n)
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining()); */
        return String.join("", arr);
        
        
    }
}