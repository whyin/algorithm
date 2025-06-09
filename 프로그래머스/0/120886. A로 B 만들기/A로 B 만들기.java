import java.util.*;

class Solution {
    public int solution(String before, String after) {
        // 문자열 → 문자 배열
        char[] bArr = before.toCharArray();
        char[] aArr = after.toCharArray();

        // 정렬
        Arrays.sort(bArr);
        Arrays.sort(aArr);

        // 정렬된 배열이 같으면 순서만 다른 것
        return Arrays.equals(bArr, aArr) ? 1 : 0;
        
    }
}